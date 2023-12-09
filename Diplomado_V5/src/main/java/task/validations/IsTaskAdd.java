package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.DashboradUI;

public class IsTaskAdd {

    public static String getTextSuccess(WebDriver webDriver){
        WebElement element = webDriver.findElement(DashboradUI.tasks);
        return element.getText();
    }

}
