import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SupportPage {
    public AppiumDriver <MobileElement> driver;
    // Validation validtaionobject=null;
    public String Support_URL="https://www.patelco.org/member-support/digital-banking-services?mode=infromolbmobile";

    public SupportPage(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.view.View[@content-desc='Support']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textview_Support_up_now;
    @AndroidFindBy(xpath ="//android.widget.TextView[@index='1']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement textviewSupportURL;
   //android.widget.TextView[@index=1]
public void validateSupportURl() throws InterruptedException {
    textview_Support_up_now.click();
    Thread.sleep(1000);
    System.out.println(textviewSupportURL.getText());
    Assert.assertEquals(textviewSupportURL.getText(),Support_URL);

}

}
