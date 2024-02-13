package com.rocketseat.certification_nlw.modules.students.services;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.CheckCertificationDTO;

@Service
public class CheckIfHasCertificationService {
    
    public boolean execute(CheckCertificationDTO data){
        if(data.getEmail().equals("rdn.adn00@gmail.com") && data.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
