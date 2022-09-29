package org.example.page;

import org.example.methods.Methods;
import org.example.driver.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;


public class A101Page extends BaseTest {

    private Methods methods;


    public A101Page(){
        methods = new Methods();
    }

    public void a101(){

        methods.click(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll' and text()='Kabul Et']"));
        methods.click(By.xpath("//a[@title='GİYİM & AKSESUAR']"));
        methods.click(By.xpath("//li[@class='derin ']/a[@title='Kadın İç Giyim']"));
        methods.waitUntilElementVisible(By.cssSelector("div[class=\"products-list\"]"));
        methods.click(By.xpath("//li[@class='derin ']/a[@title='Dizaltı Çorap']"));
        methods.click(By.cssSelector("article[data-pk=\"18864\"]"));

        Assert.assertTrue("Diz altı çorabın rengi siyah değil, test hatalı!", methods.isElementVisible(By.xpath("//span[text()='SİYAH']")) == true);

        methods.click(By.xpath("//i[@class='icon-sepetekle']"));

        methods.click(By.xpath("//a[text()='Sepeti Görüntüle'][2]"));

        methods.click(By.xpath("(//a[@title='Sepeti Onayla'])[2]"));

        methods.click(By.xpath("(//a[@title='ÜYE OLMADAN DEVAM ET'])"));
        methods.sendKey(By.xpath("(//input[@name='user_email'])"), "tstuser23@gmail.com");
        methods.click(By.xpath("//button[contains(text(),'DEVAM ET')]"));
        methods.click(By.xpath("(//a[@title='Yeni adres oluştur' and @class='new-address js-new-address'])[1]"));
        methods.sendKey(By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']"),"Ev");
        methods.sendKey(By.xpath("//input[@name='first_name']"),"TEST");
        methods.sendKey(By.xpath("//input[@name='last_name']"),"USER");

        methods.sendKey(By.xpath("//input[@name='phone_number']"),"5399769493");

        methods.selectByText(By.xpath("//select[@name='city']"),"İSTANBUL");

        methods.selectByText(By.xpath("//select[@name='township']"),"KARTAL");

        methods.selectByText(By.xpath("//select[@name='district']"),"CUMHURİYET MAH");

        methods.sendKey(By.cssSelector(".js-address-textarea"),"CUMHURİYET MAH AYDOS CAD HAZAL SK NO:15 KARTAL/İSTANBUL");


        methods.click(By.xpath("//button[contains(text(),'KAYDET')]"));

        methods.click(By.cssSelector(".button.block.green.js-proceed-button"));

        methods.sendKey(By.xpath("(//input[@name='name'])[2]"),"Test User");

        methods.click(By.cssSelector(".order-complete"));


















    }

}

