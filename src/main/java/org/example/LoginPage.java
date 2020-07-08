package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 30 , 150 );
    }

    public void login(String username, String password){
        webDriver.get("https://www.trendyol.com/");
        WebElement kapat=webDriver.findElement(By.xpath("//*[@id='popupContainer']/div/div[1]")); // çıkan pop-up kadın seçeneğine tıklamak için
        kapat.click();

        WebElement giris= webDriver.findElement(By.id("accountBtn"));
        giris.click();

        System.out.println("Web Sitesi Açıldı");

        //***  LOGIN ISLEMI

        WebElement email= webDriver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("eceakgull8@gmail.com");
        WebElement passwordd= webDriver.findElement(By.xpath("//*[@id='password']"));
        passwordd.sendKeys("123456ea");
        WebElement login = webDriver.findElement(By.id("loginSubmit"));
        login.click();

        System.out.println("Kullanıcı Girişi Başarılı!");

        //*** BİLGİSAYAR KELİMESİ ARATMA

        WebElement searchdata = webDriver.findElement(By.xpath("//*[@id='auto-complete-app']/div/div/input"));
        searchdata.sendKeys("Bilgisayar");
        WebElement ara = webDriver.findElement(By.xpath("//*[@id='auto-complete-app']/div/div/i"));
        ara.click();

        System.out.println("Bilgisayar için sonuç bulundu");

        //*** SEPETE EKLEME

        WebElement bilgisayarsec = webDriver.findElement(By.xpath("//*[@id='search-app']/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img"));
        bilgisayarsec.click();
        WebElement sepeteekle = webDriver.findElement(By.xpath("//*[@id='product-detail-app']/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]"));
        sepeteekle.click();

        //*** FİYAT KIYASLAMA

        WebElement fiyat = webDriver.findElement(By.xpath("//*[@id='search-app']/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/a/div[3]/div[2]/div[2]"));
        WebElement price = webDriver.findElement(By.xpath("//*[@id='basketPreviewcontent']/div[1]/ul/li/a/div[2]/p[2]/span"));

        if(fiyat.equals(price)){System.out.println("ÜRÜN FİYATLARI EŞİTTİR");}

        //*** SEPETTEKİ ÜRÜN FİYATINI ARTTIRMA

        WebElement basket = webDriver.findElement(By.xpath("//*[@id='basketPreviewcontent']/div[2]/a[1]"));
        basket.click();
        WebElement arttir = webDriver.findElement(By.xpath("//*[@id='partial-basket']/div/div[3]/div[2]/div[3]/div[1]/div/button[2]"));
        arttir.click();

        WebElement sayac = webDriver.findElement(By.xpath("//*[@id='partial-basket']/div/div[3]/div[2]/div[3]/div[1]/div/input"));







    }

}
