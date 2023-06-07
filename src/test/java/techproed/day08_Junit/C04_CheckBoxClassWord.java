package techproed.day08_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CheckBoxClassWord {

     // https://the-internet.herokuapp.com/checkboxes sayfasına gidin
     // Checkbox1 ve checkbox2 elementlerini locate edin.
     // Checkbox1 seçili değilse secin
     // Checkbox2 seçili değilse secin

    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown() throws Exception {
        driver.close();
    }

  /*  @Test @Ignore("Gereksiz")
    public void ignor() {
        driver.get("https://amazon.com/");
    }
    --Çaloşmasını istemediğimizde @Ignore kullanırız
 */
    @Test
    public void checkbox() throws InterruptedException {

        // https://the-internet.herokuapp.com/checkboxes sayfasına gidin
        driver.get(" https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(2000);

        // Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Thread.sleep(2000);

        // Checkbox1 seçili değilse secin
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        Thread.sleep(2000);

        // Checkbox2 seçili değilse secin,
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
        Thread.sleep(2000);



    }
}
