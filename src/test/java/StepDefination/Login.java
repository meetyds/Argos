package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("^User must be open a browser$")
    public void user_must_be_open_a_browser()  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter url$")
    public void enter_url()  {
        driver.get("https://www.argos.co.uk/");
    //    driver.findElement(By.cssSelector("span[class='base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 dZOmBy kpsign beans-button__text']")).click();
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    @Then("^Click on Sign In Button$")
    public void click_on_Sign_In_Button()  {
        driver.findElement(By.xpath("//*[@id=\"haas-v2\"]/div[3]/div/div[3]/a[2]/span")).click();
    }

    @Then("^Enter Username And Password$")
    public void enter_Username_And_Password() {
        driver.findElement(By.id("email-address")).sendKeys("meetkumarpatel123@gmail.com");
        driver.findElement(By.id("current-password")).sendKeys("Miren@meet0405");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/section/div[2]/div[1]/div/div/div[3]/form")).click();
    }

    @Then("^User is At Home Page$")
    public void user_is_At_Home_Page() {
        driver.get("https://www.argos.co.uk/");
    }

    @Then("^User Close the Window$")
    public void user_Close_the_Window() {

    }
}
