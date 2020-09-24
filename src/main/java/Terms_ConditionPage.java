import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Terms_ConditionPage {
    public AppiumDriver <MobileElement> driver;
    // Validation validtaionobject=null;
    public String TermsAndCondition_URL="https://www.patelco.org/site-terms?mode=infromolbmobile";
    public Terms_ConditionPage(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(xpath ="//android.view.View[@content-desc='Terms & Conditions']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textview_Terms_Conditions;
    @AndroidFindBy(xpath ="//android.widget.TextView[@index='1']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textviewTermsAndConditionURL;
    @AndroidFindBy(xpath ="//android.widget.Button[@text='Okay']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement button_OK;

    public void validatetermsAndCondition() throws InterruptedException {
        textview_Terms_Conditions.click();
        Thread.sleep(1000);
        Assert.assertEquals(textviewTermsAndConditionURL.getText(),TermsAndCondition_URL);
    }

}
