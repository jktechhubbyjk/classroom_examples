package com;

public class Student{
	
	private String name;
	
	Student(){
		name = "";
		System.out.println("zero parameterized constructor"+name + " : java training");
	}
	
	
	Student(int i){
		name = "";
		System.out.println("zero parameterized constructor"+name + " : java training "+i);
	}

	public void m1(){
		System.out.println("m1 method from student");
	}
	
	public void m2(int i){
		System.out.println("m2 with int parameter : "+i);
	}
	
	
	private void m3(){
		System.out.println("private method m3 "+name);
	}
}
