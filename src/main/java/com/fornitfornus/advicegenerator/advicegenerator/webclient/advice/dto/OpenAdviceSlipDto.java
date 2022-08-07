package com.fornitfornus.advicegenerator.advicegenerator.webclient.advice.dto;



public class OpenAdviceSlipDto {
    private static int id;
    private static String advice;

    public OpenAdviceSlipDto() {
    }

    /*public static int getId() {
        return id;
    }*/

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    @Override
    public String toString() {
        return "OpenAdviceSlipDto{ id: " + id + "advice: " + advice +"}";
    }
}
