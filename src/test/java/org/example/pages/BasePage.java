package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.stepDef.Hooks.driver;

public class BasePage {
    public WebElement Select_Country(){
        By Country_btn = By.xpath("//a[@id=\"country-btn\"]");
        WebElement Select_Country= driver.findElement(Country_btn);
        return Select_Country;
    }
    public WebElement Select_KSA(){
        By  SA_btn= By.xpath("//a[@id='sa']");
        WebElement Select_SA= driver.findElement(SA_btn);
        return Select_SA;
    }
    public WebElement Select_Kuwait(){
        By  KW_btn= By.xpath("//a[@id='kw']");
        WebElement Select_KW= driver.findElement(KW_btn);
        return Select_KW;
    }
    public WebElement Select_Baharin(){
        By  BH_btn= By.xpath("//a[@id='bh']");
        WebElement Select_BH= driver.findElement(BH_btn);
        return Select_BH;
    }


}
