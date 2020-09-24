
//package CommonMethod;

        /*import Pages.LoginPage;
        import Pages.ProfilePage;*/

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class iOSDriver {
    public  DesiredCapabilities capabilities = new DesiredCapabilities();
    public  java.util.Date date = new java.util.Date(System.currentTimeMillis());
    public AppiumDriver driver;


        /*InputStream input = new FileInputStream("C:\\Users\\vkanojiya\\IdeaProjects\\Patelco_CreditUnion\\Configuration.propertiess");
        Properties configData = new Properties();

        // load a properties file
        configData.load(input);


        capabilities.setCapability("testobjectApiKey", configData.get("testobjectApiKey"));
        capabilities.setCapability("deviceName", configData.get("deviceName"));
        capabilities.setCapability("platformName", configData.get("platformName"));
        capabilities.setCapability("appPackage", configData.get("appPackage"));
        capabilities.setCapability("deviceOrientation", configData.get("deviceOrientation"));
        capabilities.setCapability("autoGrantPermissions", configData.get("autoGrantPermissions"));
        capabilities.setCapability("name", (String) configData.get("name") + date);
        driver = new AppiumDriver(new URL((String) configData.get("URL")), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/

   /* LoginPage login = null;
    ProfilePage profile = null;*/


    public AppiumDriver getDriver()  throws IOException, InterruptedException {
               InputStream input = new FileInputStream("C:\\Users\\vkanojiya\\IdeaProjects\\Patelco_CreditUnion\\Configuration.properties");
        Properties configData = new Properties();

        // load a properties file
        configData.load(input);


        capabilities.setCapability("testobjectApiKey", configData.get("iostestobjectApiKey"));
        capabilities.setCapability("deviceName", configData.get("iosdeviceName"));
        capabilities.setCapability("platformName", configData.get("iosplatformName"));
        capabilities.setCapability("appPackage", configData.get("iosappPackage"));
        capabilities.setCapability("deviceOrientation", configData.get("deviceOrientation"));
        capabilities.setCapability("autoGrantPermissions", configData.get("autoGrantPermissions"));
        capabilities.setCapability("name",(String) configData.get("name") + date);
        driver=new AppiumDriver(new URL((String) configData.get("iosURL")), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Thread.sleep(1000);
        return driver;
    }

  /*  public static void main(String a[]) throws IOException, InterruptedException {

        iOSDriver d=new iOSDriver();
        d.getDriver();
    }*/

   /* public void closeDriver(){
        driver.quit();
    }}*/
}

