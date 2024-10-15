package testing;

public class SalesForceLogin {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Git Repository\\Test-Automation\\SalesForce");
        
        WebDriver driver = new ChromeDriver;
        {
        // Navigate to Salesforce login page
        driver.get("https://login.salesforce.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Define wait for elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate username field and enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        usernameField.sendKeys("your_username");  // Replace with your Salesforce username

        // Locate password field and enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your_password");  // Replace with your Salesforce password

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();

        }
        
        
        
	}
        
	}