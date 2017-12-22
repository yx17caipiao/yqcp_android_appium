package com.yxkj.yqcp.Other;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2017/12/21.
 */

public class Login {
    public static boolean login(AndroidDriver driver){
        driver.findElement(By.id("tv_password_login")).click();
        driver.findElement(By.id("et_pswlogin_phone")).sendKeys("14511113333");
        driver.findElement(By.id("et_pswlogin_pwd")).sendKeys("c111111");
        driver.findElement(By.id("btn_pswlogin_commit")).click();
        return true;
    }
}
