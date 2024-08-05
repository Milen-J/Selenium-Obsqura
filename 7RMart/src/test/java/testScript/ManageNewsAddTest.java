package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManageNewsAddPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class ManageNewsAddTest extends Base {
	@Test(groups={"regression","smoke"})
	 public void verifyUserIsAbleToAddNewNews(){
	    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGIN_PAGE);
        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGIN_PAGE);
        
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();

        ManageNewsAddPage addnewspage = new ManageNewsAddPage(driver);

        addnewspage.clickOnManageNewsBtn();
		boolean is_manage_news_header_available=addnewspage.isManageNewsHeaderDisplayed();
        
		addnewspage.clickOnAddNewNewsBtn();
		boolean is_enter_news_information_header_availabe=addnewspage.isenterNewsInformationHeaderDisplayed();
		
        String newsContent = RandomDataUtility.getNews();
        addnewspage.enterNews(newsContent);
        
        addnewspage.clickOnSubmitBtn();
        boolean is_news_add_success_alert_displayed = addnewspage.isNewsAddedSuccessfully();
        
		Assert.assertTrue(is_manage_news_header_available,Messages.HEADER_MANAGE_NEWS_NOT_LOADED);
		Assert.assertTrue(is_enter_news_information_header_availabe,Messages.HEADER_ENTER_NEWS_INFORMATION_NOT_LOADED);
		Assert.assertTrue(is_news_add_success_alert_displayed, Messages.NEWS_SUCCESS_ALERT_NOT_FOUND);
    }
}