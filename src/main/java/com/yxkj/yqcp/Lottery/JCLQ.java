package com.yxkj.yqcp.Lottery;

import com.yxkj.yqcp.Utils.ToolUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2018/1/5.
 */

public class JCLQ {
    public boolean Shop(AndroidDriver driver) throws Exception{
        ToolUtil.SwipeTool(driver);
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"竞彩篮球\")").click();
        Random random = new Random();
        List<WebElement> l_list = driver.findElements(By.id("hhgg_sf_lose"));
        List<WebElement> w_list = driver.findElements(By.id("hhgg_sf_win"));

        l_list.get(0).click();
        w_list.get(2).click();

        //click跳转至投注单页面
        driver.findElement(By.id("btn_sure")).click();
        //click确定 跳转至支付页面
        driver.findElement(By.id("btn_sure")).click();
        //click确定支付
        driver.findElement(By.id("btn_confirm_pay")).click();
        Thread.sleep(2500);
        //click左上角返回 返回至首页
        driver.findElement(By.id("ll_back")).click();
        ToolUtil.log.info("竞彩篮球---Success");
        return true;
    }
}
