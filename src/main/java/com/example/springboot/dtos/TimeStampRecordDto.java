package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jdk.jfr.Timestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public record TimeStampRecordDto(
        @NotBlank @NotNull String name,
        @NotBlank @NotNull String role){}


