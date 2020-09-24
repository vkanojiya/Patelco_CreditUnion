import java.io.IOException;

public class CallerMethod_iOS {
    public static void main (String a[]) throws IOException, InterruptedException {
        iOSDriver driver_object= new iOSDriver();
        LoginPage loginobj = new LoginPage(driver_object.getDriver());
        loginobj.login();
    }
}
