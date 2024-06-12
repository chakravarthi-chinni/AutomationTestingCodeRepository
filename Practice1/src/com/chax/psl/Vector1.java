package com.chax.psl;
import java.util.*;

public class Vector1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> vl=new LinkedList<String>();
		vl.add("ramesh");
		vl.add("rajesh");
		vl.add("suresh");
		vl.add("lokesh");
		vl.add("somesh");
		vl.add("sukesh");
		vl.add("rajesh");
		//System.out.println(vl);
		System.out.println("Vector list: ");
	    for(String str:vl)
	     {
		    System.out.println(str);
	     }
	}
}
