package winiumFirstPack;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumStart {

	//

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesktopOptions Options=new DesktopOptions();
		
		Options.setApplicationPath("C:/Windows/System32/calc.exe");

		
		WiniumDriver driver= new WiniumDriver(new URL("http://localhost:9999"),Options);
		Thread.sleep(5000);
		
		driver.findElementByName("5").click();
	   
		
		System.out.println("winium working ");
		
		
		
		
		
		
	}

}
