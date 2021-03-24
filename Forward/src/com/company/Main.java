package com.company;


public class Main {

    public static void main(String[] args) {
		CodeGenerator javaLanguage = Language.JAVA.createCodeGenerator();
		CodeGenerator cPlusPlusLanguage = Language.C_PLUS_PLUS.createCodeGenerator();
		CodeGenerator phpLanguage = Language.PHP.createCodeGenerator();
		CodeGenerator kotlinLanguage = Language.KOTLIN.createCodeGenerator();

		System.out.println(javaLanguage.generateCode());
		System.out.println(cPlusPlusLanguage.generateCode());
		System.out.println(phpLanguage.generateCode());
		System.out.println(kotlinLanguage.generateCode());


	}
}
