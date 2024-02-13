package com.rocketseat.certification_nlw.modules.students.domain;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.Generated;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDomain {
    private UUID id;
    private String email;
    private List<CertificationStudentDomain> certificationStudentDomain;
}
