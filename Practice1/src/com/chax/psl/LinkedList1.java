package com.chax.psl;
import java.util.*;
public class LinkedList1  
{
	public static void main(String[] args) 
	{
		// int i;
		 //Scanner sc=new Scanner(System.in);
		// System.out.println("Enter n Value: ");
		// int n=sc.nextInt();
		 LinkedList<String> ll=new LinkedList<String>();
		 //for(i=0;i<=n;i++)
		 //{
			//String str=sc.nextLine();
			ll.add("chax");
			ll.add("sai");
			ll.add("lokesh");
			ll.add("raju");
			ll.add("sam");
			ll.add(2,"venu");
		 //}
		//System.out.print(ll);
		 System.out.println("Strings is: ");
		 for(String str1:ll)
		 {
		  System.out.print(" "+str1);
		 }
	}

}
