package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.HomePageUI;

public class Login {
    public static void as (WebDriver driver, String email, String password){
        Click.on(driver, HomePageUI.login);
        Enter.text(driver, HomePageUI.email, email);
        Enter.text(driver, HomePageUI.password, password);
        Click.on(driver, HomePageUI.loginButton);
    }
}
