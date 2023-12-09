package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.DashboradUI;

public class AddNewTodo {

        public static void as (WebDriver driver, String task){
            Enter.text(driver, DashboradUI.inputTask, task);
            Click.on(driver, DashboradUI.addButton);
        }
}
