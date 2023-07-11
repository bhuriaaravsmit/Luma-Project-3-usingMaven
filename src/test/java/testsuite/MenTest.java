package testsuite;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenPage;
import pages.ShoppingCart;
import testbase.BaseTest;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void verifyCartDetails() throws InterruptedException {
        sleep(2000);
        homePage.clickOnMensPants();
        menPage.selectAndClickCronusYogaPant();
        sleep(2000);
        //verify the text
        verifyText(menPage.getText(), "You added Cronus Yoga Pant to your shopping cart.");


        menPage.clickOnCartLink();
        sleep(2000);
        verifyText(shoppingCart.getCartText(),"Shopping Cart");
        verifyText(shoppingCart.getProductName(),"Cronus Yoga Pant");
        verifyText(shoppingCart.getProductColour(),"Black");
        verifyText(shoppingCart.getProductSize(),"32");


    }

}
