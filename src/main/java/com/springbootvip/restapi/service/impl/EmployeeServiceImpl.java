package com.springbootvip.restapi.service.impl;

import com.springbootvip.restapi.dto.EmployDTO;
import com.springbootvip.restapi.entity.Emplyee;
import com.springbootvip.restapi.mapper.EmloyeeMapper;
import com.springbootvip.restapi.rep.EmployRepository;
import com.springbootvip.restapi.service.EmployService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployService {
    private EmployRepository employRepository;
    // lý do tại sao ở đây sử dụng DI là vì để cho các biến
    // không phụ thuộc vào
    //employRepository nữa (nhớ là this.employRepository và truyền biến vô để nó ko phụ thuộc nũa)
    @Override
    public EmployDTO createEmploy(EmployDTO employDTO) {
        Emplyee emplyee = EmloyeeMapper.mapToemployee(employDTO);//chuyen xuong database
        Emplyee savedEmploy= employRepository.save(emplyee);
        return EmloyeeMapper.mapToDTOemployee(savedEmploy);//show cho client

    }
}
