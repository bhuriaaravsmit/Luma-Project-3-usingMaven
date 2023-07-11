package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class MenPage extends Utility {


    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    By size = (By.xpath("(//div[@class='swatch-option text'])[1]"));
    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By colour = By.xpath("(//div[@class='swatch-option color'])[1]");
    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    By cart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    By text = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");



    public void selectAndClickCronusYogaPant() {

        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(size);
        mouseHoverToElementAndClick(colour);
        mouseHoverToElementAndClick(cart);

    }

    public By getText() {
        return text;
    }


    public String getTheText() {
        return getTextFromElement(text);
    }

    public void clickOnCartLink(){

        clickOnElement(shoppingCartLink);

    }



}
