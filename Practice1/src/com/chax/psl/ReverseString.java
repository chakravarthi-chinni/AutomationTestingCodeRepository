package com.chax.psl;
import java.util.*;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		//String s1="welcome to persistent";
		String s3="";
		String s2="";
		for(i=0;i<=str.length()-1;i++)
		{
			s2=str.charAt(i)+s2;
		}
		System.out.println("reverse String : "+s2);
		for(i=0;i<s2.length();i++)
		{
			for(int j=0;j<s3.length();j++)
			{
				if(s2.charAt(i)!=s3.charAt(j))
				{
					s3=s3+s2.charAt(i);
				}
			}
		}
		System.out.println(s3);
		
	}

}
