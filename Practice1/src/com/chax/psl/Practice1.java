package com.chax.psl;

import java.util.Scanner;

public class Practice1 
{
	/*public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n values :");
		int n=sc.nextInt();
		 int []inta;
		 inta=new int[n];
		 for(int i=0;i<=n;i++)
		 {
		 }
		 System.out.println("n values is :"+n);
	}*/
	public static void main(String[] args)
    {
		int sum=0;
		int count=0;

		int i;
        //Create a Scanner to read input
        Scanner scan = new Scanner(System.in);

        //Promt the user to enter the array size and store the input
        System.out.println("Enter the size of the array:");
        int arraySize = scan.nextInt();

        //Create an array (For this example we'll use an integer array)
        int[] array = new int[arraySize];

        //Create a for loop to run through array
        for(i=0; i < arraySize; i++)
        {
            //Prompt the user to enter a number at the current index (i)
            System.out.println("Enter the element at index " + i + ":");

            //Store the input at index i in the array
           
          array[i] = scan.nextInt();
          if(i>0 && i<=i)
          {
        	  count++;
          }
          else
          {
        	  count=0;
          }
          
        }
        System.out.println(1+count++);
        
        
        
       
        
    }



}
