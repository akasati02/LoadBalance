package com.pattern.factory;

public class FactoryPatternMainClass {

	public static void main(String [] str) {
		ProfessionFactory factory = new ProfessionFactory();
		Profession profession = factory.getProfession("");
		profession.print();
	}
}
