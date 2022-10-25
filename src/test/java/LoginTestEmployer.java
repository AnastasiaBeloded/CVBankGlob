import org.testng.annotations.Test;

public class LoginTestEmployer extends TestBase{


    @Test
    public void loginSuccessForEmployerButton() {
        app.getHelperUser().openloginFormForEmployerButton();
        app.getHelperUser().fillLoginFormEmployer("allanteone@gmail.com","John6666");
        app.getHelperUser().login();
        app.getHelperUser().pause(1000);
        app.getHelperUser().logout();

    }
}
