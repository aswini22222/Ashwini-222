package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CounterFunctionalitySteps {
    public WebDriver driver;
    int expectedCount;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I am on the click counter page with initial count as zero")
    public void Iamontheclickcounterpagewithinitialcountas0() {
        driver.get("https://qaclickcounter.ccbp.tech/");
        expectedCount = 0;
    }
    @When("I click the 'Click Me!' button 100 times")
    public void clicktheclickMEbutton(){
        for(int i=0;i<100;i++){
            driver.findElement(By.className("button")).click();
            expectedCount++;

        }
    }
    @Then("the counter should show the count of the clicks")
    public void countershowcountofclicks(){
        String ExpcountText=driver.findElement(By.className("counter-value")).getText();
        int actualcount=Integer.parseInt(ExpcountText);
        Assert.assertEquals(Integer.toString(actualcount),ExpcountText,"Click Counter App: Working as Expected");

    }
}

