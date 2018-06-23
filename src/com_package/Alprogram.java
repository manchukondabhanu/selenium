package com_package;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Alprogram {
	
		public static void main(String[] args) {
	       Set<Integer> value=new TreeSet<>();
	       value.add(13);
	       value.add(17);
	       value.add(15);
	       value.add(12);
	       value.add(5);
	      
		  Iterator<Integer> it=value.iterator();
		  while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		}
	
	}
