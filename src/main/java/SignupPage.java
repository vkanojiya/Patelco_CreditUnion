import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
public class SignupPage {
    public AppiumDriver <MobileElement> driver;
    // Validation validtaionobject=null;

    public SignupPage(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.view.View[@content-desc='Sign up now']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textview_Sign_up_now;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Register']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement Text_Register;




}
