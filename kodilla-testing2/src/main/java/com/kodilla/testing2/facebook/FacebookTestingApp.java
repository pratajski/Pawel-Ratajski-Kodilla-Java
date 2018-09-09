package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
//    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_NAME = "//div[contains(@class, \"uiStickyPlaceholderInput\")]/input[1]";
    public static final String XPATH_LASTNAME = "//div[contains(@id, \"u_0_k\")]/select[1]";
//    public static final String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_58mq\")]/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_58mq\")]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_58mq\")]/div/span/span/select[3]";
    //*[@id="year"]

    public static void main (String[] args) {
        WebDriver driver = WebDriverConfig.getDiver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");
        WebElement nameField = driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("IMIE");
 //       WebElement lastNameField = driver.findElement(By.xpath(XPATH_LASTNAME));
 //       lastNameField.sendKeys("robotic contect");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(selectDay);
        selectBoard.selectByIndex(10);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectM = new Select(selectMonth);
        selectM.selectByIndex(5);

  //      while (!driver.findElement(By.xpath(XPATH_SELECT_YEAR)).isDisplayed());
        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectY = new Select(selectYear);
        selectY.selectByIndex(1982);
    }
}
