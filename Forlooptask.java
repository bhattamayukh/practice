package com.practice;
import java.util.Scanner;

public class Forlooptask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        System.out.println("Multiplication table of " + num + ":");
for (int i=1;i<=10;i++) {
	System.out.println(num + " x " + i + " = " + (num * i));
}
	}

}
