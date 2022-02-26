package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudnetMain {
	public static void main(String[] args) throws Exception, SecurityException {
		Student std = new Student();
	
		Object ong;
	
		Class cls =std.getClass();
		// to get class name
		System.out.println(cls.getName());
		
		System.out.println("Methods from "+cls.getName());
		
		//array
		
	Method[] methods=	cls.getMethods();
	for(Method meth : methods) {
		System.out.println(meth.getName());
	}
		Method methodClall = cls.getDeclaredMethod("m2", int.class);
		methodClall.invoke(std, 15);
		
		Field field = cls.getDeclaredField("name");
		field.setAccessible(true);
		field.set(std, "jktechhub");
		
		
		Method method = cls.getDeclaredMethod("m3");
		method.setAccessible(true);
		
		method.invoke(std);
		
		Constructor constr = cls.getConstructor(int.class);
	//	constr.setAccessible(true);
		
		Constructor[] constrs = cls.getConstructors();
		
		for(Constructor constrss : constrs) {
			constrss.setAccessible(true);
			System.out.println(constrss.getName());
		}
		
		
		//constr.getClass();
		
		
//	System.out.println(field.getName());
		
		
		
		
		
		
		
		
	}
}
