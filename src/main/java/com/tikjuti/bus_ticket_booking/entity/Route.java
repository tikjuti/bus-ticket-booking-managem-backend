package com.tikjuti.bus_ticket_booking.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String departureLocation;
    String arrivalLocation;
    String departurePoint;
    String arrivalPoint;
    int distance;
    int duration;
}
