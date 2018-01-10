package com.yxkj.yqcp.Lottery;

import com.yxkj.yqcp.Other.Login;
import com.yxkj.yqcp.Utils.ToolUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2018/1/5.
 */

public class GD11X5 {
    public boolean Shop(AndroidDriver driver) throws Exception{
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"广东11选5\")").click();
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
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"奖金65元\")").click();
//        List<WebElement> check_red = driver.findElements(By.id("check_red"));
        List<WebElement> layout = driver.findElements(By.id("layout"));
//        System.out.println("check_red_size:"+check_red.size());
        System.out.println("layout_size:"+layout.size());
//        check_red.get(0).click();
//        layout.get(0).click();
        return true;
    }
}
