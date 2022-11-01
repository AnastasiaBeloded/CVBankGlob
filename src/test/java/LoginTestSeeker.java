import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestSeeker extends TestBase {

    @Test
    public void loginSuccessSignInButton() {
        app.getHelperUser().openLoginFormSignInButton();
        app.getHelperUser().fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        app.getHelperUser().login();
        app.getHelperUser().pause(1000);
        app.getHelperUser().logout();

    }
    @Test
    public void loginSuccessCreateCVButton(){
        app.getHelperUser().openLoginFormCreateCVButton();
        app.getHelperUser().fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        app.getHelperUser().login();
        app.getHelperUser().pause(1000);
        app.getHelperUser().logout();

    }
    @Test
    public void loginUnSuccessSignInButton(){
        app.getHelperUser().openLoginFormSignInButton();
        app.getHelperUser().fillLoginForm("winston@gmail.com", "Winston08");
        app.getHelperUser().login();
        Assert.assertTrue(app.getHelperUser().isErrorLoginOrPassword());
        app.getHelperUser().close();
    }
    @Test
    public void loginUnSuccessSignInButtonIncorrectEmail() {
        app.getHelperUser().openLoginFormSignInButton();
        app.getHelperUser().fillLoginForm("winstongmail.com", "Winston08");
        app.getHelperUser().login();
        Assert.assertTrue(app.getHelperUser().isWrongEmailFormat());
        app.getHelperUser().close();

    }
    @Test
    public void loginUnSuccessSignInButtonIncorrectPassword() {
        app.getHelperUser().openLoginFormSignInButton();
        app.getHelperUser().fillLoginForm("winston@gmail.com", "Winston");
        app.getHelperUser().login();
        Assert.assertTrue(app.getHelperUser().isWrongPasswordFormat());
        app.getHelperUser().close();


    }

}


