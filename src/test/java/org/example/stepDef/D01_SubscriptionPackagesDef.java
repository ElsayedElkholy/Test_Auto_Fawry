package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.BasePage;
import org.example.pages.P01_PlansPage;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.stepDef.Hooks.driver;
import static org.junit.Assert.assertArrayEquals;

public class D01_SubscriptionPackagesDef {
    P01_PlansPage plansPage =new P01_PlansPage();
    BasePage BasePage =new BasePage();
    String current_url = driver.getCurrentUrl().toLowerCase();

    @Given("user navigate to Plans page")
    public void user_navigate_to_Plans_page(){
        String url = "https://subscribe.stctv.com/sa-en";
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @When("user Select Country KSA")
    public void user_Select_Country_KSA() {
        BasePage.Select_Country().click();
        BasePage.Select_KSA().click();
        Assert.assertTrue(current_url.equals("https://subscribe.stctv.com/sa-en"));
    }
    @Then("Verify that the package types are displayed")
    public void Verify_that_the_package_types_are_displayed(){
        String[] expectedPackageNames = {"lite", "classic", "premium"};
        String[] actualPackageNames = {
                plansPage.Package_Name_Lite().getText().toLowerCase(),
                plansPage.Package_Name_Classic().getText().toLowerCase(),
                plansPage.Package_Name_Premium().getText().toLowerCase()
        };
        assertArrayEquals(expectedPackageNames, actualPackageNames);
    }

    @And("Verify that the currency type is \"(.*)\"$")
    public void Verify_that_the_currency_type_is_correct(String currencyType) {
        String lite = plansPage.Package_currency_Lite().getText().toLowerCase();
        String classic = plansPage.Package_currency_Classic().getText().toLowerCase();
        String premium = plansPage.Package_currency_Premium().getText().toLowerCase();
        List<String> subscriptionTypes_currency = Arrays.asList(lite, classic, premium);
        Assert.assertTrue(subscriptionTypes_currency.contains(currencyType));
    }
    @And("Verify that the price Lite \"(.*)\" Classic \"(.*)\" Premium \"(.*)\"$")
    public void Verify_that_the_price_type_is_correct(String Lite ,String Classic,String Premium){
        String[] expectedPrices = {Lite, Classic, Premium};
        String[] actualPrices = {
                plansPage.Package_Price_Lite().getText().toLowerCase(),
                plansPage.Package_Price_Classic().getText().toLowerCase(),
                plansPage.Package_Price_Premium().getText().toLowerCase()
        };

        for (int i = 0; i < expectedPrices.length; i++) {
            Assert.assertTrue(actualPrices[i].contains(expectedPrices[i]));
        }
    }
    @When("user Select Country Kuwait")
    public void user_Select_Country_Kuwait(){
        BasePage.Select_Country().click();
        BasePage.Select_Kuwait().click();
        Assert.assertEquals("https://subscribe.stctv.com/kw-en", current_url);
    }
    @When("user Select Country Baharin")
    public void user_Select_Country_Bahrain(){
        BasePage.Select_Country().click();
        BasePage.Select_Baharin().click();
        Assert.assertEquals("https://subscribe.stctv.com/bh-en", current_url);

    }






}