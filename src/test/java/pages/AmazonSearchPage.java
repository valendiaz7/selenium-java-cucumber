package pages;

import io.cucumber.java.en.Given;

public class AmazonSearchPage extends BasePage {

    private String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
    private String searchButton = "//*[@id=\"nav-search-submit-button\"]";
    private String oneResult = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
    private String addToCartButton = "//*[@id=\"add-to-cart-button\"]";
    private String addedMessageText = "//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span";

    public AmazonSearchPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com");
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
    }

    public void clickSearch(){
        clickElementByxpath(searchButton);
    }

    public void goToPage2() {
        goToLinkText("2");
    }

    public void pick3rdItem(){
        clickElementByxpath(oneResult);
    }

    public void addToCart(){
        clickElementByxpath(addToCartButton);
    }

    public String addedToCartMessage(){
        return textFromElement(addedMessageText);
    }

}
