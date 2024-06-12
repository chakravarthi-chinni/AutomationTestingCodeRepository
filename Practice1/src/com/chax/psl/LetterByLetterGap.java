package com.chax.psl;
import java.util.*;
public class LetterByLetterGap 
{
	public static void main(String[] args) 
	{	int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		for(i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				s2=s2+s1.charAt(i);
			}
			if(i%2==1)
			{
				s3=s3+s1.charAt(i);
			}
		}
		System.out.println("Even index values : "+s2);
		System.out.println("Odd index values : "+s3);
	}
		
	

}
