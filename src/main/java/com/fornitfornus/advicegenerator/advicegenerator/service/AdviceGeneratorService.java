package com.fornitfornus.advicegenerator.advicegenerator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fornitfornus.advicegenerator.advicegenerator.model.AdviceGeneratorDto;
import com.fornitfornus.advicegenerator.advicegenerator.webclient.advice.AdviceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdviceGeneratorService {
    private final AdviceClient adviceClient;

    public AdviceGeneratorDto getAdvice() throws JsonProcessingException {
        return adviceClient.getAdviceForDay();
    }
}