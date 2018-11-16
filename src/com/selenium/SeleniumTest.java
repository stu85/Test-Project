package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {


    public static void main(String[] args) {
        
    	// Locate Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
		//chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
        String baseUrl = "http://google.com";

        driver.get(baseUrl);
             
        driver.close();
       
    }

}