package com.jingheng.taxiapp.websocket;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class VehicleWebsocketHandler extends TextWebSocketHandler{
    private final Set<WebSocketSession> sessions = ConcurrentHashMap.newKeySet();
    private static final Logger log = LoggerFactory.getLogger(VehicleWebsocketHandler.class);
    @Override
    public void afterConnectionEstablished(WebSocketSession session){
        sessions.add(session);
        log.info("Connection established: " + session.getId());
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String clientMessage = message.getPayload();
        log.info("Received: " + clientMessage);

        // Echoing back the message
        session.sendMessage(new TextMessage("Server response: " + clientMessage));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        log.info("Connection closed: " + session.getId());
    }

    /**
     * Broadcast message to all sessions
     * @param payload telemetry data in json format
     */
    public void broadcastVehicleTelemetry(String payload) {
        TextMessage message = new TextMessage(payload);
        sessions.removeIf(session -> !session.isOpen());

        for (WebSocketSession session: sessions){
            try {
                session.sendMessage(message);
            } catch (IOException e) {
                log.error("IOException: " + e.getLocalizedMessage());
                try {
                    session.close(CloseStatus.SERVER_ERROR);
                } catch (IOException ignored) {
                }
            }
        }
    }
}
