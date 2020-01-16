package tests;


import java.io.*; 
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import baseTest.baseTest;
import pages.searchPage; 
  
public class ResultGenerator extends baseTest{ 
	searchPage SearchPage;
	
	public ResultGenerator() {
		super();
	}
	

    @BeforeMethod
	public void setUp() throws InterruptedException {				
 
		SearchPage = new searchPage();
		
	}
    

    
    @Test
    public void addDataToCSV() throws IOException 
    { 
  
    	List<String[]> details = new ArrayList<String[]>(); 

//	        try {  
	        	
	        	String csv = "C:\\Users\\Fameena\\Desktop\\CommerceIQ\\assisgnment\\TestData\\data.csv";
	        	CSVWriter writer = new CSVWriter(new FileWriter(csv), '|', 
                        CSVWriter.NO_QUOTE_CHARACTER, 
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
                        CSVWriter.DEFAULT_LINE_END);
 
	        	for(WebElement name : SearchPage.movieName) {
	            	
	        	outer:	for(WebElement year : SearchPage.movieYear) {
	            		
	            	 for(WebElement rating : SearchPage.movieRating) {
	            			
	            			(details).add(new String[] {name.getText(),year.getText(),rating.getText()});
		            		break outer;
	            		}
	            		
	            	}
				}
	        	System.out.println(details);

	        		            	  
	        	writer.writeAll(details); 
	            writer.close(); 
//	            SearchPage.nextButton.isDisplayed();
//				SearchPage.nextButton.click();
					            
	       // } 
//	        catch (NoSuchElementException e){
//				System.out.println("NoSuchElement");
//	        } 	
		
    } 
} 
