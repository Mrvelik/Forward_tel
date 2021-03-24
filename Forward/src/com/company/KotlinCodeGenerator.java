package com.company;

public class KotlinCodeGenerator implements CodeGenerator{
    @Override
    public String generateCode() {
        return anotherGenerateCode();
    }

    private String anotherGenerateCode() {
        return "Kotlin generate code";
    }
}
