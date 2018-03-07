package com.yxkj.yqcp;

import com.yxkj.yqcp.Lottery.DLT;
import com.yxkj.yqcp.Lottery.GD11X5;
import com.yxkj.yqcp.Lottery.JCLQ;
import com.yxkj.yqcp.Lottery.JCZQ;
import com.yxkj.yqcp.Lottery.PL3;
import com.yxkj.yqcp.Lottery.PL5;
import com.yxkj.yqcp.Lottery.QLC;
import com.yxkj.yqcp.Lottery.QXC;
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
import java.util.Random;
import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestMain {
    public static void main(String[] args) throws Exception{
        final AndroidDriver driver;
        AppiumConnectConfig acc = new AppiumConnectConfig();
        //    127.0.0.1:6555  b8b4f2271f583 emulator-5554   80SQBDQL226ST
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

    /*
        目前缺陷：
        1.首页点击彩种的问题：目前的解决方案是 固定彩种位置后滑动到该彩种 然后点击该彩种
          缺陷是：彩种位置不能改变，一旦改变彩种位置就可能无法找到对应彩种
          需要优化成：自动滑动查找对应彩种
        2.投注页面切换玩法的问题： 无法点击到玩法切换弹层上面的元素(玩法：任选五)
          目前的解决方案是 根据坐标定位 点击弹层上面的玩法 从而实现玩法的切换
          缺陷是：一旦更换设备，由于分辨率的改变 坐标会不准 可能无法点击到对应的玩法
          需要优化成：能直接点击到弹层上面的玩法
     */
    public void star( AndroidDriver driver) throws Exception {

//        driver.scr
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"广东11选5\")").click();

        boolean isR = true;
        //双色球
        SSQ ssq = new SSQ();
        //大乐透
        DLT dlt = new DLT();
        //广东11选5
        GD11X5 gd11x5 = new GD11X5();
        //竞彩足球
        JCZQ jczq = new JCZQ();
        //竞彩篮球
        JCLQ jclq = new JCLQ();
        //排列5
        PL5 pl5 = new PL5();
        //排列3
        PL3 pl3 = new PL3();
        //七星彩
        QXC qxc = new QXC();
        //七乐彩
        QLC qlc = new QLC();
//        try {
//            //双色球基本购彩流程
////            ssq.Shop(driver);
//            ssq.ShopDT(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("双色球购彩没跑通！！！");
//            isR = false;
//        }
//        try {
//            //大乐透基本购彩流程
//            dlt.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("大乐透购彩没跑通！！！");
//            isR = false;
//        }
//        gd11x5.Shop(driver,"ALL");
        try {
            //广东11选5基本购彩流程
//            gd11x5.Shop(driver,"RX7");
//            gd11x5.ShopRX2(driver);
//            gd11x5.ShopRX3(driver);
//            driver.tap(1,570,450,100);
        } catch (Exception e) {
            // TODO: handle exception
            ToolUtil.log.info("广东11选5购彩没跑通！！！");
            isR = false;
        }
//        try {
//            //竞彩足球基本购彩流程
//            jczq.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("竞彩足球购彩没跑通！！！");
//            isR = false;
//        }
//        try {
//            //竞彩篮球基本购彩流程
//            jclq.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("竞彩篮球购彩没跑通！！！");
//            isR = false;
//        }
//        try {
//            //排列五基本购彩流程
//            pl5.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("排列五购彩没跑通！！！");
//            isR = false;
//        }
//        try {
//            //排列三基本购彩流程
//            pl3.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("排列三购彩没跑通！！！");
//            isR = false;
//        }
//        try {
//            //七星彩基本购彩流程
//            qxc.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("七星彩购彩没跑通！！！");
//            isR = false;
//        }
//        try {
//            //七乐彩基本购彩流程
//            qlc.Shop(driver);
//        } catch (Exception e) {
//            // TODO: handle exception
//            ToolUtil.log.info("七乐彩购彩没跑通！！！");
//            isR = false;
//        }
//        if(isR){
//            ToolUtil.log.info("All Success");
//        }else{
//
//        }
    }

}
