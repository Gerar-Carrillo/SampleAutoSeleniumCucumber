package Page;

import Utils.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {
    private By result= By.xpath("//div[@class='dcg-basic-expression-value']//descendant::span[@class='dcg-mq-digit']");
    public void selectNumber(WebDriver driver, String number)
    {
        WebElement numberToSelect = driver.findElement(By.xpath("//span[@aria-label='"+number+"']"));
        numberToSelect.click();
    }

    public By getResult() {
        return result;
    }
}
