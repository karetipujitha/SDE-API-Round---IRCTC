package com.example.isrtc.models;
import java.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long trainId;
    private Date bookingDate;
    // getters and setters
}
