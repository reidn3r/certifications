package com.rocketseat.certification_nlw.modules.students.domain;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_answers")
public class AnswersCertificationsDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "is_correct")
    private boolean isCorrect;
    
    @CreationTimestamp
    private LocalDate createdAt;
    
    @Column(name = "question_id")
    private UUID questionID;
    
    @Column(name = "answer_id")
    private UUID answerId;
    
    @Column(name = "student_id")
    private UUID studentId;
    
    @ManyToOne()
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentDomain studentDomain;

    @Column(name = "certification_id")
    private UUID certificationID;
    
    @ManyToOne()
    @JoinColumn(name = "certification_id", insertable = false, updatable = false)
    private CertificationStudentDomain certificationStudentDomain;
}
