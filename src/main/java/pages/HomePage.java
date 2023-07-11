package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class HomePage extends Utility {

    By women = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    // Mouse Hover on Tops

    By men = (By.xpath("//span[normalize-space()='Men']"));
    // Mouse Hover on Bottoms
    By bottoms = (By.xpath("//a[@id='ui-id-18']"));
    // Click on Pants
    By pants = (By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"));

    By gear = (By.xpath("//span[normalize-space()='Gear']"));
    // Click on Bags
    By bags = (By.xpath("//span[normalize-space()='Bags']"));
    // Click on Product Name ‘Overnight Duffle’


    public void clickOnWomenJackets() {
        sleep(1000);
        mouseHoverToElement(women);
        mouseHoverToElement(tops);
        mouseHoverToElementAndClick(jackets);
    }

    public void clickOnMensPants() {

        sleep(2000);
        mouseHoverToElement(men);
        mouseHoverToElement(bottoms);
        mouseHoverToElementAndClick(pants);

    }

    public void clickOnGearBags() {
        mouseHoverToElement(gear);
        mouseHoverToElementAndClick(bags);
    }

}
