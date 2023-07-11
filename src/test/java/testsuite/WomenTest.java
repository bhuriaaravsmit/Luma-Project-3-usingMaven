package testsuite;

import junit.framework.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WomenPage;
import testbase.BaseTest;

import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

HomePage homePage=new HomePage();
WomenPage womenPage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        // Mouse Hover on Women Menu
        homePage.clickOnWomenJackets();
        womenPage.sortByProductName();
        List<String> jacketsNameListBefore=womenPage.getJacketElements();
        List<String> jacketsNameListAfter=womenPage.getJacketElements();

    // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
    // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

  }

    @Test
    public void verifyTheSortByPriceFilter()throws InterruptedException {

        homePage.clickOnWomenJackets();
        womenPage.sortByPrice();
        sleep(1000);

        List<String> jacketsPriceListBefore=womenPage.getPriceElements();
        List<String> jacketsPriceListAfter=womenPage.getPriceElements();

        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }


}
