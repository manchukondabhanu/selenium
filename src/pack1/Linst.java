package pack1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linst {

	public static void main(String[] args) {
     List<Integer> name=new LinkedList<>();
     name.add(5);
     name.add(6);
     name.add(6);
     for (Integer kl:name) {
		System.out.println(kl);
	}
     for (int i = 0; i < name.size(); i++) {
		System.out.println(name.get(i));
	}
     Iterator<Integer> nl=name.iterator();
     while (nl.hasNext()) {
	   nl.next();
		
	}
	}

}
