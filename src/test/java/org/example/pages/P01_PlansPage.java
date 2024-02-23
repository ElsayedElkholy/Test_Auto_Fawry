package org.example.pages;
import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P01_PlansPage {

    // Package Name Elements

    public WebElement Package_Name_Lite()
    {
        By Package_Lite = By.xpath("//strong[@id='name-lite']]");
        WebElement Package_Name_Lite = Hooks.driver.findElement(Package_Lite);
        return Package_Name_Lite;
    }

    public WebElement Package_Name_Classic()
    {
        By Package_Classic = By.xpath("//strong[@id='name-classic']");
        WebElement Package_Name_Classic = Hooks.driver.findElement(Package_Classic);
        return Package_Name_Classic;
    }
    public WebElement Package_Name_Premium()
    {
        By Package_Premium = By.xpath("//strong[@id='name-premium']");
        WebElement Package_Name_Premium = Hooks.driver.findElement(Package_Premium);
        return Package_Name_Premium;
    }
    // Package Price Elements
    public WebElement Package_Price_Lite()
    {
        By Package_Lite = By.xpath("//div[@id='currency-lite']");
        WebElement Package_Price_Lite = Hooks.driver.findElement(Package_Lite);
        return Package_Price_Lite;
    }
    public WebElement Package_Price_Classic()
    {
        By Package_Classic = By.xpath("//div[@id='currency-classic']");
        WebElement Package_Price_Classic = Hooks.driver.findElement(Package_Classic);
        return Package_Price_Classic;
    }
    public WebElement Package_Price_Premium()
    {
        By Package_Premium = By.xpath("//div[@id='currency-premium']");
        WebElement Package_Price_Premium = Hooks.driver.findElement(Package_Premium);
        return Package_Price_Premium;
    }
    // Package Currency Elements
    public WebElement Package_currency_Lite()
    {
        By Package_Premium = By.xpath("//div[@id='currency-premium']");
        WebElement Package_Price_Premium = Hooks.driver.findElement(Package_Premium);
        return Package_Price_Premium;
    }
    public WebElement Package_currency_Classic()
    {
        By Package_Premium = By.xpath("//div[@id='currency-premium']");
        WebElement Package_Price_Premium = Hooks.driver.findElement(Package_Premium);
        return Package_Price_Premium;
    }
    public WebElement Package_currency_Premium()
    {
        By Package_Premium = By.xpath("//div[@id='currency-premium']");
        WebElement Package_Price_Premium = Hooks.driver.findElement(Package_Premium);
        return Package_Price_Premium;
    }



}