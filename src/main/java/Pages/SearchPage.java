package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    public WebDriver driver;
    public SearchPage(WebDriver driver) { super(driver);}

    @FindBy(name = "q")
    WebElement searchBar;
    @FindBy(id = "APjFqb")
    WebElement searchArea;
    @FindBy(id = "result-stats")
    public WebElement resultNo;
    @FindBy(css = "#bres > div.ULSxyf > div > div > div > div.kfsfbe.adDDi > div > div > span")
    public WebElement relatedSearches;
    @FindBy(xpath = "//*[@id=\"pnnext\"]/span[2]")
    WebElement nextPage;
    public void Search() {

        searchBar.sendKeys("Foodics" + Keys.ENTER);
        searchArea.clear();
        searchArea.sendKeys("Software Testing" + Keys.ENTER);
    }

    public void navigateToPage2() {

        nextPage.click();
    }


}
