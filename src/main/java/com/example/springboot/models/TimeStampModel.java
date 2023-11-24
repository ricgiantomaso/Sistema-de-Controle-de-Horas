package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;

import java.util.Locale;
import java.util.UUID;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "time_stamps")
public class TimeStampModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idTimeStamp;
    private String timeStamp = generateTimeStamp();
    private String name;
    private String role;

    public UUID getIdTimeStamp() {
        return idTimeStamp;
    }

    public void setIdTimeStamp(UUID idTimeStamp) {
        this.idTimeStamp = idTimeStamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String generateTimeStamp(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        timeStamp = myDateObj.format(formattedDate);
        return timeStamp;
    }
}
