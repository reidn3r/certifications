package com.rocketseat.certification_nlw.modules.students.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.domain.CertificationStudentDomain;
import com.rocketseat.certification_nlw.modules.students.dto.CheckCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.repository.CertificationRepository;

@Service
public class CheckIfHasCertificationService {

    @Autowired
    private CertificationRepository certificationRepository;

    public boolean execute(CheckCertificationDTO data){
        Optional<List<CertificationStudentDomain>> foundData = this.certificationRepository.findByStudentEmailAndTechnology(data.getEmail(), data.getTechnology());
        return !foundData.isEmpty();
    }
}
