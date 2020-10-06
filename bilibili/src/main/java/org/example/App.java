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
        System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver(chromeOptions);
        Random random = new Random();
        int n=3;
        try{
            while(n--!=0){
                if(!("000".equals(args[n]))){
                    Thread.sleep(5000);
                    driver.get(args[n]);
                    Thread.sleep(5000);
                    driver.findElement(By.xpath("//*[@id=\"bilibiliPlayer\"]/div[1]/div[1]/div[10]/div[2]/div[2]/div[1]/div[1]/button[1]")).click();
                    //观看视频时间随机。
                    Thread.sleep((20+random.nextInt(50))*1000);
                    Thread.sleep(20000);
                }
            }
        } catch (Exception e){
            System.out.println(e);
        } finally {
            driver.close();
        }
    }
}
