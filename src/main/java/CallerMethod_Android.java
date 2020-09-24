import io.cucumber.java.sl.Ter;

import java.io.IOException;

public class CallerMethod_Android {
    public static void main (String a[]) throws IOException, InterruptedException {
        AndroidDriver driverobje = new AndroidDriver();
        /*LocationsPage obj=new LocationsPage(driverobje.getDriver());
        obj.validateLocationURl();
        RatesPage obj1=new RatesPage(driverobje.getDriver());
        obj1.validateRatesURl();*/
        SupportPage obj2=new SupportPage(driverobje.getDriver());
        obj2.validateSupportURl();
        /*Terms_ConditionPage obj3 =new Terms_ConditionPage(driverobje.getDriver());
        obj3.validatetermsAndCondition();*//*
        LoginPage loginobj = new LoginPage(driverobje.getDriver());
        loginobj.login();*/
    }
}
