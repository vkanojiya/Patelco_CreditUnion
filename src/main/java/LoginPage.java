import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public AppiumDriver <MobileElement> driver;
   // Validation validtaionobject=null;

    public LoginPage(AppiumDriver  driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.widget.Button[contains(@text,'Allow only while using the app')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Username']")
    public MobileElement Allow_consent;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='UserName']")
    //@iOSXCUITFindBy(xpath = "//*[@type='XCUIElementTypeTextField' and @value='Username']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public MobileElement EditText_userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='Password']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    public MobileElement EditText_password;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='login_submit']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Log In']")
    public MobileElement Button_loginButton;

    @AndroidFindBy(xpath = "//android.view.View[@text='Questions']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Questions']")
    public MobileElement Question;

    @AndroidFindBy(xpath = "//android.view.View[@index=5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'?')]")
    //XCUIElementTypeOther[@visible='true' and @enabled='true' and @y='284']
    public MobileElement Question_text;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='answers_0']")
    @iOSXCUITFindBy(xpath = "////XCUIElementTypeTextField")
    public MobileElement answer_text;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
    public MobileElement Continue_Button;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='NOT NOW']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
    public MobileElement PinNotNow;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MAYBE LATER']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Maybe Later']")
    public MobileElement MaybeLater;




 public void login() throws InterruptedException {
     /*if (Allow_consent.isDisplayed())
         Allow_consent.click();*/
     EditText_userName.click();
     Thread.sleep(1000);
     EditText_userName.sendKeys("Usertwo2");
        Thread.sleep(1000);
     EditText_password.click();
     EditText_password.sendKeys("Credit1!");
        Thread.sleep(1000);
     Button_loginButton.click();
     Thread.sleep(1000);
     Question.click();
     String s=Question_text.getText();

     System.out.println(s);

     int len = s.length();
     String myString = s.trim();

     String[] wordList = myString.split("\\s+");
     System.out.println(wordList[wordList.length-1]);
     String newString=wordList[wordList.length-1];
        String finalString=new String();



     for(int i=0;i<newString.length()-1;i++)
     {
         finalString= finalString+newString.charAt(i);

     }

     //answer_text.sendKeys(finalString);
     System.out.println(finalString);
     answer_text.sendKeys(finalString);

     Thread.sleep(1000);
     Continue_Button.click();
     Thread.sleep(5000);
     PinNotNow.click();
     Thread.sleep(5000);
     MaybeLater.click();

    }
}
