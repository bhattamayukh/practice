package com.practice;

public class Encapsulation {
	
	    private String name;
	    private int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	
	    public static void main(String[] args) {
	    	Encapsulation encapsulation = new Encapsulation();
	    	encapsulation.setName("Mayukh");
	    	encapsulation.setAge(23);
	        System.out.println("Name: " + encapsulation.getName());
	        System.out.println("Age: " + encapsulation.getAge());
	    }
	}

