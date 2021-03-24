package com.company;

public class PHPCodeGenerator implements CodeGenerator{
    @Override
    public String generateCode() {
        return anotherGenerateCode();
    }

    private String anotherGenerateCode() {
        return "PHP generate code";
    }
}
