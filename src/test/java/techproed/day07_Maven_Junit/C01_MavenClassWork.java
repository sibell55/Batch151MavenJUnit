package techproed.day07_Maven_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenClassWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //1.http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(2000);

        //2.Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        Thread.sleep(2000)
        ;
        //3.Login alanine "username" yazdirin
        WebElement login= driver.findElement(By.xpath("//input[@id='user_login']"));
        login.sendKeys("username");  //yazdırdık
        Thread.sleep(2000);

        //4.Password alanine "password" yazdirin
        WebElement password= driver.findElement(By.xpath("//input[@id='user_password']"));
        password.sendKeys("password");
        Thread.sleep(2000);


        //5.Sign in buttonuna tiklayin
        WebElement signin= driver.findElement(By.xpath("//input[@type='submit']"));
         signin.click();
         Thread.sleep(2000);

         //Güvenlik bölümünü geçmek için sayfada bir gerigelin
         driver.navigate().back();
         Thread.sleep(2000);

        // Online Banking bölümüne tıklayın
         driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
         Thread.sleep(2000);

        //6.Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();
        Thread.sleep(2000);

        //7.amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.xpath("//*[@id='sp_amount']")).sendKeys("100" + Keys.TAB);
        Thread.sleep(2000);

        //8.tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.xpath("//*[@id='sp_date']")).sendKeys("2020-09-10" + Keys.ENTER);
        Thread.sleep(2000);

        //9.Pay buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='pay_saved_payees']")).click();
        Thread.sleep(2000);

        //10."The payment was successfully submitted." mesajinin ciktigini control edin
        WebElement mesaj = driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));

        if(mesaj.isDisplayed()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        Thread.sleep(2000);


        // Sayfayi kapatın
        driver.close();


    }


}
