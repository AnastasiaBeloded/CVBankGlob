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

}


