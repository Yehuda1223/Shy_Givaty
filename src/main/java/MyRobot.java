import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyRobot {
    public static void main(String[] args)throws  Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yz055\\OneDrive\\שולחן העבודה\\Selnium\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aac.ac.il/");
        List<WebElement> elementsList=driver.findElements(By.linkText("מידע אישי"));
        WebElement personalInfoBotton=elementsList.get(0);
        Thread.sleep(10*1000);
        personalInfoBotton.click();
         //WebElement usernameInput=driver.findElement(By.id("Ecom_User_ID"));
         //usernameInput.sendKeys("gtgggggg");
         //WebElement passwordInput=driver.findElement(By.id("Ecom_Password"));
         //passwordInput.sendKeys("12345677889");
        WebElement numberid=driver.findElement(By.linkText("כניסה עם מסרון (SMS)"));
        WebElement openInId=elementsList.get(1);
        openInId.click();
        //numberid.sendKeys("gtgggggg");
        WebElement idInput=driver.findElement(By.id("Ecom_User_ID"));
        idInput.sendKeys("212799795");
    }
}