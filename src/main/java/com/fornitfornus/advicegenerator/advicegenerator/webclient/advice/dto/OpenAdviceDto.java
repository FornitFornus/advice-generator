package com.fornitfornus.advicegenerator.advicegenerator.webclient.advice.dto;

import com.fasterxml.jackson.databind.JsonNode;

public class OpenAdviceDto {

    /*private static Map<String, Object> slip;

    public Map<String, Object> getSlip() {
        return slip;
    }*/

    private static JsonNode slip;
    private OpenAdviceSlipDto id;
    private OpenAdviceSlipDto advice;

    public OpenAdviceSlipDto getId() {
        return id;
    }

    public OpenAdviceSlipDto getAdvice() {
        return advice;
    }

    public static JsonNode getSlip() {
        return slip;
    }

    public void setSlip(JsonNode slip) {
       this.slip = slip;
    }
}
