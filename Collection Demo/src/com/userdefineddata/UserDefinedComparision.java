package com.userdefineddata;

import java.util.Comparator;

public class UserDefinedComparision implements Comparator<Student> {

	
	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.id < s2.id ) {
			return 12151;
		}else if(s1.id > s2.id) {
			return -16451;
		}else {
			return 0;
		}
	}

	

	

}
