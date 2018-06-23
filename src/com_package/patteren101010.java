package com_package;

import java.util.Scanner;

public class patteren101010 {
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter row vlaue:");
	  int row=sc.nextInt();
	  for (int i = 1; i <=row; i++) {
		int num;
		if (i%2==0) 
		{
			num=0;
			for (int j = 1; j <=row; j++) 
			{
				System.out.print(num);
				num=(num==0)?1:0;
			}
		}else {
			num=1;
			for (int j = 1; j <=row; j++) {
				System.out.print(num);
				num=(num==0)?1:0;
			}
		}
		System.out.println();
	}
	sc.close();    
  }
}
