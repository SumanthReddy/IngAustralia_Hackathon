package in.com.hcl.Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	static Properties prop=new Properties();
	
	
	public static void properties() throws IOException{
	FileInputStream fis=new FileInputStream("");
	
	prop.load(fis);
	
}

}