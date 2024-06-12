package com.chax.practice;

public class SaiKrishna extends Raju{
	int i=45,j=34;
	int a,b,c;
	public SaiKrishna() {
		this.a=super.a;
		this.b=super.b;
		this.c=super.c;
	}
	public void saiSub() {
		System.out.println("\nim sai and i have subtraction problem");
		int sub=i-j+a+b+c;
		System.out.println("\nsubtraction of i,j is :"+sub);
	}

}
