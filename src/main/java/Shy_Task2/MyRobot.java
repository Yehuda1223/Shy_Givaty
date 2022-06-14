package Shy_Task2;

import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class MyRobot {


       /*    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yz055\\OneDrive\\שולחן העבודה\\Selnium\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://web.whatsapp.com/");
*/

    public static void Whatsapp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yz055\\OneDrive\\שולחן העבודה\\Selnium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://web.whatsapp.com//");
        driver.manage().window().maximize();
        // List<WebElement> elementList = driver.findElements(By.className("_13NKt copyable-text selectable-text"));
        //   WebElement NameWhatsApp = elementList.get(0);
        // WebElement userINput = driver.findElement(By.className("_13NKt copyable-text selectable-text"));
        // userINput.sendKeys("משה וינרב");
        Thread t = new Thread(() -> {
            while (true) {
                boolean y = driver.getPageSource().contains("תיבת טקסט להזנת החיפוש");
                if (y) {
                    Window window = new Window();
                    JLabel label = new JLabel("התחברות בוצעה בהצלחה");
                    label.setBounds(10, 10, 100, 100);
                    label.add(window);

                    break;
                }

            }
        });
        t.start();


    }

}




