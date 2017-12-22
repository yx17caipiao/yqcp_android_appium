package com.yxkj.yqcp.Lottery;

import com.yxkj.yqcp.Utils.ToolUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2017/12/20.
 */

public class DLT {
    public boolean Shop(AndroidDriver driver) throws Exception{
        //        driver.findElement(By.id("rl_select_by_phone")).click();
//        driver.findElementByXPath("//android.widget.TextView[@text='birthdaypresent']").click();
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"birthdaypresent\")").click();
//        Assert.assertTrue(driver.findElement(By.name("首页")).isDisplayed());
//        driver.findElementByLinkText("birthdaypresent").click();
//        driver.swipe(width / 2, width * 9 / 10 , width / 2, height / 10, 1000);
        if(ToolUtil.DeviceType == 2){

        }
        //大乐透
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"大乐透\")").click();
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
        return true;
    }
}
