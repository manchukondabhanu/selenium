package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Xml {

	public static void main(String[] args) throws IOException {
	FileInputStream fis;
	Properties pr;
	fis=new FileInputStream(System.getProperty("user.dir")+  "\\src\\pack1\\Properties");
	pr=new Properties();
	pr.load(fis);
		System.out.println(pr.getProperty("name"));	
		System.out.println(pr.getProperty("url"));
		System.out.println(pr.getProperty("browser"));	
		System.out.println(pr.getProperty("version"));	
		
	}

}

