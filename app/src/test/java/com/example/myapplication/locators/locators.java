package com.example.myapplication.locators;

import org.openqa.selenium.By;

public class locators {
    public final By buttonNope = By.xpath("//android.widget.TextView[@text='Nop']");
    public final By buttonSearch = By.id("com.ajnsnewmedia.kitchenstories:id/bottom_nav_item_search");
    public final By buttonPasta = By.xpath("//android.widget.TextView[@text='Pasta']");
    public final By buttonMain = By.xpath("//android.widget.TextView[@text='Main']");
    public final By buttonAsian = By.xpath("//android.widget.TextView[@text='Asian']");
    public final By notificationSort = By.id("android:id/text1");

    public final By recipesInput = By.id
                                ("com.ajnsnewmedia.kitchenstories:id/search_bar_view_edit_text");

    public final By pizzaIconSearch = By.xpath("//android.widget.TextView[@text='Pizza']");
    public final By soupWithDaikon = By.xpath
            ("//android.widget.TextView[@text='Easy glass noodle soup with daikon radish and bok choy']");

    public final By addToShoppingList = By.id("com.ajnsnewmedia.kitchenstories:id/btn_shopping_list");
    public final By updateNotice = By.id("com.ajnsnewmedia.kitchenstories:id/snackbar_action");
    public final By shoppingList = By.id("com.ajnsnewmedia.kitchenstories:id/shopping_list_item_title");

}
