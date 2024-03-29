package com.rocketseat.certification_nlw.modules.students.domain;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_students")
public class StudentDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;    

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "studentDomain")
    private List<CertificationStudentDomain> certificationStudentDomain;
}
