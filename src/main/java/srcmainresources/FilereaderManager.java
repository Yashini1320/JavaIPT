package srcmainresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FilereaderManager {

	private static Properties property;
	private static FileInputStream fileinputstream;

	private static void setupProperty() throws IOException{
		if (property==null) {
		File file= new File("C:\\Users\\VASANTH\\eclipse-workspace\\Project2\\src\\main\\java\\srcmainresources\\AdactinTEST.properties");
		try	{
		fileinputstream=new FileInputStream(file); 
		property= new Properties();
		property.load(fileinputstream);
		}
		catch (FileNotFoundException e) {
		Assert.fail("ERROR: FILENOTFOUND EXCEPTION OCCUR DURING THE PROPERTY FILE LOADING");
		}catch (Exception e) {
		Assert.fail("ERROR: FILENOTFOUND EXCEPTION OCCUR DURING THE PROPERTY FILE READING");
		}
	  }
	}
		
		public static String getDataProperty(String datavalue) throws IOException{
		setupProperty();
		String browserName=property.getProperty(datavalue);
		return browserName;
	
		
		}
		
//		public static void main(String[] args) throws IOException {
//			setupProperty();
//			getDataProperty("");
//			
//		}

//		public Object getDataProperty1(java.lang.String string) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		public java.lang.String getDataProperty(java.lang.String string) {
//			// TODO Auto-generated method stub
//			return null;
//		}

	
}
