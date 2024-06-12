package com.chax.psl;

//import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class MaxMinValue
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many values you get : ");
		int n=sc.nextInt();
		int []A=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the values "+i+" : ");
		    A[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    System.out.print(A[i]+" ");
		}
		//int min = Collections.min(Arrays.asList(A));
		int max = 0;
	     
	      for(i=0; i<n; i++ ) 
	      {
	         if(A[i]>max) {
	            max = A[i];
	         }
	      }
	      System.out.println("\nmax value is :"+max);	
	      int min=A[0];
	      for(i=0;i<n;i++)
	      {
	    	  if(A[i]<min)
	    	  {
	    		  min=A[i];	    	  }
	      }
	      System.out.println("min vlaue is : "+min);
	}

}
