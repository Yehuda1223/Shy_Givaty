package Shy_Task2;

import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class MyRobot extends Window {


       /*    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yz055\\OneDrive\\שולחן העבודה\\Selnium\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://web.whatsapp.com/");
*/

    public static void OpenWhatsapp() throws InterruptedException {
        int y;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yz055\\OneDrive\\שולחן העבודה\\Selnium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://web.whatsapp.com//");
        driver.manage().window().maximize();
        // List<WebElement> elementList = driver.findElements(By.className("_13NKt copyable-text selectable-text"));
        //   WebElement NameWhatsApp = elementList.get(0);
        // WebElement userINput = driver.findElement(By.className("_13NKt copyable-text selectable-text"));
        // userINput.sendKeys("משה וינרב");


        while (true) {

            if (driver.getPageSource().contains("תיבת טקסט להזנת החיפוש")) {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setLayout(null);
                frame.setResizable(false);
                frame.setBounds(0, 0, 500, 500);
                JLabel text = new JLabel("is conected");
                text.setBounds(20, 20, 200, 200);
                frame.add(text);

                break;
            }


        }


    }
}




