package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By login = By.xpath("//img[@src='/Images/design/pagelogin.png']");
    public static By email = By.id("ctl00_MainContent_LoginControl1_TextBoxEmail");
    public static By password = By.id("ctl00_MainContent_LoginControl1_TextBoxPassword");
    public static By loginButton = By.xpath("//div[@id='HPloginDiv']/div[1]//input[@class='HPLoginBtn']");
}