package com.chax.psl;
import java.util.*;
public class RemoveSpace 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String : ");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)!=' ')
		{
			s2=s2+s1.charAt(i);
			
		}
		}
		System.out.println(s2);
	}

}
