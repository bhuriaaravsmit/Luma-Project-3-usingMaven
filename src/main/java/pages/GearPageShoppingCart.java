package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class GearPageShoppingCart extends Utility {

public By productName=By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

public By productQty=By.xpath("//input[@title='Qty']");

public By totalPrice = By.xpath("(//span[@class='cart-price']//span)[2]");

public By updateShoppingCart =By.xpath("//span[normalize-space()='Update Shopping Cart']");


public void updateQty(String qty){

    sendTextToElement(productQty,qty);
    clickOnElement(updateShoppingCart);
}

}
