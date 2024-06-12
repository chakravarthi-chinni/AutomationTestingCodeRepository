package com.chax.psl;
import java.util.*;
public class CountRepeatedCharacters 
{
	public static void main(String[] args) 
	{
		int i;
		int counta=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String : ");
		String s1=sc.nextLine();
		String s2="";
		for(i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)<0)
			{
				s2=s2+s1.charAt(i);
			}
			if('a'==s1.charAt(i))
			{
				counta++;
			}
		}
		System.out.println("repeated letters : \n"+s2);
		System.out.println("A character count : "+counta++);
		
	}

}
