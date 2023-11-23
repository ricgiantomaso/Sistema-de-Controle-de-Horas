package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;

import java.sql.Timestamp;
import java.util.UUID;


@Entity
@Table(name = "time_stamps")
public class NoteTime implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idTimeStamp;
    private String name;
    private String role;
    private Timestamp timeStamp;

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

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
