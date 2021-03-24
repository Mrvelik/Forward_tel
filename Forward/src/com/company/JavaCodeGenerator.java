package com.company;

public class JavaCodeGenerator implements CodeGenerator{
    @Override
    public String generateCode() {
        return anotherGenerateCode();
    }

    private String anotherGenerateCode() {
        return "JAVA generate code";
    }
}
