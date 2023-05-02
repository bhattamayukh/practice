package com.practice;

public class MatrixMultiplication {
	
	    public static void main(String[] args) {
	        int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	        int[][] secondMatrix = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

	        int[][] result = multiplyMatrices(firstMatrix, secondMatrix);

	        // printing the result matrix
	        for(int i = 0; i < result.length; i++) {
	            for(int j = 0; j < result[0].length; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    // method to multiply two matrices
	    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
	        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

	        for(int i = 0; i < firstMatrix.length; i++) {
	            for(int j = 0; j < secondMatrix[0].length; j++) {
	                for(int k = 0; k < secondMatrix.length; k++) {
	                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	                }
	            }
	        }

	        return result;
	    }
	}

