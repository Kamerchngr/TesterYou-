package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public abstract class AbstarctClass {

    private WebDriver driver = utilities.Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);


    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);

    }
    public void brokenImagesFunciton(WebElement imagesBroken) {
        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println("Total number of Images on the Page are " + imageList.size());

        for (int index = 0; index < imageList.size(); index++) {
            WebElement image = imageList.get(index);
            String imageURL = image.getAttribute("src");
            System.out.println("URL of Image " + (index + 1) + " is: " + imageURL);
            verifyLinks(imageURL);

            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                }
            } catch (Exception e) {
                System.out.println("Error Occured");
            }
        }

        driver.quit();
    }

    public static void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() >= 400) {
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
            } else {
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {

        }
    }
}