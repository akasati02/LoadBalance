package com.pattern.singleton;

import com.pattern.abstractfactory.Teacher;

public class TestSingletonClass {

	public static void main(String[] args) {
		SingletonClass singleObj1 = SingletonClass.getInstance();
		singleObj1.printMessage();
		
		SingletonClass singleObj2 = SingletonClass.getInstance();
		singleObj2.printMessage();
		
		Teacher teacher1 = new Teacher();
		System.out.println("teacher1 :: "+teacher1);
		
		Teacher teacher2 = new Teacher();
		System.out.println("teacher2 :: "+teacher2);
	}

}
