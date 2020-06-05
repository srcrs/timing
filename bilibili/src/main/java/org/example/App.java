package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setHeadless(Boolean.TRUE);
        System.setProperty("webdriver.chrome.driver","chromedriver");
        int n=Integer.valueOf(args[0]);
        while(n--!=0){
            WebDriver driver = new ChromeDriver(chromeOptions);
            Thread.sleep(2000);
            driver.get(args[1]);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"bilibiliPlayer\"]/div[1]/div[1]/div[9]/video")).click();
            Thread.sleep(20000);
            driver.close();
			Thread.sleep(60000);
        }
    }
}
