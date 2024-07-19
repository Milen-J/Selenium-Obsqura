package utilities;

import org.openqa.selenium.WebElement;


public class WebElementUtilities {
	public boolean isElementDisplayed(WebElement element)
	{
		boolean iselementdispalyed=element.isDisplayed();
		return iselementdispalyed;
	}

	public boolean isElementEnabled(WebElement element)
	{
		boolean iselementenabled=element.isEnabled();
		return iselementenabled;
		
	}
	public boolean isElementSelected(WebElement element)
	{
		boolean iselementselected=element.isSelected();
		return iselementselected;
		
	}

}
