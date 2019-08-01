package com.shoppingcart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "C:\\Mamta\\programs\\Flipcart\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys("7057728563");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mamta391");
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
*/		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 
	     driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iphone");
		
	     driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	     
	    List <WebElement> list = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	    
       //boolean b= price.isEmpty();
	    int sum=0;
        System.out.println(list.size());
        for (WebElement web : list) {
        
        String amount=web.getText();
        int length=amount.length();
        String price=amount.substring(1, length);
        price = price.replaceAll("," , "");
        int priceInt = Integer.parseInt(price);
        //System.out.println(priceInt);
         sum=sum + priceInt;
        }
        System.out.println("Total sum of iphone is  :"+sum);
        
        int Avg =sum/list.size();
        System.out.println("Average of iphone price is :"+Avg);
        

}
}
	
	

