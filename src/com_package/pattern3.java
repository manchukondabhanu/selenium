package com_package;

public class pattern3 {

	public static void main(String[] args) {
  String s="*****";
  for (int i = 1; i <=5; i++) {
	for (int j = 1; j <=5; j++) {
		if (j>i) {
			System.out.print("");
		}else {
			System.out.print(s.charAt(j-1) +" ");

		}
	}
	  System.out.println();
     }
	}

}
