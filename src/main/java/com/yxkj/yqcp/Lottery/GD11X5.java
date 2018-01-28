package com.yxkj.yqcp.Lottery;

import com.yxkj.yqcp.Other.Login;
import com.yxkj.yqcp.Utils.ToolUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2018/1/5.
 */

public class GD11X5 {
    public boolean Shop(AndroidDriver driver,String play) throws Exception{
        ToolUtil.SwipeTool(driver);
        ToolUtil.SwipeTool(driver);
        ToolUtil.SwipeTool(driver);
        if(play.equals("ALL")){
            System.out.println(123);
            List<String> plays=Arrays.asList("RX2", "RX3", "RX4", "RX5", "RX6", "RX7", "RX8", "Q1", "Q2ZH", "Q2Z", "Q3ZH", "Q3Z");
            for (int i = 0; i < plays.size(); i++) {
                System.out.println(plays.get(i));
                ShopPlay(driver,plays.get(i));
            }
        }else{
            ShopPlay(driver,play);
        }
        return true;
    }

    public boolean ShopPlay(AndroidDriver driver,String play) throws Exception{
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"广东11选5\")").click();
        driver.findElement(By.id("tv_title")).click();
        switch (play){
            case "RX2":
                System.out.println("RX2");
                driver.tap(1,100,200,100);//2
                break;
            case "RX3":
                driver.tap(1,300,270,100);//3
                break;
            case "RX4":
                System.out.println("RX4");
                driver.tap(1,500,270,100);//4
                break;
            case "RX5":
                driver.tap(1,100,400,100);//5
                break;
            case "RX6":
                driver.tap(1,300,400,100);//6
                break;
            case "RX7":
                System.out.println("RX7");
                driver.tap(1,500,400,100);//7
                break;
            case "RX8":
                driver.tap(1,100,550,100);//8
                break;
            case "Q1":
                driver.tap(1,300,550,100);//前一
                break;
            case "Q2ZH":
                driver.tap(1,500,550,100);//前二直
                break;
            case "Q2Z":
                driver.tap(1,100,650,100);//前二组
                break;
            case "Q3ZH":
                driver.tap(1,300,650,100);//前三直
                break;
            case "Q3Z":
                driver.tap(1,500,650,100);//前三组
                break;
            default:
                break;
        }

        //选号页面机选
        driver.findElement(By.id("rl_select_by_phone")).click();
        //click跳转至投注单页面
        driver.findElement(By.id("btn_sure")).click();
        //追3期
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.id("iv_add_lottery_count")).click();
        }
        //投3倍
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.id("iv_add_lottery_times")).click();
        }
        //click确定 跳转至支付页面
        driver.findElement(By.id("btn_sure")).click();
        //click确定支付
        driver.findElement(By.id("btn_confirm_pay")).click();
        Thread.sleep(2500);
        //click左上角返回 返回至首页
        driver.findElement(By.id("ll_back")).click();
        ToolUtil.log.info("广东11选5---Success");
        return true;
    }

    public boolean ShopRX2(AndroidDriver driver) throws Exception{
        ToolUtil.SwipeTool(driver);
        ToolUtil.SwipeTool(driver);
        ToolUtil.SwipeTool(driver);
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"广东11选5\")").click();

        driver.findElement(By.id("tv_title")).click();
        Thread.sleep(3000);
        driver.tap(1,100,200,100);
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"奖金65元\")").click();
//        List<WebElement> check_red = driver.findElements(By.id("check_red"));
        List<WebElement> layout = driver.findElements(By.id("layout"));
//        System.out.println("check_red_size:"+check_red.size());
        System.out.println("layout_size:"+layout.size());
//        check_red.get(0).click();
//        layout.get(0).click();
        return true;
    }

    public boolean ShopRX3(AndroidDriver driver) throws Exception{
        ToolUtil.SwipeTool(driver);
        ToolUtil.SwipeTool(driver);
        ToolUtil.SwipeTool(driver);
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"广东11选5\")").click();

        driver.findElement(By.id("tv_title")).click();
        Thread.sleep(3000);
//        driver.tap(1,100,200,100);//2
//        driver.tap(1,300,270,100);//3
//        driver.tap(1,500,270,100);//4
//        driver.tap(1,100,400,100);//5
//        driver.tap(1,300,400,100);//6
//        driver.tap(1,500,400,100);//7
//        driver.tap(1,100,550,100);//8
//        driver.tap(1,300,550,100);//前一
//        driver.tap(1,500,550,100);//前二直
//        driver.tap(1,100,650,100);//前二组
//        driver.tap(1,300,650,100);//前三直
//        driver.tap(1,500,650,100);//前三组
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"奖金65元\")").click();
//        List<WebElement> check_red = driver.findElements(By.id("check_red"));
//        List<WebElement> layout = driver.findElements(By.id("layout"));
//        System.out.println("check_red_size:"+check_red.size());
//        System.out.println("layout_size:"+layout.size());
//        check_red.get(0).click();
//        layout.get(0).click();
        return true;
    }
}
