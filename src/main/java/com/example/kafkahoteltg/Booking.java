package com.example.kafkahoteltg;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Booking {
    private int id;
    private int userId;
    private String hotelName;
    private String arrivalDate;
}
