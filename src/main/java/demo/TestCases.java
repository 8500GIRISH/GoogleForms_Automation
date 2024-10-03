package demo;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException {
        System.out.println("Start Test case: testCase01");
        driver.get("https://forms.gle/wjPkzeSEk1CM7KgGA");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait my_wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        my_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@jsname='YPqjbf' and @aria-labelledby='i1']")));
       Thread.sleep(5000);
       WebElement NameField = driver.findElement(By.xpath("//input[@jsname='YPqjbf' and @aria-labelledby='i1']"));
       NameField.sendKeys("Girish Bisalamanepalli");

       WebElement TextArea = driver.findElement(By.xpath("//textarea[@jsname='YPqjbf']"));
       TextArea.sendKeys("I have to upskill myself");
       driver.findElement(By.xpath("//div[@id='i16']")).click();
       driver.findElement(By.xpath("//div[@id='i39']")).click();

       WebElement drpDown  = driver.findElement(By.xpath("//span[text()='Choose']"));
       drpDown.click();
       Thread.sleep(3000);

       WebElement Option1 = driver.findElement(By.xpath("//div[@jsname='V68bde']/descendant::span[text()='Mr']"));
       Option1.click();

       Thread.sleep(1000);


       WebElement DatePicker = driver.findElement(By.xpath("//input[@type='date']"));
       DatePicker.sendKeys("24-09-2024");

        WebElement TimePicker = driver.findElement(By.xpath("//input[@aria-label='Hour']"));
        TimePicker.sendKeys("08");

        WebElement TimePicker2 = driver.findElement(By.xpath("//input[@aria-label='Minute']"));
        TimePicker2.sendKeys("30");

        WebElement SubBtn = driver.findElement(By.xpath("//span[text()='Submit']"));
        SubBtn.click();

        WebElement TextMsg = driver.findElement(By.xpath("//div[text()='Thanks for your response, Automation Wizard!']"));
        System.out.println(TextMsg.getText());

        Thread.sleep(3000);


        driver.get("https://www.google.com");
       System.out.println("end Test case: testCase02");
    }


}
