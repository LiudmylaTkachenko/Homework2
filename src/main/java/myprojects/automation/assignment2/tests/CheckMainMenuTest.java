package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get ("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).click();

        //Кликнуть на каждом видимом пункте главного меню
        By menuLocator = By.xpath("//nav/ul[contains(@class,'menu')]/li/a");
        int count = driver.findElements(menuLocator).size();
        for (int i = 0; i < count; i++) {
            WebElement current = driver.findElements(menuLocator).get(i);
            current.click();
            Thread.sleep(1000);
            //Вывести в консоль заголовок открытого раздела
            WebElement sectionElement = driver.findElement(By.tagName("h2"));
            String sectionName = sectionElement.getText();
            System.out.println(sectionName);
            //Выполнить обновление страницы и проверить (пользователь остается в том же разделе)
            driver.navigate().refresh();
            Thread.sleep(1000);
            WebElement newSectionElement = driver.findElement(By.tagName("h2"));
            String newSectionName = newSectionElement.getText();
            if ( !sectionName.equals(newSectionName)) System.out.println("page name changed after refresh!");
        }
        //driver.quit();
    }
}
