package com.pattern.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String typeOfProfession) {
		if( typeOfProfession != null && typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineering();
		} else if( typeOfProfession != null && typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}
		return null;
	}

}
