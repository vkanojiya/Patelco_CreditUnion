import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RatesPage {
    public AppiumDriver <MobileElement> driver;
    // Validation validtaionobject=null;
    public String Rates_URL="https://www.patelco.org/rates?mode=infromolbmobile";
    public RatesPage(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.view.View[@content-desc='Rates']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textview_Rates;

    @AndroidFindBy(xpath ="//android.widget.TextView[@index='1']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textviewRatesURL;
    @AndroidFindBy(xpath ="//android.widget.Button[@text='Okay']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement button_OK;
    public void validateRatesURl() throws InterruptedException {
        textview_Rates.click();
        Thread.sleep(1000);
        Assert.assertEquals(textviewRatesURL.getText(),Rates_URL);
    }
}


