import models.User;
import org.testng.annotations.Test;

public class RegistrationTestsSeeker extends TestBase {

    @Test
    public void registrationSuccessSignInButton(){
        int i = (int)System.currentTimeMillis()/1000%3600;
        
        User user = new User("Noa", "Mio","mia"+i+"@gmail.com","Bio12345$","Bio12345$");
        app.getHelperUser().openSignUpForm();
        app.getHelperUser().fillSignUpForm(user);
        app.getHelperUser().signUp();
        app.getHelperUser().fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        app.getHelperUser().login();


    }

}
