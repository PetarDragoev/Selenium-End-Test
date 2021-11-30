import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {


    @BeforeMethod

    public void setUpBrowser(){
        Browser.setUp();
    }
    @AfterMethod
    public void quitBrowser (){
        Browser.tearDown();
    }

    @Test

    public void completeRegistration(){
        MainPage.goToMainPage();
        MainPage.register();
        InputDetailsPage.inputAllDetails("Petar","Dragoev");
        InputDetailsPage.finishTheRegistration();
        VerifyPage.verify();
    }

}

