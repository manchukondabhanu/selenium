package com_package;

import java.util.Arrays;

import com.google.common.escape.ArrayBasedCharEscaper;
//4,7,11,12,15,20
	public class Page_Run {
	public static void main(String[] args){ 	
         int[] arry={7,12,4,15,11,20};
         Arrays.sort(arry);
         System.out.println("Second highest element in arry:"+arry[arry.length-2]);
         System.out.println("Second highest element in arry:"+arry[arry.length-1]);
         System.out.println("Second highest element in arry:"+arry[arry.length-4]);


         
	
	}
}