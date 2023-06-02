package techproed.day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");

        //arama kutusunu locate edelim
        WebElement aramakutusu = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        //“Samsung headphones” ile arama yapalim
        aramakutusu.sendKeys("Samsung headphones", Keys.ENTER);

        //Bulunan sonuc sayisini yazdiralim
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        //1-16 of 199 results for "Samsung headphones"
        String[] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi = " + sonucSayisi[2]);

        //İlk ürüne tıklayalım
        driver.findElement(By.xpath("(//h2//a)[1]")).click();

        //Sayfadaki tum basliklari yazdiralim
        List<WebElement> sayfaBaslıkları= driver.findElements(By.xpath("//h1|//h2|//h3|//h4"));
        sayfaBaslıkları.forEach(t-> System.out.println(t.getText()));

        driver.close();



    }
}
