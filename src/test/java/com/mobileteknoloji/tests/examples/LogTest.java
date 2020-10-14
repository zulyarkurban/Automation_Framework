package com.mobileteknoloji.tests.examples;

import com.mobileteknoloji.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogTest {

    private static Logger log = LogManager.getLogger(LogTest.class.getName());

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        log.debug("Setting chrome driver property");

        Driver.getDriver().manage().window().maximize();
        log.info("Window Maximized");
        log.debug("Now hitting Amazon server");
        Driver.getDriver().get("https://www.amazon.com/");
        log.info("Landed on amazon home page");
        Actions a =new Actions(Driver.getDriver());


        Driver.getDriver().get("http://jqueryui.com/demos/droppable/");
        log.debug("Getting the frames count");
        System.out.println(Driver.getDriver().findElements(By.tagName("iframe")).size());
        log.info("Frames count retreived");
        try
        {
            Driver.getDriver().switchTo().frame(0);
            log.info("Successfully switched to frame");
        }
        catch(Exception e)
        {
            log.error("Cannot identify the frame");
        }
//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        log.debug("Identifying Draggable objects");
        WebElement draggable = Driver.getDriver().findElement(By.id("draggable"));
        WebElement droppable = Driver.getDriver().findElement(By.id("droppable"));
        new Actions(Driver.getDriver()).dragAndDrop(draggable, droppable).build().perform();
        log.info("Drag and drop success");

        Driver.closeDriver();

    }
}
