package com.chax.leetcodes;

import java.util.Scanner;

public class Examples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		long arr[]=new long[n]; //{23,45,65,432,45344,322,35534,4322245,6,22223,9734752};
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Examples.rearrange(arr, n);
	}
	    //Function to rearrange  the array elements alternately.
	    public static void rearrange(long arr[], int n)
	    {
	        //Initialising index of first minimum and first maximum element. 
	    	int max_idx = n - 1, min_idx = 0; 
	    
	    	 //Storing maximum element of array.
	    	long max_elem = arr[n - 1] + 1; 
	    
	    	for (int i = 0; i < n; i++) { 
	    	    
	    		//At even index, we have to put maximum elements in decreasing order. 
	    		if (i % 2 == 0) { 
	    			arr[i] += (arr[max_idx] % max_elem) * max_elem; 
	    			//Updating maximum index.
	    			max_idx--; 
	    		} 
	    
	    		//At odd index, we have to put minimum elements in increasing order. 
	    		else { 
	    			arr[i] += (arr[min_idx] % max_elem) * max_elem; 
	    			//Updating minimum index.
	    			min_idx++; 
	    		} 
	    	} 
	    
	    	//Dividing array elements by maximum element to get the result. 
	    	for (int i = 0; i < n; i++) 
	    		arr[i] = arr[i] / max_elem;
	        
	    }
	    

}
