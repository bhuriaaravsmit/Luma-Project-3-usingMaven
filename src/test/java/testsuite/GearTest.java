package testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GearPage;
import pages.GearPageShoppingCart;
import pages.HomePage;
import testbase.BaseTest;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    GearPageShoppingCart gearPageShoppingCart=new GearPageShoppingCart();

    @Test
    public void verifyTheOvernightDuffle() {

        sleep(3000);
        homePage.clickOnGearBags();
        gearPage.clickOnProductName();
        sleep(2000);
        verifyText(gearPage.getOvernightDuffleText(), "Overnight Duffle");
        sleep(2000);

        gearPage.changeQuantityAddtoCart("3");
        sleep(2000);
        verifyText(gearPage.getOvernightDuffleMessage(), "You added Overnight Duffle to your shopping cart.");
        gearPage.clickOnCartLink();

        sleep(4000);
        verifyText(gearPageShoppingCart.productName, "Overnight Duffle");
        Assert.assertEquals("3",
                getAttributeValue(By.xpath("//input[@title='Qty']"), "value"));
        verifyText(gearPageShoppingCart.totalPrice, "$135.00");


        gearPageShoppingCart.updateQty("5");
        sleep(4000);
        verifyText(gearPageShoppingCart.totalPrice, "$225.00");



    }



}