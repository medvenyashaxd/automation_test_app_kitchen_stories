package com.example.myapplication.base_screen;

import static com.example.myapplication.environment.SetUpMobileDriver.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class baseScreen {
    public WebDriverWait wait;


    public WebElement findElement(By locator) {
        wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated((locator)));
    }

    public final void tapById(By locator){
        WebElement element = findElement(locator);
        element.click();
    }
}
