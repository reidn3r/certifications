package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.dto.CheckCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.services.CheckIfHasCertificationService;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private CheckIfHasCertificationService checkIfHasCertificationService;

    @PostMapping("/check/certification")
    public boolean checkIfHasCertification(@RequestBody CheckCertificationDTO data){
        return this.checkIfHasCertificationService.execute(data);
    }
}
