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

public class JCZQ {
    public boolean Shop(AndroidDriver driver) throws Exception{
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"竞彩足球\")").click();
        Random random = new Random();
        List<WebElement> s_list = driver.findElements(By.id("btn_item_s"));
        List<WebElement> p_list = driver.findElements(By.id("btn_item_p"));
        List<WebElement> f_list = driver.findElements(By.id("btn_item_f"));


        s_list.get(1).click();
        p_list.get(0).click();
        f_list.get(random.nextInt(f_list.size())).click();

        //click跳转至投注单页面
        driver.findElement(By.id("btn_sure")).click();
        //click确定 跳转至支付页面
        driver.findElement(By.id("btn_sure")).click();
        //click确定支付
        driver.findElement(By.id("btn_confirm_pay")).click();
        Thread.sleep(2500);
        //click左上角返回 返回至首页
        driver.findElement(By.id("ll_back")).click();
        ToolUtil.log.info("竞彩足球---Success");
        return true;
    }
}
