import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.corba.BridgePermission;

public class InputDetailsPage {


    private static final By FIRST_NAME_INPUT_FIELD = By.cssSelector("#input-firstname");

    private static final By LAST_NAME_INPUT_FIELD = By.cssSelector("#input-lastname");

    private static final By EMAIL_INPUT_FIELD = By.cssSelector("#input-email");

    private static final By TELEPHONE_INPUT_FIELD = By.cssSelector("#input-telephone");

    private static final By PASSWORD_INPUT_FIELD = By.cssSelector("#input-password");

    private static final By PASSWORD_CONFIRM_INPUT_FIELD = By.cssSelector("#input-confirm");

    private static final By TICK_BOX = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
    //@FindBy(css = "#content > form > div > div > input[type=checkbox]:nth-child(2)")
    //WebElement tickBox;
    private static final By CONTINUE_BUTTON = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
    //@FindBy(css = "#content > form > div > div > input.btn.btn-primary")
    //WebElement continueButton;

    public static void inputAllDetails(String firstName,String lastName){
        Browser.driver.findElement(FIRST_NAME_INPUT_FIELD).sendKeys(firstName);
        Browser.driver.findElement(LAST_NAME_INPUT_FIELD).sendKeys(lastName);
        Browser.driver.findElement(EMAIL_INPUT_FIELD).sendKeys(RandomStringUtils.randomAlphabetic(9)+"@somemail.com");
        Browser.driver.findElement(TELEPHONE_INPUT_FIELD).sendKeys(" +359 "+ RandomStringUtils.randomNumeric(9));
        Browser.driver.findElement(PASSWORD_INPUT_FIELD).sendKeys("parolata");
        Browser.driver.findElement(PASSWORD_CONFIRM_INPUT_FIELD).sendKeys("parolata");
    }

    public static void finishTheRegistration(){
        Browser.driver.findElement(TICK_BOX).click();
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }



}
