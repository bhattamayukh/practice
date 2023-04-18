
// USING 3RD VARIABLE 

package com.practice;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int a=10,b=20,c;
		System.out.println("BEFORE SWAPING");
		System.out.println(a);
		System.out.println(b);
        c=a;
        a=b;
        b=c;
        System.out.println("AFTER SWAPING");
        System.out.println(a);
        System.out.println(b);*/
	


// WITHOUT USING 3RD VARIABLE 

        int a=10,b=20;
        System.out.println("BEFORE SWAPING");
        System.out.println(a);
		System.out.println(b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("AFTER SWAPING");
        System.out.println(a);
        System.out.println(b);
}
}