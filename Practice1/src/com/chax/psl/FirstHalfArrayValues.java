package com.chax.psl;
import java.util.*;
public class FirstHalfArrayValues 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values : ");
		int n=sc.nextInt();
		int []A= new int[n];
		for(i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Array values is: ");
		for(i=0;i<A.length;i++)
		{
		System.out.print(A[i]+" ");
		}
		System.out.println("\nFirst Half Array Value is: ");
		for(i=0;i<n/2;i++)
		{
		System.out.print(A[i]+" ");
		}
		
		
	}

}
