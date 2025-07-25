package com.gqtcorejava.patterns;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		
		for (int i =1 ;i<=5; i++) {
			for (int j =i ;j<=i+20; j=j+5) {
	
			System.out.print(j+" " );
		
			}
	
      System.out.println("");

	}
	}
}
