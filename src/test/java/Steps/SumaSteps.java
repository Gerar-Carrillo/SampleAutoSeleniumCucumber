package Steps;

import Page.CalculatorPage;
import Utils.DriverInit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SumaSteps extends DriverInit {
    CalculatorPage calculatorPage = new CalculatorPage();
    WebDriverWait wait;

    @Given("I open the {string}")
    public void iOpenThe(String webDiver) {
        InitiateDriver(webDiver);
    }

    @When("i go the {string}")
    public void iGoThe(String webPage) {
        driver.get(webPage);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Logotipo de Desmos']")));
    }

    @And("Addition {string} and {string}")
    public void additionAnd(String number_1, String number_2){
        calculatorPage.selectNumber(driver,number_1);
        calculatorPage.selectNumber(driver,"Más");
        calculatorPage.selectNumber(driver,number_2);

    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        wait.until(ExpectedConditions.presenceOfElementLocated(calculatorPage.getResult()));
        Assert.assertEquals("The operation is wrong", Integer.parseInt(driver.findElement(calculatorPage.getResult()).getText()),Integer.parseInt(result));
    }
}
