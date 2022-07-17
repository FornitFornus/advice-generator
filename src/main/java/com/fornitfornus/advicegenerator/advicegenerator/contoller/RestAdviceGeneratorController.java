package com.fornitfornus.advicegenerator.advicegenerator.contoller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fornitfornus.advicegenerator.advicegenerator.model.AdviceGeneratorDto;
import com.fornitfornus.advicegenerator.advicegenerator.service.AdviceGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestAdviceGeneratorController {
    private final AdviceGeneratorService adviceGeneratorService;

    @GetMapping(value = "/advice")
    public AdviceGeneratorDto getAdvice(Model model) throws JsonProcessingException {
       /*     String advGen = String.valueOf(adviceGeneratorService.getAdvice());
            model.addAttribute("id",advGen);
        return "advice";*/
        return adviceGeneratorService.getAdvice();
    }
}
