package pack1;
public class Method {
	public static void main(String[] args) {
		 String s1="welecome to java";
		 byte[] b=s1.getBytes();
		 for (int i = 0; i < b.length; i++)
	    {	 
		    System.out.println("b["+i+"]= "+b[i]);
		}
         char[] ch=s1.toCharArray();
         for (int i = 0; i < ch.length; i++)
        {
		    System.out.println("ch["+i+"]= "+i);
	    }
	  }
}
