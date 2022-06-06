package stepDefination;

import PageObjectModel.theCircus_Page;
import cucumber.api.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class theCircus_Steps {

    theCircus_Page theCircus_page=new theCircus_Page();
    private WebDriver driver;

    @Given("^navigate to website$")
    public void navigate_to_website() throws Throwable {
    System.out.println("went to imdb site");
    driver= utilities.Driver.getDriver();
    driver.get("https://www.imdb.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }
    @Given("^I click menu$")
    public void ı_click_menu() throws Throwable {
        System.out.println("menu button clicked");
        theCircus_page.clickMenuButton();

    }
    @Given("^I click oscars$")
    public void ı_click_oscars() throws Throwable {
        System.out.println("clicked the oscars button");
        theCircus_page.clickOscarsButton();

    }
    @Given("^I click date$")
    public void ı_click_date() throws Throwable {
        System.out.println("1929 value selected");
        theCircus_page.clickDateButton();

    }
    @Given("^I click The Circus$")
    public void ı_click_The_Circus() throws Throwable {
        System.out.println("selected the The Circus ");
        theCircus_page.clickCircusButton();

    }
    @Given("^I  recording the information of the circus$")
    public void ı_recording_the_information_of_the_circus() throws Throwable {
        System.out.println(" information saved ");
        theCircus_page.getDirectorText();
        theCircus_page.getWriterText();
        theCircus_page.getStarsText();

    }
    @Given("^I click Imdb$")
    public void ı_click_imdb() throws Throwable {
        System.out.println("imdb button clicked");
        theCircus_page.clickİmdbButton();

    }
    @Given("^I write the circus in the search field$")
    public void ı_write_the_circus_in_the_search_field() throws Throwable {
        System.out.println("the circus is written in the search field");
        theCircus_page.typeSearch();

    }
    @Given("^I click Circus$")
    public void ı_click_circus() throws Throwable {
        System.out.println("clicked the circus");
        theCircus_page.clickCircus2Button();

    }
    @Given("^I checking the circus info$")
    public void ı_checking_the_circus_info() throws Throwable {

        theCircus_page.getNewDirectorText();
        theCircus_page.getNewWriterText();
        theCircus_page.getNewStarsText();
    }
    @Given("^I click see all photos link$")
    public void ı_click_see_all_photos_link() throws Throwable {
         System.out.println("Click the see all photos link");
         theCircus_page.clickPhotosButton();

    }

    @Given("^I checking for broken links$")
    public void ı_checking_for_broken_links() throws Throwable {
        System.out.println("Check for broken links completed");
        theCircus_page.brokenImages();

    }
}
