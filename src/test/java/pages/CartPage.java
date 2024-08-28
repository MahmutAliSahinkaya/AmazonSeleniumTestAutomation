package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("span.a-size-base-plus.a-color-base");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        List<WebElement> products = getProducts();
        if (products.isEmpty()) {
            System.out.println("No products found in the cart.");
        } else {
            System.out.println("Products found in the cart: " + products.size());
        }
        return !products.isEmpty();
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }


}
