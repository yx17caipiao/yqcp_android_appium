package com.yxkj.yqcp;

import com.yxkj.yqcp.Lottery.DLT;
import com.yxkj.yqcp.Lottery.SSQ;
import com.yxkj.yqcp.Utils.AppiumConnectConfig;
import com.yxkj.yqcp.Utils.ToolUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestMain {
    public static void main(String[] args) throws Exception{
        final AndroidDriver driver;
        AppiumConnectConfig acc = new AppiumConnectConfig();
        //    127.0.0.1:6555  b8b4f2271f583 emulator-5554
        driver = acc.Connect("127.0.0.1:6555");
        Thread.sleep(4000);
        TestMain tm = new TestMain();
        tm.star(driver);
        Thread.sleep(3000);
        acc.closeConnect();

//        WebDriverWait wait = new WebDriverWait(driver,60);
//        WebDriver e = wait.until(new ExpectedCondition<WebDriver>() {
//            @Override
//            public WebDriver apply(WebDriver webDriver) {
////                return driver.currentActivity();
////                return webDriver.findElement(By.id("q"));
//                return null;
//            }
//        });
    }

    public void star( AndroidDriver driver){
        //双色球
        SSQ ssq = new SSQ();
        //大乐透
        DLT dlt = new DLT();
        try {
            //双色球基本购彩流程
            ssq.Shop(driver);
        } catch (Exception e) {
            // TODO: handle exception
            ToolUtil.log.info("双色球购彩没跑通！！！");
        }
        try {
            //大乐透基本购彩流程
            dlt.Shop(driver);
        } catch (Exception e) {
            // TODO: handle exception
            ToolUtil.log.info("大乐透购彩没跑通！！！");
        }

    }

}
