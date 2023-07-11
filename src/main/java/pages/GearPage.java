package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class GearPage extends Utility {

    By ProductName = By.xpath("//a[normalize-space()='Overnight Duffle']");

    By overnightDuffleText=By.xpath("//span[@class='base']");

    By changedQty = By.xpath("//input[@id='qty']");

    By addToCart= By.xpath("//button[@id='product-addtocart-button']");


    By overnightDuffleMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnProductName(){
        clickOnElement(ProductName);
    }

    public By getOvernightDuffleText() {
        return overnightDuffleText;
    }

  public void changeQuantityAddtoCart(String qty) {

        sendTextToElement(changedQty,qty);
        clickOnElement(addToCart);
  }



    public By getOvernightDuffleMessage() {
        return overnightDuffleMessage;
    }

    public void clickOnCartLink(){

        clickOnElement(shoppingCartLink);

    }
}