package com.fornitfornus.advicegenerator.advicegenerator.model;

import lombok.Builder;

@Builder
public class AdviceGeneratorDto {
    private int id;
    private String advice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
