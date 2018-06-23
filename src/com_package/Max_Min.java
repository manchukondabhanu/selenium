package com_package;

public class Max_Min {

	public static void main(String[] args) {
//           int[]  arry=new int[]{23,15,33,7,56,60,23};
//           int max=arry[0];
//           int min=arry[0];
//           for (int i = 0; i < arry.length; i++) {
//			  if (arry[i]> max) {
//				max=arry[i];
//			}
//			  if (arry[i]<min) {
//				min=arry[i];
//			}
//		} 
//	  System.out.println("maxmum value:"+max);
//	  System.out.println("minimum value:"+min); 
		int arry[]=new  int[]{12,5,15,56,35};
		int largest=Integer.MIN_VALUE;
		int minmum=Integer.MAX_VALUE;
		for (int number : arry) {
			  if (number>largest) {
				largest=number;
			}if (number<minmum) {
				minmum=number;
						}
		}
		  System.out.println("largest number:"+largest);
		  System.out.println("minmum number:"+minmum);
	}

}
