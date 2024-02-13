package com.rocketseat.certification_nlw.modules.questions.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.questions.domain.AlternativesDomain;
import com.rocketseat.certification_nlw.modules.questions.domain.QuestionDomain;
import com.rocketseat.certification_nlw.modules.questions.dto.AlternativesResultDTO;
import com.rocketseat.certification_nlw.modules.questions.dto.QuestionResultDTO;
import com.rocketseat.certification_nlw.modules.questions.repository.QuestionRepository;


@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;
    
    @GetMapping("/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {
        List<QuestionDomain> result = this.questionRepository
                .findByTechnology(technology)
                .orElse(Collections.emptyList());
    
        var dtoList = result.stream()
                .map(this::mapQuestionToDTO)
                .collect(Collectors.toList());
    
        return dtoList;
    }

    private QuestionResultDTO mapQuestionToDTO(QuestionDomain data){
        var dto  = QuestionResultDTO.builder()
            .description(data.getDescription())
            .id(data.getId())
            .technology(data.getTechnology())
            .build();

        List<AlternativesResultDTO> alternativesResultDTOs = data.getAlternatives().stream()
            .map(alt -> mapAlternativeToDTO(alt))
            .collect(Collectors.toList());

        dto.setAlternatives(alternativesResultDTOs);
        return dto;
    }
    
    static AlternativesResultDTO mapAlternativeToDTO(AlternativesDomain alt){
        return AlternativesResultDTO.builder()
        .id(alt.getId())
        .description(alt.getDescription())
        .build();
    }
}
