package org.chax.testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeshotProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.
	}
}
