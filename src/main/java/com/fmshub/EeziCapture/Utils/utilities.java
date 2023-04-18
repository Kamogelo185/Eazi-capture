package com.fmshub.EeziCapture.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class utilities {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public static Actions actions;
    public static int wait = 30;

    public static int timeout = 60;

    public static void open_Browser() {
        try {
            File file = new File("C:\\Drivers\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            ChromeOptions options = new ChromeOptions();
            //options.setHeadless(true);
            options.setAcceptInsecureCerts(true);
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
            actions = new Actions(driver);
            driverWait = new WebDriverWait(driver,wait);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void launch_App(String URL) {
        try {
            driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(URL);
        } catch (Exception e) {
        }
    }

    public static void closeBrowser(){
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String Select(WebElement element, String by, String value){

        String x = null;
        Select Types = new Select(element);
        if (by.contains("Value")){
            Types.selectByValue(value);
        }else if (by.contains("Index")){
            Types.selectByIndex(Integer.parseInt(value));
        }
        else if (by.contains("Visible")){
            Types.selectByVisibleText(value);
        }

        x = Types.toString();
        return x;
    }
    //Get text box Texts
    public static String GetText(WebElement element)
    {
        return element.getText();
    }

    //Get a value from a control
    public static String GetValue(WebElement element)
    {
        return element.getAttribute("value");
    }

    // Check if the checkbox is checked
    public static String GetStatus(WebElement element)
    {
        return element.getAttribute("checked");
    }

    //Get Dropdown Texts
    public static String GetTextDDL(WebElement element,String value)
    {
        return "";
    }

    //Check if the element exit
    public static Boolean Exist(WebElement element){
        if (element.isDisplayed()){
            return true;
        }
        {
            return false;
        }
    }

    //Enter Texts
    public static void EnterText(WebElement element, String value) throws InterruptedException {
        element.clear();
        Thread.sleep(wait);
        element.click();
        element.sendKeys(value);
    }

    //Click Events
    public static void Click(WebElement element) throws InterruptedException {
        Thread.sleep(wait);
        isDisplayed(element);
        Thread.sleep(wait);
        element.click();
        //log.info(element.getText());
    }

    //Click Events
    public static void JSClick(WebElement element) throws InterruptedException {
        isDisplayed(element);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(wait);
    }

    //Checkboxes
    public static void Check(WebElement element) throws InterruptedException {
        Thread.sleep(wait);
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    //Check if Element is Displayed
    public static void isDisplayed(WebElement element) throws InterruptedException {
        Thread.sleep(wait);
        for (int second = 0; ; second++){
            if (second >= timeout) Assert.fail("Timeout at " + element);
            try
            {
                if (element.isDisplayed()){
                    break;}
            }
            catch (Exception e)
            { }
            Thread.sleep(wait);
        }
    }

}