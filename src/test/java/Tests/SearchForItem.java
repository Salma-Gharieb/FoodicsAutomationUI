package Tests;

import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchForItem extends TestBase{

    SearchPage searchObj;

    @Test
    public void UserCanSearchForItemSuccessfully() {

        searchObj = new SearchPage(driver);
        searchObj.Search();
        Assert.assertTrue(searchObj.resultNo.isDisplayed());
        Assert.assertTrue(searchObj.relatedSearches.isDisplayed());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        searchObj.navigateToPage2();
    }

}
