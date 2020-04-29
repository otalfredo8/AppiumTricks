import api.android.Android;
import api.apps.speedtest.home.Home;
import api.apps.tdameritrade.landing.LandingActivity;
import api.apps.tdameritrade.userLicenseAgreement.UserLicenseAgreementActivity;
import core.ADB;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import core.managers.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.log4j.Level;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.remote.DesiredCapabilities;
import tests.TestPrimer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

//        new UiSelector().resourceId("hello").text("item1").makeUiObject();
//
//        MyLogger.log.setLevel(Level.INFO);
//        try{
//            DriverManager.createDriver();
//            JUnitCore.runClasses(TestPrimer.class);
//        }finally {
//            DriverManager.killDriver();
//        }
//========================================================================First Test: with server. Second Test: with Driver Manager
//       //In this test I was not able to see my log information. BUT Test was sucessful
//////        MyLogger.log.debug(Level.DEBUG);
////////        AndroidDriver<MobileElement> driver = null; //First Test
//////        try{
//////
//////            /*First Test
//////            DesiredCapabilities caps = new DesiredCapabilities();
//////            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//////    //        caps.setCapability(MobileCapabilityType.UDID, "fcb9cebe");
//////            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
//////            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android_GalaxyS7_fcb9cebe");
//////            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
////////            caps.setCapability("appPackage", "com.tdameritrade.mobile3");
////////            caps.setCapability("appActivity", "com.tdameritrade.mobile3.activities.HomeActivity");
//////            caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\alfre\\node_modules_appium_utilities_apks\\tda.apk");
//////            caps.setCapability(MobileCapabilityType.FULL_RESET, "true");
//////            caps.setCapability(MobileCapabilityType.NO_RESET, "false");
//////            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
//////            Android.driver = driver;
//////            ADB adb = new ADB("fcb9cebe");
//////            adb.openAppsActivity("com.tdameritrade.mobile3", "com.tdameritrade.mobile3.activities.HomeActivity");*/
//////            DriverManager.createDriver();
//////            Android.adb.openAppsActivity("com.tdameritrade.mobile3", "com.tdameritrade.mobile3.activities.HomeActivity");
//////            UiObject acceptButton = new UiSelector().resourceId("com.tdameritrade.mobile3:id/button_accept").makeUiObject();
//////            UiObject watchListsTab = new UiSelector().description("Watch Lists").makeUiObject();
//////
//////            acceptButton.waitToAppear(3).tap();
//////
//////            MyLogger.log.info("watchListsTab: "+watchListsTab.getContentDesc());
////////            MyLogger.log.info("Download: "+download.getText());
////////            MyLogger.log.info("Upload: "+upload.getText());
//////
//////        } finally {
////////            if (driver != null) driver.quit();
//////            DriverManager.killDriver();
//////        }
        //last comment out because of the implementation of acctivities
//========================================================================

/*
        //Testing MyLogger class
        //Lighter level - more logs
        MyLogger.log.setLevel(Level.DEBUG); //Level.All also includes all
//        MyLogger.log.setLevel(Level.INFO);
//        MyLogger.log.setLevel(Level.WARN);
//        MyLogger.log.setLevel(Level.ERROR);
//        MyLogger.log.setLevel(Level.FATAL);
        MyLogger.log.debug("Test debug");
        MyLogger.log.info("Test info");
        MyLogger.log.warn("Test warn");
        MyLogger.log.error("Test error");
        MyLogger.log.fatal("Test fatal");*/

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        MyLogger.log.setLevel(Level.INFO);
        try{
            DriverManager.createDriver();
        Android.app.tda.open();
        LandingActivity landingActivityTabs = Android.app.tda.userLicenseAgreementActivity.tapAcceptButton();

        MyLogger.log.info("Dashboard visible: "+landingActivityTabs.getLogInLinkText());

    }finally {
        DriverManager.killDriver();
    }
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }
}
