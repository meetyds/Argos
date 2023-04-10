package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Register {
    WebDriver driver;
    @Given("^User Able to open Browser$")
    public void user_Able_to_open_Browser()  {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
    }

    @Given("^Enter URL$")
    public void enter_URL()  {
        driver.get("https://www.tesco.com/");
        driver.findElement(By.cssSelector("span[class='base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 dZOmBy kpsign beans-button__text']")).click();
        driver.findElement(By.xpath("//*[@id=\"appbar.sign-in\"]/span")).click();
    }

    @Given("^Click on Register Link$")
    public void click_on_Register_Link()  {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div/div[1]/div/a")).click();

    }
    @Given("^Enter valid Email address and Password$")
    public void enter_valid_Email_address_and_Password()  {
        driver.findElement(By.id("email")).sendKeys("meetkumarpatel123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Miren@meet0405");
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0,700)");
    }

    @Then("^select valid clubcard option$")
    public void select_valid_clubcard_option() {
        WebElement rd1 = driver.findElement(By.id("pages.landing.clubcard.radio-labels.join"));
        WebElement rd2 = driver.findElement(By.id("pages.landing.clubcard.radio-labels.already-have"));
        WebElement rd3 = driver.findElement(By.id("pages.landing.clubcard.radio-labels.opt-out"));
        rd3.click();
       // driver.findElement(By.xpath("//*[@id=\"pages.landing.clubcard.radio-labels.opt-out\"]")).isSelected();
     //   JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,500");
    }

    @Then("^Enter Personal details Title,First Name and Last Name and Mobile Number$")
    public void enter_Personal_details_Title_First_Name_and_Last_Name_and_Mobile_Number()  {
        Select drpTitle = new Select(driver.findElement(By.name("title")));
       // drpTitle.selectByVisibleText("Mr");
        drpTitle.selectByVisibleText("Mr");
        driver.findElement(By.id("first-name")).sendKeys("Meet");
        driver.findElement(By.id("last-name")).sendKeys("Patel");
        driver.findElement(By.id("phone-number")).sendKeys("07502070526");
    }

    @Then("^Enter Address$")
    public void enter_Address()  {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div/div/div/div/form/button[1]/span/span")).click();
        driver.findElement(By.id("address-line1")).sendKeys("144,St Georges Road");
        driver.findElement(By.xpath("//*[@id=\"town\"]")).sendKeys("London");
        driver.findElement(By.id("postcode")).sendKeys("E7 8HS");
    }

    @Then("^select Marketing Communication$")
    public void select_Marketing_Communication() {

    }

    @Then("^Click on Create Account$")
    public void click_on_Create_Account() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/form/button/span/span")).click();
        //driver.findElement(By.cssSelector("span[class=\"base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 fCISLV jDTUbo beans-button__text']")).click();
       // driver.findElement(By.xpath("//*[@id=\"styled_modal\"]/div/div/div/div/div/div/button[2]/span/span")).click();
       // driver.findElement(By.xpath("//*[@id=\"send-otp-verification-button\"]/span/span")).click();
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //   driver.findElement(By.cssSelector("span[class=\"base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 fCISLV jDTUbo beans-button__text']")).click();
    }
    @Then("^also Register your account$")
    public void also_Register_your_account() {
        // driver.findElement(By.cssSelector("span[class=\"base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 fCISLV jDTUbo beans-button__text']")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div/div/div/button[2]/span/span")).click();
    }
    @Then("^Close the Browser$")
    public void close_the_Browser()  {
     //   driver.quit();
    }

}
