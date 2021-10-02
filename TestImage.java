package srcnew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.TestNew;

public class TestImage extends TestNew {
	
	WebDriver driver;
	
	
	@Test(priority=1)
	public void TestNewForImage() {
		
		
		WebElement Image = driver.findElement(By.xpath("//img[@class='img-responsive']"));
	      
        
        Boolean ImageCheck = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", Image);
        if (!ImageCheck)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
	}
		
	
	@Test(priority=2)
	public void Print_Veterinarians()
	 {
	        driver.findElement(By.xpath("//span[text()='Veterinarians']")).click();

	        List<WebElement> Rows = driver.findElements(By.id("vets"));

	        for (WebElement row : Rows) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));

	            for (WebElement cell : cells) {

	                System.out.println(cell.getText());

	            }

	        }
	    }
	
	
	@Test(priority=3)
	public void Print_owners() {
	        driver.findElement(By.xpath("//span[text()='Find owners']")).click();
	        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

	        List<WebElement> Rows = driver.findElements(By.id("owners"));

	        for (WebElement row : Rows) {
	            List<WebElement> cells = row.findElements(By.tagName("a"));

	            // Print the contents of each cell
	            for (WebElement cell : cells) {

	                System.out.println(cell.getText());

	            }

	        }
	    }
	
	
	String FirstName = "Rakan";
    String LastName  = "Al-Ahmad";
    String Address   = "Tabarbour";
    String City      = "Amman";
    String Telephone = "077777777";
    String PetName   = "Dog";
    String Date      = "2003-03-03";

    @Test(priority=4)
    public void Add_owners() {
        driver.findElement(By.xpath("//span[text()='Find owners']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-default')]")).click();

        driver.findElement(By.id("firstName")).sendKeys(FirstName);
        driver.findElement(By.id("lastName")).sendKeys(LastName);
        driver.findElement(By.id("address")).sendKeys(Address);
        driver.findElement(By.id("city")).sendKeys(City);
        driver.findElement(By.id("telephone")).sendKeys(Telephone);

        driver.findElement(By.xpath("//button[@type='submit']")).click(); // click add owner

        /*
        Add Pet
         */

        driver.findElement(By.xpath("(//a[contains(@class,'btn btn-default')])[2]")).click(); // click on add new pet

        driver.findElement(By.id("name")).sendKeys(PetName);
        driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]")).sendKeys(Date);

        Select dropDown = new Select(driver.findElement(By.id("type")));

        dropDown.selectByVisibleText("dog");

        driver.findElement(By.xpath("//button[text()='Add Pet']")).click();

    }

    boolean Check;

	
    
    
    @Test(priority=5)
    public void Check_all_data_added()
    {
        driver.findElement(By.xpath("//span[text()='Find owners']")).click();
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();


        List<WebElement> Rows = driver.findElements(By.id("owners"));

        // And iterate over them and get all the cells
        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("a"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(FirstName))
                {
                    Assert.assertTrue(Check);
                }
            }

            }

        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(LastName))
                {
                    Assert.assertTrue(Check);
                }
            }

        }

        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(Address))
                {
                    Assert.assertTrue(Check);
                }
                else
                {
                    assert false: "Incorrect Data !!";
                }
            }

        }


        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(City))
                {
                    Assert.assertTrue(Check);
                }
                else
                {
                    assert false: "Incorrect Data !!";
                }
            }

        }

        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(Telephone))
                {
                    Assert.assertTrue(Check);
                }
                else
                {
                    assert false: "Incorrect Data !!";
                }
            }

        }

        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(PetName))
                {
                    Assert.assertTrue(Check);
                }
                else
                {
                    assert false: "Incorrect Data !!";
                }
            }

        }

        for (WebElement row : Rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                if(cells.equals(Date))
                {
                    Assert.assertTrue(Check);
                }
                else
                {
                    assert false: "Incorrect Data !!";
                }
            }

        }


        }
}


	
	
		

	

