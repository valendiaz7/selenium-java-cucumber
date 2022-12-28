package pages;

public class PerozziPage extends BasePage {

    private String inputBusqueda = "//*[@id=\"search_widget\"]/form/div[1]/input";
    private String clickButton = "//*[@id=\"search_widget\"]/form/div[1]/button/svg";


    public PerozziPage() {
        super(driver);
    }

    public void navigateToPerozzi(){
        navigateTo("https://www.perozzi.com.ar/");
    }

    public void ingresoBusqueda(String criterio){
        write(inputBusqueda, criterio);
    }

    public void clickButton(){
        clickElementByxpath(clickButton);
    }
}
