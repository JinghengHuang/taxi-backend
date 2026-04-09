# Taxi Fleet Management System (Real-time Geospatial Platform)

A full-stack, real-time fleet management system with geospatial visualization and streaming data capabilities.
This project aims to simulate a production-like vehicle tracking platform, combining backend services, real-time communication, and interactive map visualization.

---

## Overview

This system provides a real-time monitoring platform for vehicle fleets, supporting:

* Live vehicle tracking on map
* Real-time data streaming via WebSocket
* Geospatial data storage and query (PostGIS)
* Backend-driven state management
* Extensible architecture for alerting and dispatching

The project is designed not as a simple demo, but as a **miniature representation of a real-world fleet / telematics system**.

---

## System Architecture

The system follows a **frontend-backend separated architecture**, with streaming data and modular services.

```md
Simulator → Backend API → Database → WebSocket → Frontend (Map UI)
```

### Components

* **Simulator**

  * Generates vehicle telemetry data (position, speed, status)
  * Simulates real-time streaming

* **Backend (Spring Boot)**

  * REST APIs for management & query
  * WebSocket server for real-time updates
  * Business logic layer (vehicles, telemetry, alerts)

* **Database (PostgreSQL + PostGIS)**

  * Stores vehicle state and trajectory
  * Supports spatial queries

* **Frontend (React + TypeScript)**

  * Interactive map visualization
  * Real-time vehicle updates
  * Management dashboard

* **Nginx (Gateway)**

  * Reverse proxy for API and WebSocket
  * Static frontend serving

---

## Map Visualization Layer

The frontend map is designed with an abstraction layer to support multiple engines:

* 2D rendering via OpenLayers
* 3D visualization via Cesium (planned)

A unified interface is used to decouple business logic from map implementation, enabling flexible rendering strategies.

---

## Core Features

### 1. Real-time Vehicle Tracking

* Streaming vehicle position updates
* WebSocket-based push model
* Smooth UI updates on map

---

### 2. Geospatial Data Management

* Storage of location and trajectory
* Spatial queries using PostGIS
* Foundation for geofencing and analytics

---

### 3. Modular Backend Design

* Layered architecture (controller / service / repository)
* Clear separation between API and streaming logic
* Extensible for future features (alerts, dispatch)

---

### 4. Simulation-driven Architecture

* Independent data generator (Python-based)
* Enables testing without external hardware/devices
* Simulates realistic vehicle movement patterns

---

### 5. Container-ready Deployment

* Designed for containerized deployment (Docker)
* Services can be orchestrated via Docker Compose
* Ready for CI/CD integration

---

## Tech Stack

### Frontend

* React + TypeScript
* OpenLayers (2D map)
* Cesium (planned 3D)
* WebSocket client

### Backend

* Spring Boot
* Spring Web / WebSocket
* Spring Data JPA

### Data & Infrastructure

* PostgreSQL + PostGIS
* Redis (planned for caching)
* Kafka (planned for streaming pipeline)

### DevOps

* Docker / Docker Compose
* Nginx
* GitHub Actions (CI)

---

## Roadmap

### Phase 1 (MVP)

* Basic vehicle simulation
* REST API + WebSocket
* 2D map real-time visualization
* Simple management interface

---

### Phase 2 (Enhancements)

* Large-scale simulation
* Alert system (e.g., geofence / overspeed)
* Role-based access control
* 3D visualization (Cesium)

---

### Future Extensions

* Event-driven architecture (Kafka)
* Distributed scaling
* Advanced analytics & prediction
* Real-world data integration

---

## Design Goals

* **Real-time first**: prioritize streaming data over polling
* **Geospatial-aware**: treat location as a core data type
* **Extensible architecture**: allow adding services without refactoring core
* **Production-inspired design**: simulate real system patterns (queue, cache, streaming)

---

## Notes

This project focuses on **system design, real-time data handling, and geospatial engineering**, rather than UI completeness.

It is intended to demonstrate:

* Backend architecture skills
* Real-time system design
* Integration of multiple technologies
* Engineering trade-offs and scalability considerations

---

## 📌 Status

🚧 In active development
