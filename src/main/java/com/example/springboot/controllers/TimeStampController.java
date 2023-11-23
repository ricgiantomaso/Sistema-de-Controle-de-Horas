package com.example.springboot.controllers;


import com.example.springboot.dtos.TimeStampRecordDto;
import com.example.springboot.models.TimeStampModel;
import com.example.springboot.repositories.TimeStampRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

@RestController
public class TimeStampController {

    @Autowired
    TimeStampRepository timeStampRepository;

    @PostMapping("/timestamps")
    public ResponseEntity<TimeStampModel> saveTimeStamp(@RequestBody @Valid TimeStampRecordDto timeStampRecordDto){
        var timeStampModel = new TimeStampModel();
        BeanUtils.copyProperties(timeStampRecordDto, timeStampModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(timeStampRepository.save(timeStampModel));
    }

    // get all
    @GetMapping("/timestamps")
    public ResponseEntity<List<TimeStampModel>> getAllTimeStamps(){
        return ResponseEntity.status(HttpStatus.OK).body(timeStampRepository.findAll());
    }

    @GetMapping("/timestamps/{id}")
    public ResponseEntity<Object> getOneTimeStamp(@PathVariable(value="id") UUID id) {
        Optional<TimeStampModel> timeStampO = timeStampRepository.findById(id);
        if (timeStampO.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time Stamp not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(timeStampO.get());
    }




}
