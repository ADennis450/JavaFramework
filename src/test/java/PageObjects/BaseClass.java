package PageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by adennis on 3/13/2018.
 */
public abstract class BaseClass {

    public static WebDriver driver;
    public static boolean bResult;

    public BaseClass(WebDriver driver){
        BaseClass.driver = driver;
        BaseClass.bResult = true;
    }
}
