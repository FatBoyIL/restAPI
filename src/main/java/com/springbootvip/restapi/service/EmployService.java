package com.springbootvip.restapi.service;

import com.springbootvip.restapi.dto.EmployDTO;

import java.util.List;

public interface EmployService {
    EmployDTO createEmploy(EmployDTO employDTO);
    EmployDTO getEmployById(Long employId);

    List<EmployDTO> getEmployList();
}
