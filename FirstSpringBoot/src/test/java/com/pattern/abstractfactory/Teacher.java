package com.pattern.abstractfactory;

public class Teacher implements Profession{

	@Override
	public void getProfession() {
		System.out.println("I am a Teacher");
	}
	
}
