package com.rocketseat.certification_nlw.modules.students.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertificationsDomain {
    private UUID id;
    private UUID certificationId;
    private UUID studentId;
    private UUID questionID;
    private UUID answerId;
    private boolean isCorrect;
}
