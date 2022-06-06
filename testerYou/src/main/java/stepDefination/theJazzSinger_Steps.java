package stepDefination;


import PageObjectModel.theJazzSinger_Page;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class theJazzSinger_Steps {

    theJazzSinger_Page theJazzSinger_page=new theJazzSinger_Page();
    private WebDriver driver;

    @Given("^navigate to website2$")
    public void navigate_to_website2() throws Throwable {
        System.out.println("went to imdb site");
        driver= utilities.Driver.getDriver();
        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Given("^I click menu2$")
    public void ı_click_menu2() throws Throwable {
        System.out.println("menu button clicked");
        theJazzSinger_page.clickMenuButton();

    }
    @Given("^I click oscars2$")
    public void ı_click_oscars2() throws Throwable {
        System.out.println("clicked the oscars button");
        theJazzSinger_page.clickOscarsButton();

    }
    @Given("^I click date2$")
    public void ı_click_date2() throws Throwable {
        System.out.println("1929 value selected");
        theJazzSinger_page.clickDateButton();

    }
    @Given("^I click The Jazz Singer$")
    public void ı_click_The_Jazz_Singer() throws Throwable {
        System.out.println("selected the The Jazz Singer ");
        theJazzSinger_page.clickJazzSingerButton();

    }
    @Given("^I  recording the information of the jazz$")
    public void ı_recording_the_information_of_the_jazz() throws Throwable {
        System.out.println(" information saved ");
        theJazzSinger_page.getDirectorText();
        theJazzSinger_page.getWriterText();
        theJazzSinger_page.getStarsText();

    }
    @Given("^I click Imdb2$")
    public void ı_click_imdb2() throws Throwable {
        System.out.println("imdb button clicked");
        theJazzSinger_page.clickImdbButton();

    }
    @Given("^I write the jazz in the search field$")
    public void ı_write_the_jazz_in_the_search_field() throws Throwable {
        System.out.println("the jazz is written in the search field");
        theJazzSinger_page.typeSearch();

    }
    @Given("^I click Jazz$")
    public void ı_click_jazz() throws Throwable {
        System.out.println("clicked the jazz");
        theJazzSinger_page.clickJazzSinger2Button();

    }
    @Given("^I checking the jazz info$")
    public void ı_checking_the_jazz_info() throws Throwable {

        theJazzSinger_page.getNewDirectorText();
        theJazzSinger_page.getNewWriterText();
        theJazzSinger_page.getNewStarsText();
    }
    @Given("^I click see all photos link2$")
    public void ı_click_see_all_photos_link2() throws Throwable {
        System.out.println("Click the see all photos link");
        theJazzSinger_page.clickPhotosButton();

    }

    @Given("^I checking for broken links2$")
    public void ı_checking_for_broken_links2() throws Throwable {
        System.out.println("Check for broken links completed");
        theJazzSinger_page.brokenImages();

    }
}


