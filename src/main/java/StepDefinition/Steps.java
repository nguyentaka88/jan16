package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("^Open the Chrome and launch the application$")
    public void open_the_Chrome_and_launch_the_application() throws Throwable{
        WebDriver driver = null;
        driver = initializeBrowser();
        accessServer(driver, "http://demo.guru99.com/v4");
        closeBrowser(driver);
        System.out.println("This step Open the Chrome and launch the application");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable{
        System.out.println("This step Enter the Username and Password");
    }

    @Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable{
        System.out.println("This step Reset the credential");
    }

    public static WebDriver initializeBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static void accessServer(WebDriver driver, String strServer) {
        driver.get(strServer);
    }

    private static void closeBrowser(WebDriver driver) {
        driver.close();
    }
}