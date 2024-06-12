package com.chax.collections;

import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueProblems {

	public static void main(String[] args) {
		QueueProblems qp=new QueueProblems();
		qp.priorityQueue();
		qp.arrayDeque();
		
	}

	public void priorityQueue() {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(23);
		pq.offer(34);
		pq.add(432);
		pq.offer(432144);
		pq.add(3);
		System.out.println("priorityQueue values is :");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
	public void arrayDeque() {
		ArrayDeque<String> aq=new ArrayDeque<>();
		aq.addFirst("chakri");
		aq.addLast("lokesh");
		aq.offerFirst("sam");
		aq.add("sai");
		System.out.println("arrayDeque values is :");
		System.out.println(aq);
		System.out.println(aq.pollFirst());
		
	}
	
	public void linkedList() {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add
	}
}
