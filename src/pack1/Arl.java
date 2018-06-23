package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Arl {

	public static void main(String[] args) {
         List<String> value=new ArrayList<>();
		 value.add("core");
		 value.add("java");
		 value.add("java");
		
		 for (String n: value)
		 {
			System.out.println(n);
		}
		 for (int i = 0; i < value.size(); i++) {
			System.out.println(value.get(i));
		}
		 Iterator<String> vle=value.iterator();
		 while (vle.hasNext()) {
			 vle.next();
			
		}
			
	}
}
