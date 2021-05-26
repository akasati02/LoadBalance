package com.pattern.abstractfactory;

public class TraineeProfessionAbstractFactory  extends AbstractFactory {

	@Override
	Profession getProfession(String typeOfProfession) {
		if( typeOfProfession != null && typeOfProfession.equalsIgnoreCase("TraineeEngineer")) {
			return new TraineeEngineering();
		} else if( typeOfProfession != null && typeOfProfession.equalsIgnoreCase("TraineeTeacher")) {
			return new TraineeTeacher();
		}
		return null;
	}
}
