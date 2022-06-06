package PageObjectModel;

import javafx.css.CssMetaData;
import javafx.css.Styleable;
import javafx.scene.control.cell.PropertyValueFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.fetch.model.AuthChallengeResponse;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpRequest;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.xml.ws.Response;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class theCircus_Page extends AbstarctClass{

    WebDriver driver;
    public theCircus_Page(){
        driver= utilities.Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='imdbHeader-navDrawerOpen--desktop']")
    private WebElement menuButton;
    public void clickMenuButton(){

        clickFunction(menuButton);
    }

    @FindBy(xpath = "//*[text()='Oscars']")
    private WebElement oscarsButton;
    public void clickOscarsButton(){
        clickFunction(oscarsButton);
    }

    @FindBy(xpath = "//*[a='1929']")
    private WebElement dateButton;
    public void clickDateButton(){
        clickFunction(dateButton);
    }

    @FindBy(xpath = "//*[@id=\"center-3-react\"]/div/div/div[2]/h3/div/div/div/div[2]/div[1]/a/img")
    private WebElement circusButton;
    public void clickCircusButton(){
        clickFunction(circusButton);
    }


    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[1]/div/ul/li/a")
    private WebElement directorText;
    public void getDirectorText() {
        System.out.println(directorText.getText());

    }
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/div[3]/ul/li[2]/div/ul/li/a")
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
    public void clickİmdbButton(){
        clickFunction(imdbButton);
    }

    @FindBy(xpath = "//*[@id=\"suggestion-search\"]")
    private WebElement searchTextArea;
    public void typeSearch(){
       sendKeysFunction(searchTextArea,"The Circus");
    }

    @FindBy(xpath = "//*[@id=\"react-autowhatever-1--item-0\"]/a/div[1]")
    private WebElement circus2Button;
    public void clickCircus2Button(){
        clickFunction(circus2Button);
    }

    private WebElement newDirectorText;
    public void getNewDirectorText() {
        String newDirector="Charles Chaplin";
        Assert.assertEquals(newDirector,directorText.getText());
        System.out.println("Checkes done");

    }
    private WebElement newWriterText;
    public void getNewWriterText() {
        String newWriter="Charles Chaplin";
        Assert.assertEquals(newWriter,writerText.getText());
        System.out.println("Checkes done");
    }
    private WebElement newStarsText;
    public void getNewStarsText() {
        String newStars="Charles ChaplinMerna KennedyAl Ernest Garcia";
        Assert.assertEquals(newStars,starsText.getText());
        System.out.println("Checkes done");
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[2]/div[1]/a/h3")
    private WebElement photosButton;
    public void clickPhotosButton(){
        clickFunction(photosButton);
    }



    private WebElement imagesBroken;
    public void brokenImages(){
    brokenImagesFunciton(imagesBroken);

}
}
