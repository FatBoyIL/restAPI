package com.springbootvip.restapi.mapper;

import com.springbootvip.restapi.dto.EmployDTO;
import com.springbootvip.restapi.entity.Emplyee;
//dong vai tro nhu 1 api cua dto va entity
public class EmloyeeMapper {
    public static EmployDTO mapToDTOemployee(Emplyee emplyee){
        return new EmployDTO(emplyee.getId(), emplyee.getFname(), emplyee.getLname(), emplyee.getEmail());
    }

    public static Emplyee mapToemployee(EmployDTO employDTO){
        return new Emplyee(employDTO.getId(), employDTO.getFname(), employDTO.getLname(), employDTO.getEmail());
    }
}
