package util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MyMobileFactory {
    public static AndroidDriver myMobileAndroidDriver;


    public static AndroidDriver la_haus_main() throws MalformedURLException {
        String appiumServerURL =System.getProperty("hub");
        String deviceName =System.getProperty("deviceName");
        myMobileAndroidDriver =new AndroidDriver(new URL(appiumServerURL), androidSO(deviceName));
        return myMobileAndroidDriver;
    }


    public static final DesiredCapabilities androidSO(String deviceName) {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("sessionName","Automation test La Haus");
        cap.setCapability("app","");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName",deviceName);
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("appPackage","com.lahaus.client");
        cap.setCapability("appActivity","com.lahaus.client.MainActivity");
        return cap;


    }

}
