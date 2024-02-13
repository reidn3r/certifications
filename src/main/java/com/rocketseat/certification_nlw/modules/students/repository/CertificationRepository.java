package com.rocketseat.certification_nlw.modules.students.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rocketseat.certification_nlw.modules.students.domain.CertificationStudentDomain;

@Repository
public interface CertificationRepository extends JpaRepository<CertificationStudentDomain, UUID>{
    
    @Query("SELECT csd FROM CertificationStudentDomain csd INNER JOIN csd.studentDomain AS std WHERE std.email = :email AND csd.technology = :technology")
    Optional<List<CertificationStudentDomain>> findByStudentEmailAndTechnology(String email, String technology);
    }
