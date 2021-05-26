package com.pattern.singleton;

public class SingletonClass {

	
	private static SingletonClass singletonClass = new SingletonClass();
	
	private SingletonClass() {}
	
	public static SingletonClass getInstance() {
		return singletonClass;
	}
	
	public void printMessage() {
		System.out.println("Singleton object::: " + singletonClass);
	}

}
