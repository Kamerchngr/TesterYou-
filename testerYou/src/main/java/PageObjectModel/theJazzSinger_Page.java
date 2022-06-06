package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class theJazzSinger_Page extends AbstarctClass {

    WebDriver driver;

    public theJazzSinger_Page() {
        driver = utilities.Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='imdbHeader-navDrawerOpen--desktop']")
    private WebElement menuButton;

    public void clickMenuButton() {

        clickFunction(menuButton);
    }

    @FindBy(xpath = "//*[text()='Oscars']")
    private WebElement oscarsButton;

    public void clickOscarsButton() {
        clickFunction(oscarsButton);
    }

    @FindBy(xpath = "//*[a='1929']")
    private WebElement dateButton;

    public void clickDateButton() {
        clickFunction(dateButton);
    }

    @FindBy(xpath = "//*[@id=\"center-3-react\"]/div/div/div[1]/h3/div[10]/div[2]/div[1]/div[2]/div[1]/a/img")
    private WebElement jazzSingerButton;

    public void clickJazzSingerButton() {
        clickFunction(jazzSingerButton);
    }


    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[1]/div")
    private WebElement directorText;

    public void getDirectorText() {
        System.out.println(directorText.getText());

    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[2]/div")
    private WebElement writerText;

    public void getWriterText() {
        System.out.println(writerText.getText());

    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[3]/div")
    private WebElement starsText;

    public void getStarsText() {
        System.out.println(starsText.getText());

    }

    @FindBy(xpath = "//*[@id=\"home_img_holder\"]")
    private WebElement imdbButton;

    public void clickImdbButton() {
        clickFunction(imdbButton);
    }

    @FindBy(xpath = "//*[@id=\"suggestion-search\"]")
    private WebElement searchTextArea;

    public void typeSearch() {
        sendKeysFunction(searchTextArea, "The Jazz Singer");
    }

    @FindBy(xpath = "//*[@id=\"react-autowhatever-1--item-0\"]/a")
    private WebElement jazzSinger2Button;

    public void clickJazzSinger2Button() {
        clickFunction(jazzSinger2Button);
    }

    private WebElement newDirectorText;

    public void getNewDirectorText() {
        String newDirector = "Alan Crosland";
        Assert.assertEquals(newDirector, directorText.getText());
        System.out.println("Checkes done");

    }

    private WebElement newWriterText;

    public void getNewWriterText() {
        String newWriter = "Samson Raphaelson(play)Alfred A. Cohn(adaptation)Jack Jarmuth(titles)";
        Assert.assertEquals(newWriter, writerText.getText());
        System.out.println("Checkes done");
    }

    private WebElement newStarsText;

    public void getNewStarsText() {
        String newStars = "Al JolsonMay McAvoyWarner Oland";
        Assert.assertEquals(newStars, starsText.getText());
        System.out.println("Checkes done");
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[2]/div[1]/a/h3")
    private WebElement photosButton;

    public void clickPhotosButton() {
        clickFunction(photosButton);
    }


    private WebElement imagesBroken;
    public void brokenImages() {
        brokenImagesFunciton(imagesBroken);


    }
}