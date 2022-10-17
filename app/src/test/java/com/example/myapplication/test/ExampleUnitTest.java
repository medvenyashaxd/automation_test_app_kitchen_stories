package com.example.myapplication.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.myapplication.base_screen.BaseAction;
import com.example.myapplication.environment.SetUpMobileDriver;
import com.example.myapplication.locators.locators;
import org.junit.jupiter.api.Test;


public class ExampleUnitTest extends SetUpMobileDriver {

    locators locator = new locators();
    BaseAction action = new BaseAction();

    @Test
    public void scrollTest(){
        action.setLandscapeScreenOrientation();
        action.tapByElement(locator.buttonNope);
        action.swipeByCoordinates(2000, 800, 2000, 150, 3, 500);
        action.tapByElement(locator.buttonSearch);
        action.swipeByCoordinates(2000,800, 2000, 600, 2, 500);
        action.tapByElement(locator.buttonPasta);
        action.tapByElement(locator.notificationSort);
        action.swipeByCoordinates(1000, 800, 1000, 400, 6, 500);

        action.tapByElement(locator.buttonSearch);
        action.swipeByCoordinates(2000,800, 2000, 600, 2, 500);
        action.tapByElement(locator.buttonMain);
        action.swipeByCoordinates(1000, 800, 1000, 400, 5, 500);


        action.tapByElement(locator.buttonSearch);
        action.swipeByCoordinates(2000,800, 2000, 600, 2, 500);
        action.tapByElement(locator.buttonAsian);
        action.swipeByCoordinates(1000, 800, 1000, 400, 6, 500);
    }

    @Test
    public void searchTest(){
        action.tapByElement(locator.buttonNope);
        action.tapByElement(locator.buttonSearch);
        action.tapByElement(locator.recipesInput);
        action.input(locator.recipesInput, "Pizza");
        action.tapByElement(locator.pizzaIconSearch);
        action.tapByElement(locator.notificationSort);
        action.swipeByCoordinates(540, 2000, 540, 540, 6, 500);
    }

    @Test
    public void shoppingListTest(){
        String dish = "Easy glass noodle soup with daikon radish and bok choy";
        action.tapByElement(locator.buttonNope);
        action.tapByElement(locator.buttonSearch);
        action.tapByElement(locator.recipesInput);
        action.input(locator.recipesInput, dish);
        action.tapByElement(locator.soupWithDaikon);
        action.swipeByCoordinates(540, 1400, 540, 300, 3, 700);

        action.swipeByCoordinates(1000, 1250, 650, 1250, 5, 400);
        action.tapByElement(locator.addToShoppingList);
        action.tapByElement(locator.updateNotice);
        String textShoppingList = action.get_text(locator.shoppingList);
        assertEquals(textShoppingList, dish);

    }
}