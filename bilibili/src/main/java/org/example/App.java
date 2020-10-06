package org.example;

import java.util.Random;
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
		chromeOptions.addArguments("User-Agent=Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Mobile Safari/537.36");
        System.setProperty("webdriver.chrome.driver","chromedriver");
		chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        Random random = new Random();
        int n=3;
        while(n--!=0){
            if(!("000".equals(args[n]))){
                WebDriver driver = new ChromeDriver(chromeOptions);
                Thread.sleep(2000);
                driver.get(args[n]);
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id='bilibiliPlayer']/div/div/div[2]/div[2]/div[5]/i")).click();
                //观看视频时间随机。
                Thread.sleep((20+random.nextInt(50))*1000);
                driver.close();
			    Thread.sleep(20000);
            }
        }
    }
}
