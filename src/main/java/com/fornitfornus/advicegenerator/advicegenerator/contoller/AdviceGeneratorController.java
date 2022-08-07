package com.fornitfornus.advicegenerator.advicegenerator.contoller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fornitfornus.advicegenerator.advicegenerator.model.AdviceGeneratorDto;
import com.fornitfornus.advicegenerator.advicegenerator.service.AdviceGeneratorService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequiredArgsConstructor
public class AdviceGeneratorController {

    private final AdviceGeneratorService adviceGeneratorService;
 
    @GetMapping(value = "/adviceHtml")
    public String getAdviceHtml(Model model) throws JsonProcessingException {
        AdviceGeneratorDto adviceGeneratorDto = adviceGeneratorService.getAdvice();
            model.addAttribute("id", adviceGeneratorDto.getId());
            model.addAttribute("advice", adviceGeneratorDto.getAdvice());
        return "adviceHtml";
    }
}
