package com.springbootvip.restapi.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor //hien thi du lieu nhung khong the tuong tac cho client xem
public class EmployDTO {
    private Long id;
    private String Fname;
    private String Lname;
    private String email;
}
