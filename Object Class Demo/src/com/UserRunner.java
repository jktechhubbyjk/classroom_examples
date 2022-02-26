package com;

public class UserRunner {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address("Karveroad", "Pune");
		
		User u = new User("Nathuram", 101,addr);
		
		System.out.println("*********Before change**********");
		User u1 = u.clone();
		
		System.out.println(u);
		System.out.println(u1);
		
		u.addr =  new Address("Sinhgad road", "NandedCity");
		
		System.out.println("*********after change**********");
		
		System.out.println(u);
		System.out.println(u1);
		
	}

}
