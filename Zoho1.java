package com.krishnan.arraysum;

import java.util.Scanner;

public class Zoho1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		String a=in.nextLine();
		
		int mid = a.length()/2;
		String midafter= a.substring(mid);
		//System.out.println(midafter);
		StringBuilder b = new StringBuilder();
		for (int i= 0 ; i<midafter.length() ;i++)
		{
			
			for (int j=0;j<midafter.length()-i+2;j++)
			{
				
				System.out.print(" ");
			}
			
			char c = midafter.charAt(i) ;
			
			b.append(c);
			
			
			
			System.out.println(b);
			
			
		}
		
		for(int k=0;k<a.length()/2 ; k++)
		{
			
			for (int j=0;j<a.length()/2-k-1;j++)
			{
				
				System.out.print(" ");
			}
			
			
			char d = a.charAt(k);
			b.append(d);
			System.out.println(b);
			
		
		}
		
		
		
	}
		
	}


