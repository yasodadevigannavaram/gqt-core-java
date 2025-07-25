package com.gqtcorejava.patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int count =1;
		for (int i =1 ;i<=n; i++,count++) {
			for (int j =1 ;j<=i; j++) {
		
			System.out.print(count+" ");
			
			}
	
      System.out.println(); 

	}

}
}