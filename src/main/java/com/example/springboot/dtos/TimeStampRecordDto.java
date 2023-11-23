package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TimeStampRecordDto(@NotBlank @NotNull String name,
                                 @NotBlank @NotNull String role,
                                 @NotBlank @NotNull String timeStamp) {

}
