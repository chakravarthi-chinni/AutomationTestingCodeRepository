package com.chax.psl;
import java.util.*;
public class Program1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String name");
		String str=sc.nextLine();
		String s2="";
		for(int i=0;i<str.length();i++)
		{
			s2=str.charAt(i)+s2;
			
		}
		System.out.println(s2);
		
	}
}
