 package pack1;

public class StringFor {
	public static String reverseString(String stb){
    StringBuilder st=new StringBuilder(stb);
    st.reverse();
	return st.toString();   		
}
}