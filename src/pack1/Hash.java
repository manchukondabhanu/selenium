package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		Map<String, String> value=new HashMap<String,String>();
		value.put("bhanu", "9966897156");
		value.put("ganesh", "9513213583");
		value.put("poja", "9638527412");
		value.put("ganga", "984869485");
		value.put("ramu", "7416671661");
		Set<String> keys=value.keySet();
		  for(String i: keys){
		 System.out.println(i + " : " +  value.get(i));
		}
		  System.out.println(value.get("bhanu"));
		}
	}

