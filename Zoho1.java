package com.krishnan.arraysum;

public class Zoho1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String a= "WELCOME";
		int mid = a.length()/2;
		String midafter= a.substring(mid);
		System.out.println(midafter);
		StringBuilder b = new StringBuilder();
		for (int i= 0 ; i<midafter.length() ;i++)
		{
			
			for (int j=0;j<midafter.length()-i-1;j++)
			{
				
				System.out.print(" ");
			}
			
			char c = midafter.charAt(i) ;
			
			b.append(c);
			
			
			
			System.out.println(b);
			
			
		}
		
	}
		
	}


