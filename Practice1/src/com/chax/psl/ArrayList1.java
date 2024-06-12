package com.chax.psl;

import java.util.*;
import java.io.*;
public class ArrayList1
{
	public static void main(String[] args) 
	{
		int i,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numeric Value is: ");
		int n=sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(i=0;i<n;i++)
		{
		System.out.println("Enter "+i+" value: ");
		b=sc.nextInt();
        al.add(b);
        
        
		}
        System.out.println("list value is: ");
        System.out.print(al+"\n");     
       for(int j=0;j<n;j++)
       {
    	   if(j%2==0)
       	{
    	   System.out.print(" "+al.get(j));
       	}
       }
       /*for (Integer num : al) 
       {         
           System.out.print(" "+num); 
       } */
       
	}
}
