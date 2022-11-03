package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestEmployer extends TestBase {


    @Test
    public void loginSuccessForEmployerButton() {
        TestBase.app.getHelperUser().openLoginFormForEmployerButton();
        TestBase.app.getHelperUser().fillLoginFormEmployer("allanteone@gmail.com","John6666");
        TestBase.app.getHelperUser().login();
        TestBase.app.getHelperUser().pause(1000);
        TestBase.app.getHelperUser().logout();

    }
    @Test
    public void loginSuccessHireNowButton() {
        TestBase.app.getHelperUser().openLoginFormHireNowButton();
        TestBase.app.getHelperUser().fillLoginFormEmployer("allanteone@gmail.com","John6666");
        TestBase.app.getHelperUser().login();
        TestBase.app.getHelperUser().pause(1000);
        TestBase.app.getHelperUser().logout();
    }
    @Test
    public void loginUnSuccessHireNowButton() {
        TestBase.app.getHelperUser().openLoginFormHireNowButton();
        TestBase.app.getHelperUser().fillLoginFormEmployer("winston@gmail.com", "Winston08");
        TestBase.app.getHelperUser().login();
        Assert.assertTrue(TestBase.app.getHelperUser().isErrorLoginOrPassword());
        TestBase.app.getHelperUser().takeScreenShots("src/test/screenshots/screne4.png");
        TestBase.app.getHelperUser().close();
    }
    @Test
    public void loginUnSuccessHireNowButtonIncorrectEmail() {
        TestBase.app.getHelperUser().openLoginFormSignInButton();
        TestBase.app.getHelperUser().fillLoginForm("allanteonegmail.com", "John6666");
        TestBase.app.getHelperUser().login();
        Assert.assertTrue(TestBase.app.getHelperUser().isWrongEmailFormat());
        TestBase.app.getHelperUser().takeScreenShots("src/test/screenshots/screne5.png");
        TestBase.app.getHelperUser().close();

    }
    @Test
    public void loginUnSuccessHireNowButtonIncorrectPassword() {
        TestBase.app.getHelperUser().openLoginFormSignInButton();
        TestBase.app.getHelperUser().fillLoginForm("allanteone@gmail.com", "John");
        TestBase.app.getHelperUser().login();
        Assert.assertTrue(TestBase.app.getHelperUser().isWrongPasswordFormat());
        TestBase.app.getHelperUser().takeScreenShots("src/test/screenshots/screne6.png");
        TestBase.app.getHelperUser().close();


    }

}
