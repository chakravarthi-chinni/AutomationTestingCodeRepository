package com.chax.practice;

import java.util.Scanner;

public class MaxAndMinInAList {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter n value");
//		int n=sc.nextInt();
		int arr[]=new int[] {23,45,65,432,45344,322,35534,4322245,6,22223,9734752};
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		MaxAndMinInAList.rearrange(arr);
	}
	    public static void rearrange(int arr[]){
	    	
	        
	        // Your code here
	        int min=arr[0];
	        int max=arr[0];
	        for (int i=0;i<arr.length;i++){
	            if(arr[i]>max){
	                max=arr[i];
	               // a[i]=max;
	            }
	            if (arr[i]<min){
	                min=arr[i];
	            }
	            System.out.println();
	        }
	        int a[]=new int[] {max,min};
            for (int j=0;j<a.length;j++) {
	        	System.out.print(a[j]+"\n");
	        }
	        
	        //a[]=max;
	        System.out.println("new array to store : "+max);
	        System.out.println("new array to store : "+min);
	        //System.out.println("new array to store : "+a);
	        
	}

}
