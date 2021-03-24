package com.company;

public class CPlusPlusCodeGenerator implements CodeGenerator{
    @Override
    public String generateCode() {
        return anotherGenerateCode();
    }

    private String anotherGenerateCode() {
        return "C++ generate code";
    }
}
