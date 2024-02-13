package com.rocketseat.certification_nlw.modules.students.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_certifications")
public class CertificationStudentDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String technology;
    
    @Column(nullable = false)
    private int grate; //nota
    
    @Column(name = "student_id")
    private UUID studentID;    

    @CreationTimestamp
    private LocalDate createdAt;
    
    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentDomain studentDomain;
    
    @OneToMany(mappedBy = "certificationStudentDomain")
    // @JoinColumn(name = "answer_certification_id") //???
    private List<AnswersCertificationsDomain> answersCertificationsDomain;
}
