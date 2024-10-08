package com.tikjuti.bus_ticket_booking.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.sql.Timestamp;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleResponse {
    String id;
    int seatCount;
    String licensePlate;
    String vehicleName;
    String color;
    String status;
    Timestamp createdAt;
    VehicleTypeResponse vehicleType;
    Set<SeatResponse> seats;
}
