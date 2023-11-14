package ads;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Trianle_dp {

	public static void main(String[] args) // throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases:");
		int testcases = sc.nextInt();
		for (int i = 0; i < testcases; i++) {
			int rows = sc.nextInt();
			int sum = 0;
//	            int triangle[][] = new int[rows][rows];
			int triangle[][] = { { 2 }, { 1, 2 }, { 1, 2, 3 } };
//	            for(int j=0;j<rows;j++)
//	                for(int k=0;k<=j;k++)
//	                    triangle[j][k]=sc.nextInt();
//	           // System.out.println(triangle[0][2]);

			for (int j = rows - 2; j >= 0; j--) {
				for (int k = 0; k <= j; k++) {
					triangle[j][k] += Math.max(triangle[j + 1][k], triangle[j + 1][k + 1]);
					System.out.println(triangle[j][k]);
				}
			}
			System.out.println(triangle[0][0]);
		}
	}
}

/* package codechef; // don't place package name! */

/*
 * import java.util.*; import java.lang.*; import java.io.*;
 * 
 * Name of the class has to be "Main" only if the class is public. class
 * Codechef { public static void main (String[] args) throws java.lang.Exception
 * {
 * 
 * Scanner sc = new Scanner(System.in); int testcases = sc.nextInt(); for(int
 * i=0;i<testcases;i++) { int rows = sc.nextInt(); int sum=0; int triangle[][] =
 * new int[rows][rows]; for(int j=0;j<rows;j++) for(int k=0;k<=j;k++)
 * triangle[j][k]=sc.nextInt(); for(int j=rows-2;j>=0;j--) { for(int
 * k=0;k<=j;k++) { triangle[j][k]+=
 * Math.max(triangle[j+1][k],triangle[j+1][k+1]); } }
 * System.out.println(triangle[0][0]); } } }
 * 
 */