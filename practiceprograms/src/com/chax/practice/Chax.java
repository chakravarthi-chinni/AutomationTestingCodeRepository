package com.chax.practice;

public class Chax extends FriendAbstract{
	int a=18,b=7,c=20;
	public Chax() {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public void chaxAdd(){
		System.out.println("I'm chax i have addition problem");
		int add=a+b+c;
		System.out.println("addition of a,b,c is :"+add);
		
	}
	public String reveseString(String str) {
		String str2="";
		for(int i=0;i<str.length();i++) {
			str2=str.charAt(i)+str2;
		}
		System.out.println("reverse string is :"+str2);
		return str2;
	}
	public void chaxAdd (int z, int y) {
		int sum=z+y;
		System.out.println("addition of z,y is :"+sum);
	}
//	public void friend() {
//		int sum=t+u+v;
//		
//	}
	@Override
	public void friendAbstract() {
		System.out.println("im from abstract class");
		
	}
}
