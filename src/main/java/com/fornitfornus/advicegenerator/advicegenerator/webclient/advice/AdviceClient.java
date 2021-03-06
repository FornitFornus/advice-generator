package com.fornitfornus.advicegenerator.advicegenerator.webclient.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fornitfornus.advicegenerator.advicegenerator.model.AdviceGeneratorDto;
import com.fornitfornus.advicegenerator.advicegenerator.webclient.advice.dto.OpenAdviceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdviceClient {

    private static final String ADVICE_URL = "https://api.adviceslip.com/advice";
    private final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    Jackson2ObjectMapperBuilder jsonBuilder;

    public AdviceGeneratorDto getAdviceForDay() throws JsonProcessingException {

        String json = restTemplate.getForObject(ADVICE_URL, String.class);

        ObjectMapper objectMapper = jsonBuilder.build();

        OpenAdviceDto openAdviceDto = objectMapper.readValue(json, OpenAdviceDto.class);

        return AdviceGeneratorDto.builder()
                .id(openAdviceDto.getSlip().get("id").asInt())
                .advice(openAdviceDto.getSlip().get("advice").asText())
                .build();
    }

    /* Return generic type */
    private <T> T callGetMethod(String url, Class<T> responseType) {
        return restTemplate.getForObject(url, responseType);
    }
}
