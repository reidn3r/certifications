package com.rocketseat.certification_nlw.modules.students.domain;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentDomain {
    private UUID id;
    private UUID studentId;
    private String technology;
    private int grate; //nota
    List<AnswersCertificationsDomain> answersCertificationsDomain;
    
}
