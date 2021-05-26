package com.pattern.factory;

public class ProfessionFactory {

	public Profession getProfession(String typeOfProfession) {
		
		if(typeOfProfession != null && typeOfProfession.equalsIgnoreCase("Doctor")) {
			return new Doctor();
		} else if(typeOfProfession != null && typeOfProfession.equalsIgnoreCase("Engineering")) {
			return new Engineering();
		} else if(typeOfProfession != null && typeOfProfession.equalsIgnoreCase("Carpainter")) {
			return new Carpainter();
		} 
		
		return null;
		
	}
}
