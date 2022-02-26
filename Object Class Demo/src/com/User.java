package com;

public class User implements Cloneable {

	String name;
	int id;
	Address addr;

	User() {

	}

	User(String name, int id, Address addr) {

		this.name = name;
		this.id = id;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}

	@Override
	protected User clone() throws CloneNotSupportedException {
		User user = null;
		user = (User) super.clone();
		
		user.addr = this.addr.clone();
		
		return user;

	}

}
