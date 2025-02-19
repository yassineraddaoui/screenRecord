package com.screenrecord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenRecordApplication {

    public static void main(String[] args) throws Exception {
        ScreenRecorderUtil.startRecord("test");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        Thread.sleep(5000);
        driver.quit();
        ScreenRecorderUtil.stopRecord();
        SpringApplication.run(ScreenRecordApplication.class, args);
    }

}
