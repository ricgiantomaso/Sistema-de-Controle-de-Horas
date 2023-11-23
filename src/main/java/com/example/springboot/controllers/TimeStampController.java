package com.example.springboot.controllers;


import com.example.springboot.dtos.TimeStampRecordDto;
import com.example.springboot.models.TimeStampModel;
import com.example.springboot.repositories.TimeStampRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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



}
