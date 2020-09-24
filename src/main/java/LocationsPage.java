import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class LocationsPage {
    public AppiumDriver <MobileElement> driver;
    // Validation validtaionobject=null;
    public String Location_URL="https://www.patelco.org/locations?mode=infromolbmobile";

    public LocationsPage(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.view.View[@content-desc='Locations']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textview_Locations;
    @AndroidFindBy(xpath ="//android.widget.TextView[@index='1']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textviewLocationsURL;
    @AndroidFindBy(xpath ="//android.widget.Button[@text='Okay']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement button_OK;

    public void validateLocationURl() throws InterruptedException {
        textview_Locations.click();
        Thread.sleep(1000);
        Assert.assertEquals(textviewLocationsURL.getText(),Location_URL);
    }

}
