package com.chax.psl;

import java.util.Scanner;

public class DivisibleBy3 
{
	/*public static void main(String []args)
	{
		int max = 0;
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter na integers : ");
		int n=sc.nextInt();
		int[] A=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter the value "+i+" : ");
			A[i]=sc.nextInt();
			max=A[0];
			if((A[i]=sc.nextInt())%3!=0)
			{
			}
			else
			{
					if(max<A[i])
					{
						max=A[i];
					}
			}	
		}
		System.out.println("largest number divisible by 3 is: "+max);
		
		}																
}*/
	
	public static void main(String[] args)
	{
	int i, max;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number of elements in the array: \n");
	int n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements of array: \n");
	for(i = 0; i<n; i++)
	{
	a[i] = s.nextInt();
	}
	max = a[0];
	for(i=0; i<n; i++)
	{
	if((a[i] = s.nextInt())%3==0)
	{
		if(max < a[i])
		{
		max = a[i];
		
		}
	}
	}
	System.out.println("Maximum value in the array is:"+max);
	}
	}
