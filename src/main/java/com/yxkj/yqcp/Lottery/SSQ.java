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
    public boolean Shop(AndroidDriver driver) throws Exception{
//        List<WebElement> cz_list = driver.findElements(By.id("rl_click"));
//        System.out.println(cz_list.size());
//        System.out.println(cz_list.get(3).getText());
////        cz_list.get(0).click();
////        driver.findElementByXPath("//android.widget.TextView[@text='birthdaypresent']").click();
//
//        int width = driver.manage().window().getSize().width;
//        int height = driver.manage().window().getSize().height;
//        driver.swipe(width / 2, width * 9 / 10 , width / 2, height / 10, 1000);
//        Thread.sleep(3000);
//        List<WebElement> cz_lists = driver.findElements(By.id("rl_click"));
//        System.out.println(cz_lists.size());
//        cz_lists.get(7).click();
        driver.findElementByXPath("//android.widget.TextView[@text='吉林时时彩']").click();
        return true;
    }
}
