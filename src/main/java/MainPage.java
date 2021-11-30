import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    public static String url = "http://shop.pragmatic.bg/";
    //private static final By MY_ACCOUNT_BUTTON = By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md");
    @FindBy (css = "#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md")
    private static WebElement myAccountButton;
    //private static final By REGISTER_BUTTON = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");
    @FindBy (css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")
    private static WebElement registerButton;

    static {
        PageFactory.initElements(Browser.driver, MainPage.class);
    }

    public static void goToMainPage () {
        Browser.driver.get(url);
    }


    public static void register (){
        myAccountButton.click();
        registerButton.click();
       //Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
       //Browser.driver.findElement(REGISTER_BUTTON).click();
    }

}





