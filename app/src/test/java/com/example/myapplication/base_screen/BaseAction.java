package com.example.myapplication.base_screen;

import static com.example.myapplication.environment.SetUpMobileDriver.driver;
import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;


public class BaseAction {
    public static WebDriverWait wait;

    public void setLandscapeScreenOrientation(){
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }


    public WebElement findElement(By locator) {
        wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated((locator)));
    }


    public void tapByElement(By locator) {
        WebElement element = findElement(locator);
        element.click();
    }


    public void input(By locator, String text){
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public String get_text(By locator){
        String get_text = findElement(locator).getText();
        return get_text;
    }

    public void tapByCoordinates(int x, int y){
            new TouchAction(driver)
                    .tap(point(x, y))
                    .waitAction(waitOptions(ofMillis(500))).perform();
        }

    public void swipeByCoordinates(int x, int y, int endX, int endY, int count, int wait) {
        for (int i = 0; i < count; i++) {
            new TouchAction(driver)
                    .press(point(x, y))
                    .waitAction(waitOptions(ofMillis(wait)))
                    .moveTo(point(endX, endY))
                    .release().perform();
        }
    }

    public void swipeByPercentages(double startPercentage, double endPercentage,
                                   double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }
}