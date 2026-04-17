package com.jingheng.taxiapp.service;

import org.springframework.stereotype.Service;

import com.jingheng.taxiapp.websocket.VehicleWebsocketHandler;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleRealtimeService {
    private final VehicleWebsocketHandler handler;

    /**
     * Receive telemetry data from emulator and send it via websocket
     */
    public void onTelemetryReceived(){
        String payload = """
                
            {
              "vehicleId": 1,
              "currentPosition": {
                "lon": -6.2603,
                "lat": 53.3498
              },
              "speed": 42.5,
              "heading": 180.0,
              "state": "RUNNING",
              "reportedAt": "2026-04-16T12:00:00Z"
            }
                """;
        handler.broadcastVehicleTelemetry(payload);
    }
}
