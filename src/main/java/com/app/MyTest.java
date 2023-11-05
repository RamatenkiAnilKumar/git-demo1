package com.app;

public class MyTest {

	public void showMyName(String name) {
		
		
			System.out.println("My NAme IS "+name);

		}
	public void addMethod(){

		System.out.println("My Second MEthod:");
	}

	public void multiply(){

		System.out.println("Multiply Data ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTest mt=new MyTest();
		mt.addMethod();
		mt.multiply();
		mt.showMyName("anil");

	}

}
