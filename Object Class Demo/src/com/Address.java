package com;

public class Address implements Cloneable{
	String streetNm;
	String cityNm;

	Address(){
		
	}
	Address(String streetNm, String cityNm){
		this.streetNm = streetNm;
		this.cityNm = cityNm;
	}
	
	@Override
	public String toString() {
		return "Address [streetNm=" + streetNm + ", cityNm=" + cityNm + "]";
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}
