package pages;

public class UdemyPage extends BasePage{

    private String searchTextField = "//*[@id=\"u245-search-form-autocomplete--3\"]";
    private String clickButton = "//*[@id=\"es\"]/div[1]/div[1]/div[3]/div[2]/form/button/svg/use";
    private String filterCheckbox = "";
    private String coursesMessage = "";

    public UdemyPage() {
        super(driver);
    }

    public void navigateToUdemy(){
        navigateTo("https://www.udemy.com/");
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public void clickButton(){
        clickElementByxpath(clickButton);
    }

    public void aplyFilters(){
        clickElementByxpath(filterCheckbox);
    }

    public String coursesMessage(){
        return textFromElement(coursesMessage);
    }

}
