package com.yxkj.yqcp.Lottery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2017/12/15.
 */

public class SSQ {
    public boolean Shop(AndroidDriver driver){
        List<WebElement> cz_list = driver.findElements(By.id("rl_click"));
        System.out.print(cz_list.size());
        cz_list.get(5).click();
//        driver.findElementByXPath("//android.widget.TextView[@text='birthdaypresent']").click();

        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        System.out.println(width );
        System.out.println(height);
        return true;
    }
}
