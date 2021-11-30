import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerifyPage {


    public static void verify(){
        WebElement AccountCreated = Browser.driver.findElement(By.cssSelector("#content > h1"));

        Assert.assertEquals(AccountCreated.getText(),"Your Account Has Been Created!");
    }

}
