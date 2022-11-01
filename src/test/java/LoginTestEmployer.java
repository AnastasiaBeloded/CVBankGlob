import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestEmployer extends TestBase{


    @Test
    public void loginSuccessForEmployerButton() {
        app.getHelperUser().openLoginFormForEmployerButton();
        app.getHelperUser().fillLoginFormEmployer("allanteone@gmail.com","John6666");
        app.getHelperUser().login();
        app.getHelperUser().pause(1000);
        app.getHelperUser().logout();

    }
    @Test
    public void loginSuccessHireNowButton() {
        app.getHelperUser().openLoginFormHireNowButton();
        app.getHelperUser().fillLoginFormEmployer("allanteone@gmail.com","John6666");
        app.getHelperUser().login();
        app.getHelperUser().pause(1000);
        app.getHelperUser().logout();
    }
    @Test
    public void loginUnSuccessHireNowButton() {
        app.getHelperUser().openLoginFormHireNowButton();
        app.getHelperUser().fillLoginFormEmployer("winston@gmail.com", "Winston08");
        app.getHelperUser().login();
        Assert.assertTrue(app.getHelperUser().isErrorLoginOrPassword());
        app.getHelperUser().close();
    }
    @Test
    public void loginUnSuccessHireNowButtonIncorrectEmail() {
        app.getHelperUser().openLoginFormSignInButton();
        app.getHelperUser().fillLoginForm("allanteonegmail.com", "John6666");
        app.getHelperUser().login();
        Assert.assertTrue(app.getHelperUser().isWrongEmailFormat());
        app.getHelperUser().close();

    }
    @Test
    public void loginUnSuccessHireNowButtonIncorrectPassword() {
        app.getHelperUser().openLoginFormSignInButton();
        app.getHelperUser().fillLoginForm("allanteone@gmail.com", "John");
        app.getHelperUser().login();
        Assert.assertTrue(app.getHelperUser().isWrongPasswordFormat());
        app.getHelperUser().close();


    }

}
