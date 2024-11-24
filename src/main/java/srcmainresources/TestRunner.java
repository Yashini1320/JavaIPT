package srcmainresources;

import java.io.IOException;

import com.baseclass.Baseclass;
import com.pageobjectmanager.PageobjectManager;
import com.pageobjectmodel.AdactinSearchPage;
//import com.pageobjectmodel.AdactinBookPage;

public class TestRunner extends Baseclass {
	
	public static void main(String[] args) throws IOException, InterruptedException {

		PageobjectManager pom = new PageobjectManager();

		// Login testing
		
		launchBrowser(pom.getFilereader().getDataProperty("browser"));

		launchUrl(pom.getFilereader().getDataProperty("url"));

//		launchBrowser("chrome");
//		launchUrl("https://adactinhotelapp.com/index.php");
		 
		pom.getLoginpage().validusernameandvalidpassword();

		// search hotel

		pom.getSearchpage().searchPage();

		// book hotel

		pom.getBookHotel().bookhotel();
	

//	 
//	pom.getfilereader().getDataProperty("browser");
//	
//	pom.getfilereader().getDataProperty("url");

	

	

	}

		
}

