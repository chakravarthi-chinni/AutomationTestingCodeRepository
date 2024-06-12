package com.chax.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapProblems {
	public static void main(String[] args) {
		MapProblems mp=new MapProblems();
		//mp.hashMap();
		mp.linkedHashMap();
		mp.treeMap();
		
	}
	
	public void hashMap() {
		HashMap<Integer,String> hm =new HashMap<>();
		hm.put(1, "chakri");
		hm.put(2,"lokesh" );
		hm.put(3, "sam");
		hm.put(4, "venu");
		hm.put(5, "saiKrishna");
		System.out.println("hasmap values is :");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
		System.out.println("-----------");
		for(Integer keys:hm.keySet()) {
			System.out.println(keys);	
		}
		System.out.println("*************");
		for(String values:hm.values()) {
			System.out.println(values);
		}
		
	}
	
	public void linkedHashMap() {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1, "IronMan");
		lhm.put(2,"SpidetMan" );
		lhm.put(3, "SuperMan");
		lhm.put(4, "Thor");
		lhm.put(5, "Hulk");
		System.out.println("linkedhashmap values is :");
		System.out.println(lhm);
		
	}
	public void treeMap() {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "Maths");
		tm.put(2,"Telugu" );
		tm.put(3, "Social");
		tm.put(4, "English");
		tm.put(5, "Science");
		System.out.println("treemap values is :");
		System.out.println(tm);
		//System.out.println(tm.get(2));
		System.out.println(tm.firstEntry());
		//tm.pollLastEntry();
		//tm.lastEntry();
		//wSystem.out.println(tm);
		
	}

}
