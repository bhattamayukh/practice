package com.practice;

public class ThisKeyword {
	String name;
	int age;
	
	public ThisKeyword(String name , int age) {
		this.name=name;
		this.age=age;
		
	}
	public void printDetails() {
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword thisKeyword1 = new ThisKeyword("Mayukh", 23);
		thisKeyword1.printDetails();
	        
	        ThisKeyword thisKeyword2 = new ThisKeyword("Brad", 30);
	        thisKeyword2.printDetails();

	}

}
