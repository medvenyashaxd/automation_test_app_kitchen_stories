package com.example.myapplication.test;

import com.example.myapplication.base_screen.baseScreen;
import com.example.myapplication.environment.SetUpMobileDriver;
import com.example.myapplication.locators.locators;
import org.junit.jupiter.api.Test;



public class ExampleUnitTest extends SetUpMobileDriver{

    locators locator = new locators();
    baseScreen action = new baseScreen();


    @Test
    public void first_test(){
        action.tapById(locator.buttonNope);


    }

}