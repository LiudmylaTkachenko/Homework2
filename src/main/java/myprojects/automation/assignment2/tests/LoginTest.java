package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        //Открыть страницу админ панели
        driver.get ("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        //Ввести логин
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        //Ввести пароль
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        //Нажать на кнопку Логин
        driver.findElement(By.name("submitLogin")).click();
        //Нажать на пиктограмму пользователя
        driver.findElement(By.id("employee_infos")).click();
        //Нажать на кнопку Выход
        driver.findElement(By.id("header_logout")).click();
        //driver.quit();
    }
}
