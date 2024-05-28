package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        driver.findElement(By.cssSelector("p.orangehrm-login-forgot-header")).click();
        //Verify the text ‘Reset Password’
        Assert.assertEquals("Not redirected to login page","Reset Password", driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText());
    }

    @After
    public void tearDown(){
       // closeBrowser();
    }
}
