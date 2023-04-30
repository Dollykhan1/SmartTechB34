package com.usa.inheritanc;

public class Class_B extends Class_A{
     
	public void getManey() {
		System.out.println("its my frist time");
	}
	
	public static void main(String[] args) {
		Class_B obj= new Class_B();
		obj.getManey();
		obj.getManey();
	}
	
}
