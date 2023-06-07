package myPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


   // - C01_TekrarTesti isimli bir class  olusturun
   // - https://www.google.com/  adresine gidin
        driver.get(" https://www.google.com/ ");

   // - cookies uyarisini  kabul ederek kapatin
   //- Sayfa	basliginin"Google"ifadesi	icerdigini	test  edin
   // - Arama cubuguna "Nutella" yazip aratin
   // - Bulunan sonuc sayisini yazdirin
   // - Sonuc sayisinin 10 milyon'dan fazla oldugunu test  edin
   // - Sayfayi kapatin


    }
}
