package com.practice;
import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        int number;

		        do {
		            System.out.println("Please enter a number between 1 and 10:");
		            number = scanner.nextInt();
		        } while (number < 1 || number > 10);

		        System.out.println("You entered: " + number);
		    }
	}


