import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddNewTodo;
import task.tasking.Login;
import task.validations.IsTaskAdd;

public class AddNew extends BaseTest {
    @Test
    public void addNewtask(){
        Login.as(webDriver, "d.adriazolamuriel@gmail.com","patito.123");
        AddNewTodo.as(webDriver, "Tarea completada");
        Assert.assertTrue(IsTaskAdd.getTextSuccess(webDriver).contains("Tarea completada"));

    }
}
