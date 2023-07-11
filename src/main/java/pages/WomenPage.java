package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
    By sortBy = By.xpath("(//select[@id='sorter'])[1]");
    By jacketElements = By.xpath("//strong[@class='product name product-item-name']//a");

    public void sortByProductName() {
        selectByVisibleTextFromDropDown(sortBy, "Product Name");
    }

    public List<String> getJacketElements() {
        List<WebElement> jacketsElementsList = driver.findElements(jacketElements);
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }

    By sortByPrice = By.xpath("(//select[@id='sorter'])[1]");

    By priceElements = By.xpath("//span[@class='price-wrapper ']//span");

    public void sortByPrice() {

        selectByVisibleTextFromDropDown(sortByPrice, "Price");
    }
    public List<String> getPriceElements() {
        List<WebElement> priceElementsList = driver.findElements(priceElements);
        List<String> priceList = new ArrayList<>();
        for (WebElement price : priceElementsList) {
            priceList.add(price.getText());
        }
        return priceList;
    }

}
