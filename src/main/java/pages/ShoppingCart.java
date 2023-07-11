package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class ShoppingCart extends Utility {


    By cartText = By.xpath("//span[@class='base']");

    By productName =By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize =By.xpath("//dd[contains(text(),'32')]");
    By productColour =By.xpath("//dd[contains(text(),'Black')]");

    public By getCartText() {
        return cartText;
    }

    public By getProductName() {
        return productName;
    }

    public By getProductSize() {
        return productSize;
    }

    public By getProductColour() {
        return productColour;
    }

}

