package com.chax.psl;
import java.util.*;

public class DuplicateLettersShow 
{
	
	public static void main(String[] args) 
	{
		int i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1=sc.nextLine();
		//String s2=s1;
		char []Array=s1.toCharArray();
		
		for(i=0;i<s1.length();i++)
		{
			//char ch=s1.charAt(i);
			for(j=i+1;j<s1.length();j++)
			{
			if(Array[i]==Array[j])
			{
				System.out.print(" "+Array[i]);
				break;
			}
			}
			
		}
		
	}

	
	}
