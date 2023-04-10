package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddToCart {
    WebDriver driver;
    @Given("^User open a browser$")
    public void user_open_a_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.argos.co.uk/?clickOrigin=header:search:argos+logo");
        driver.manage().window().maximize();
        driver.findElement(By.id("consent_prompt_submit")).click();
    }
    @Given("^Enter search URL$")
    public void enter_search_URL()  {

    }
    @Then("^Search an item for purchase$")
    public void search_an_item_for_purchase() {
    //    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[3]/div/div[2]/div/form/input")).sendKeys("Fan");
    //    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div[3]/div/div[2]/div/form/input")).sendKeys("Fan");
      //  driver.findElement(By.xpath("||input[@role='combobox' and @aria-expanded'false']")).sendKeys("Fan");
  //      driver.findElement(By.xpath("//*[@id=\"haas-v2\"]/div[3]/div/div[2]/div/form/label")).sendKeys("Fan");
        driver.findElement(By.id("searchTerm")).sendKeys("fan");
        driver.findElement(By.xpath("//*[@id=\"haas-v2\"]/div[3]/div/div[2]/div/form/button[2]/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^Select an item which you want to purchase$")
    public void select_an_item_which_you_want_to_purchase() {
        driver.findElement(By.xpath("//*[@id=\"findability\"]/div[6]/div/div[5]/div[5]/div[1]/div/div[1]/div/div[2]/button/span/span")).click();
       // driver.findElement(By.xpath("/html/body/main/div/div[3]/div[3]/div/div/div[1]/footer/div/div/a")).click();
      //  driver.findElement(By.cssSelector("a[class='Buttonstyles__Button-sc-42scm2-2 cfMrAm']")).click();
        driver.findElement(By.cssSelector("a[class='Buttonstyles__Button-sc-42scm2-2 cfMrAm']")).click();
    }

    @Then("^add one more in selected one$")
    public void add_one_more_in_selected_one() {
        Select drpitem = new Select(driver.findElement(By.id("quantity4546546")));
        drpitem.selectByValue("2");
      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Then("^check avail for collect$")
    public void check_avail_for_collect() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div[2]/section[1]/div[2]/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("E7 8HS");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/main/div[2]/section[1]/div[2]/div/div/div[2]/div/form/div[3]/button[1]")).click();
     //   driver.findElement(By.id("basket-FulfilmentSelectorForm")).sendKeys("E7 8HS");
     //   driver.findElement(By.id("basket-FulfilmentSelectorForm-collectButton")).click();
      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

}
