package com.chax.collections;

import java.util.*;

public class SetProblems {
	public static void main(String[] args) {
		SetProblems sp=new SetProblems();
		sp.hashSet();
		sp.linkedHashSet();
		sp.treeSet();
		
	}
	
	public void hashSet() {
		HashSet<Integer> s=new HashSet<>();
		s.add(233);
		s.add(43);
		s.add(23);
		s.add(2);
		s.add(123);
		s.add(866);
		System.out.println("hashset values is :");
		
		System.out.println(s);
		System.out.println(s.contains(34));
		System.out.println(s.isEmpty());
//		s.clear();
//		System.out.println(s.isEmpty());
		System.out.println(s.equals(43));
		
	}
	
	public void linkedHashSet() {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(123);
		lhs.add(234);
		lhs.add(345);
		lhs.add(456);
		lhs.add(567);
		System.out.println("linkedhashset values is:");
		System.out.println(lhs);
		System.out.println(lhs.contains(123));
	}


	public void treeSet() {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(21);
		ts.add(32);
		ts.add(43);
		ts.add(54);
		ts.add(65);
		System.out.println("treeset values is :");
		System.out.println(ts);
	}

}
