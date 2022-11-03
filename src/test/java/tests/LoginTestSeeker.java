package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestSeeker extends TestBase {
    Logger logger = LoggerFactory.getLogger(LoginTestSeeker.class);

    @Test
    public void loginSuccessSignInButton() {
        logger.info("Test stars with email:nastenabeloded@gmail.com &password:Winston08");
        TestBase.app.getHelperUser().openLoginFormSignInButton();
        TestBase.app.getHelperUser().fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        TestBase.app.getHelperUser().login();
        TestBase.app.getHelperUser().pause(1000);
        TestBase.app.getHelperUser().logout();

    }
    @Test
    public void loginSuccessCreateCVButton(){
        logger.info("Test stars with email:nastenabeloded@gmail.com &password:Winston08");
        TestBase.app.getHelperUser().openLoginFormCreateCVButton();
        TestBase.app.getHelperUser().fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        TestBase.app.getHelperUser().login();
        TestBase.app.getHelperUser().pause(1000);
        TestBase.app.getHelperUser().logout();

    }
    @Test
    public void loginUnSuccessSignInButton(){
        logger.info("Test stars with email:nastenabeloded@gmail.com &password:Winston08");
        TestBase.app.getHelperUser().openLoginFormSignInButton();
        TestBase.app.getHelperUser().fillLoginForm("winston@gmail.com", "Winston08");
        TestBase.app.getHelperUser().login();
        Assert.assertTrue(TestBase.app.getHelperUser().isErrorLoginOrPassword());
        TestBase.app.getHelperUser().takeScreenShots("src/test/screenshots/screne1.png");
        TestBase.app.getHelperUser().close();
    }
    @Test
    public void loginUnSuccessSignInButtonIncorrectEmail() {
        TestBase.app.getHelperUser().openLoginFormSignInButton();
        TestBase.app.getHelperUser().fillLoginForm("winstongmail.com", "Winston08");
        TestBase.app.getHelperUser().login();
        Assert.assertTrue(TestBase.app.getHelperUser().isWrongEmailFormat());
        TestBase.app.getHelperUser().takeScreenShots("src/test/screenshots/screne2.png");
        TestBase.app.getHelperUser().close();

    }
    @Test
    public void loginUnSuccessSignInButtonIncorrectPassword() {
        TestBase.app.getHelperUser().openLoginFormSignInButton();
        TestBase.app.getHelperUser().fillLoginForm("winston@gmail.com", "Winston");
        TestBase.app.getHelperUser().login();
        Assert.assertTrue(TestBase.app.getHelperUser().isWrongPasswordFormat());
        TestBase.app.getHelperUser().takeScreenShots("src/test/screenshots/screne3.png");
        TestBase.app.getHelperUser().close();


    }

}


