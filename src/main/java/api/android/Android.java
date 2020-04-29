package api.android;

import api.apps.Apps;
import core.ADB;
import io.appium.java_client.android.AndroidDriver;

//Central hub where we reference everything else in our framework.
public class Android {

    public static AndroidDriver driver;
    public static ADB adb;
    public static Apps app = new Apps();
}
