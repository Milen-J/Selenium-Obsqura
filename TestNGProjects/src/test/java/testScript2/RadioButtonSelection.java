package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript1.Base;

public class RadioButtonSelection extends Base {
	public void radioButtonSelection()
	{
driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
        
        WebElement radiomale = driver.findElement(By.xpath("//input[contains(@value,'Male')]"));
        WebElement radiofemale = driver.findElement(By.xpath("//input[contains(@value,'Female')]"));
        
        if (!radiomale.isSelected() && !radiofemale.isSelected()) {
            if (radiomale.isEnabled()) {
                radiomale.click();
                System.out.println("Male is now selected");
            } else {
                radiofemale.click();
                System.out.println("Female is now selected");
            }
        } else if (radiomale.isSelected()) {
            System.out.println("Male is already selected");
        } else {
            System.out.println("Female is already selected");
        }
    }

	public static void main(String[] args) {
		
		RadioButtonSelection radiobuttionselection=new RadioButtonSelection();
		radiobuttionselection.initializeBrowser();
		radiobuttionselection.radioButtonSelection();

	}

}