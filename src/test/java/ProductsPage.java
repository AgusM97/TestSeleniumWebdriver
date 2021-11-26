import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject{

    @FindBy(xpath = "//span[contains(text(), 'Products')]")
    private WebElement products_label;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart_SauceBackpack;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cart_badge;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu_button;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout_button;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return products_label.getText();
    }

    public void addToCartBackpack(){
        addToCart_SauceBackpack.click();
    }

    public String getCartBadge(){
        return cart_badge.getText();
    }

    public void openSideMenu(){
        menu_button.click();
    }

    public void logout(){
        logout_button.click();
    }
}
