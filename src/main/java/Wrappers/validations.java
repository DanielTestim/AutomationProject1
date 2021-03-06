package Wrappers;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class validations extends commonOps{
    @Step("Validate element text")
    public static void elementText(WebElement element, String expectedValue){
        assertEquals(element.getText(), expectedValue);
    }

    @Step("Count number of elements")
    public static void countNumberOfElements(List<WebElement> elements, int expectedListSize){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        assertEquals(elements.size(), expectedListSize);
    }
}
