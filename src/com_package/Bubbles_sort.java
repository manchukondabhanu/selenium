package com_package;


public class Bubbles_sort {
	
	static void Bubblesort(int[] arr){
		int n=arr.length;
		int temp=0;
		for (int i = 0; i < n; i++) { 
          for (int j = 1; j < (n-i); j++) {
		   if (arr[j-1]>arr[j]) {
			   temp=arr[j-1];
			   arr[j-1]=arr[j];
			   arr[j]=temp;
		} 
		   
		   
		   
		}			
		}
	}
	public static void main(String[] args) {
      int[] arr={45,200,55,100,85,250,65,300};
      System.out.println("Before bubblesort:");
      for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" ");
	}
      System.out.println();
      Bubblesort(arr);
      System.out.println("After bubblesort:");
      for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" ");
	}
	}
}
