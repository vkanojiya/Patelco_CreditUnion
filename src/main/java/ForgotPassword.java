import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ForgotPassword {
    public AppiumDriver <MobileElement> driver;
    // Validation validtaionobject=null;
    public String TermsAndCondition_URL="https://www.patelco.org/site-terms?mode=infromolbmobile";
    public ForgotPassword(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Forgot Password?']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textviewForgotPassword;
    @AndroidFindBy(xpath ="//android.widget.Button[@text='Okay']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement button_OK;

  /*  public void validateLocationURl() throws InterruptedException {
        textview_Terms_Conditions.click();
        Thread.sleep(1000);
        Assert.assertEquals(textviewTermsAndConditionURL.getText(),TermsAndCondition_URL);
    }*/

}
