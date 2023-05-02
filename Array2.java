package com.practice;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] Matrix= new int [3][3];
		for (int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				Matrix[i][j]=i+j;
			}
		}
		for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
		}
	}

}
