package pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.remote.html5.AddApplicationCache;

public class Hast {

	public static void main(String[] args) {
    Set<String> value=new HashSet<String>();
    value.add("bhanu");
    value.add("ganesh");
    value.add("ramu");
    value.add("bhanu");
    for (String n:value) {
	System.out.println(n);
     
}
    
    
	}

}
