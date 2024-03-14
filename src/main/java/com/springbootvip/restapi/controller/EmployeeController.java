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

    @GetMapping(path = "/all")
    public ResponseEntity<List<EmployDTO>> getONEEmploy() {
        List<EmployDTO> employDTO = employService.getEmployList();
        return ResponseEntity.ok(employDTO);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<EmployDTO> updateEmploy(@PathVariable("id") Long employId,@RequestBody EmployDTO updateEmployDTO) {
        EmployDTO employSaved =employService.updateEmploy(employId,updateEmployDTO);
        return ResponseEntity.ok(employSaved);
    }

    @DeleteMapping(value = "/{idDel}")
    public ResponseEntity<String> deleteEmploy(@PathVariable("idDel") Long employId) {
        employService.deleteEmploy(employId);
        return ResponseEntity.ok("Da xoa Employ co id la " + employId);
    }


}
