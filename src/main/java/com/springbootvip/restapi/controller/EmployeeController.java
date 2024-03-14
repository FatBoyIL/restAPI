package com.springbootvip.restapi.controller;

import com.springbootvip.restapi.dto.EmployDTO;
import com.springbootvip.restapi.service.EmployService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController //xu ly hien thi cho client
@RequestMapping("/api/empl")
public class EmployeeController {
    private EmployService employService;

//tao employ mới
    @PostMapping
    public ResponseEntity<EmployDTO> createEmploy( @RequestBody EmployDTO employDTO) {
        EmployDTO  employSaved =employService.createEmploy(employDTO);
        return new ResponseEntity<>(employSaved, HttpStatus.CREATED);
    }
    @GetMapping(value = "/{idTuTao}")
    public ResponseEntity<EmployDTO> getONEEmploy( @PathVariable("idTuTao") Long employId) {
        EmployDTO employDTO = employService.getEmployById(employId);
        return ResponseEntity.ok(employDTO);
    }

}
