package com.chax.practice;

public class ArrayConcepts{
	public int firstLowestValue(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("lowest value of an array :"+min);
		return min;
	}
	public int secondLowestValue(int a[]) {
		int min=a[0];
		int secondLowestValue =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secondLowestValue=min;
				min=a[i];
			}
			else if(a[i]<secondLowestValue && a[i]!=min) {
				secondLowestValue=a[i];
			}
		}
		System.out.println("secondLowest value is :"+secondLowestValue);
		return secondLowestValue;	
	}
	
	public int thirdLowestValue(int a[]) {
		int min=a[0];
		int secondLowestValue =a[0];
		int thirdLowestValue=secondLowestValue;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				thirdLowestValue=secondLowestValue;
				secondLowestValue=min;
				min=a[i];
			}
			else if(a[i]<secondLowestValue && a[i]!=min) {
				thirdLowestValue=secondLowestValue;
				secondLowestValue=a[i];
			}
			else if(a[i]<thirdLowestValue && a[i]!=secondLowestValue ) {
				thirdLowestValue=a[i];
			}
		}
		System.out.println("thirdLowest value is :"+thirdLowestValue);
		return thirdLowestValue;
	}
	public int maxValue(int a[]) {
		int maxValue=a[0];
		int secondMaxValue=maxValue;
		int thirdMaxValue=secondMaxValue;
		for(int i=0;i<a.length;i++) {
			if(a[i]>maxValue) {
				thirdMaxValue=secondMaxValue;
				secondMaxValue=maxValue;
				maxValue=a[i];
			}
			else if(a[i]>secondMaxValue && a[i]!=maxValue) {
				thirdMaxValue=secondMaxValue;
				secondMaxValue=a[i];
			}
			else if (a[i]>thirdMaxValue && a[i]!=secondMaxValue) {
				thirdMaxValue=a[i];
				
			}
			
		}
		System.out.println("max value of an array :"+maxValue);
		System.out.println("secondmax value of an array :"+secondMaxValue);
		System.out.println("thirddmax value of an array :"+thirdMaxValue);
		return maxValue;
	}
}
