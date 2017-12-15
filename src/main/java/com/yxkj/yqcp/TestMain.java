package com.yxkj.yqcp;

import com.yxkj.yqcp.Utils.AppiumConnectConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;

public class TestMain {
    public static void main(String[] args) throws Exception{
        AndroidDriver driver;
        AppiumConnectConfig acc = new AppiumConnectConfig();
        //    127.0.0.1:6555  b8b4f2271f583
        driver = acc.Connect("b8b4f2271f583");
        Thread.sleep(5000);
//        driver.findElement(By.id("iv_catch_h5")).click();
        List<WebElement> cz_list = driver.findElements(By.id("rl_click"));
//        cz_list.get(5).click();
        driver.findElementByXPath("//android.widget.TextView[@text='birthdaypresent']").click();
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"birthdaypresent\")").click();
        Thread.sleep(5000);
        acc.closeConnect();
    }


}
