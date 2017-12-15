package com.yxkj.yqcp.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by u on 2017/12/15.
 */

public class AppiumConnectConfig  {
    AndroidDriver driver;

    public AndroidDriver Connect(String deviceName) throws Exception{

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName",deviceName);
        cap.setCapability("platformVersion", "7.0");
        cap.setCapability("appPackage", "com.yxkj.yqcp");
        cap.setCapability("appActivity", "com.yxkj.yqcp.ui.splash.SplashActivity");
        cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName", "Android");
        cap.setCapability("devicereadyTimeout", 30);
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }

    public void closeConnect(){
        driver.quit();
    }

}
