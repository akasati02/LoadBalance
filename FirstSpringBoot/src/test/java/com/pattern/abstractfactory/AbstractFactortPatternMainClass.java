package com.pattern.abstractfactory;

public class AbstractFactortPatternMainClass {
	
	public static void main(String str[]) {
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
		Profession profession = abstractFactory.getProfession("Teacher");
		
		profession.getProfession();
	}

}
