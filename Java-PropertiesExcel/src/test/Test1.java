package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "\\src\\config\\object.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		//System.out.println(System.getProperty("user.dir")); // Gives us the current working directory

	}

}
