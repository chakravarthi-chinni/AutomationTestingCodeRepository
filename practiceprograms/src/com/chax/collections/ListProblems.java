package com.chax.collections;
import java.util.*;
public class ListProblems {
	public static void main(String[] args) {
		ListProblems lp=new ListProblems();
		//lp.arrayList();
		//lp.linkedList();
		lp.vector();
	}
	public  void arrayList() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(34);
		al.add(55);
		al.add(66);
		al.add(11);
		al.add(11);
		al.add(3);
		al.add(54);
		al.add(0, 345);
		//System.out.println("\nremove the value of an arrayList :"+al.remove(0));
		//int lastValue=al.lastIndexOf(al);
		System.out.println("get arraylist values :");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));

		}
		System.out.println("last index of an aray :"+al.get(0));
		System.out.println("contains the value of an aray :"+al.contains(345));
		System.out.println("check an aray is empty :"+al.isEmpty());
	}
	public void linkedList() {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(232);
		ll.add(1111);
		ll.add(222222);
		ll.add(333333);
		ll.add(443332);
		System.out.println("list of values :");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
}
	public void vector() {
		Vector<Integer> v=new Vector<>();
		v.add(123);
		v.add(2);
		v.add(222);
		v.add(3221);
		v.add(12321);
		v.add(2123);
//		System.out.println("list of vector values :");
//		for(int i=0;i<v.size();i++) {
//			System.out.println(v.get(i));
//		}
		System.out.println("value of 4th index is :"+v.get(4));
		System.out.println(v);
	}
}
