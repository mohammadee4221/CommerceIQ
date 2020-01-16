package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import baseTest.baseTest;

public class searchPage extends baseTest{

	public searchPage() {
		PageFactory.initElements(driver, this); 
	}
	
	 @FindBy(how=How.XPATH, using="//*[@id=\"main\"]/div/div/div/div")
	 public List<WebElement> rowCount;
	 
	 @FindBy(how=How.XPATH, using="//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr/td[2]/a")
	 public List<WebElement> movieName;
	 
	 @FindBy (how=How.XPATH, using="//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr/td[2]/span")
	 public List<WebElement> movieYear;
	 	 
	 @FindBy (how=How.XPATH, using="//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr/td[3]/strong")
	 public  List<WebElement> movieRating;
	 
	 @FindBy (how=How.XPATH, using="(//*[@class=\"lister-page-next next-page\"])[1]")
	 public  WebElement nextButton;
	 

}
