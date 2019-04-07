package SampleMaven.SampleMaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {

	public PropertyLoader() {
		// TODO Auto-generated constructor stub
	}

	public  Properties readProperty() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Config.properties");
		p.load(inputStream);
		System.out.println(p.getProperty("browser"));
		String current = System.getProperty("user.home");
		System.out.println(current);
		return p;
	}

	public String getKey(String key) throws IOException {

		Properties p=new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Config.properties");
		p.load(inputStream);
		
		return p.getProperty(key);

	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		PropertyLoader p=new PropertyLoader();
		p.getKey("url");

	}

}
