package pages;

public class MaximusPage extends BasePage {

    private String searchBox = "//*[@id=\"buscadorDesktop\"]";
    private String searchTextField = "//*[@id=\"busqueda\"]/div[6]/div[1]/div[2]/div[1]/button/img";
    private String messageText= "//*[@id=\"contenedornoproducto\"]/div[1]/p[2]";


    public MaximusPage() {
        super(driver);

    }

    public void navigateToMaximus(){
        navigateTo("https://www.maximus.com.ar/");

    }

    public void enterSearchCriteria(String criteria) {
        write(searchBox, criteria);

    }

    public void clickSearchButton() {
        clickElementByxpath(searchTextField);

    }

    public String messageText() {
        return textFromElement(messageText);

    }



}


