package com.company;

public enum Language {
    JAVA {
        @Override
        public CodeGenerator createCodeGenerator() {
            return new JavaCodeGenerator();
        }
    },
    C_PLUS_PLUS {
        @Override
        public CodeGenerator createCodeGenerator() {
            return new CPlusPlusCodeGenerator();
        }
    },
    PHP {
        @Override
        public CodeGenerator createCodeGenerator() {
            return new PHPCodeGenerator();
        }
    },
    KOTLIN {
        @Override
        public CodeGenerator createCodeGenerator() {
            return new KotlinCodeGenerator();
        }
    };

    public abstract CodeGenerator createCodeGenerator();
}
