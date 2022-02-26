package com.instanceOf;

import com.immutable.Student;
import com.immutable.StudentRunner;

public class InstanceOfDemo {
	public static void main(String[] args) {
		Student std = new Student("ABCD1234XY");
		
		StudentRunner sr = null;
		
		Stud std1 = new Stud();
		
		if(std1 instanceof Stud) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
