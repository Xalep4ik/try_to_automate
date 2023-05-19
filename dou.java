import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dou {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "E:\\Progs\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dou.ua/");
    }

    @Test
    public void testDouUa() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "DOU | Дайджест про IT-індустрію України");

        WebElement vacanciesLink = driver.findElement(By.xpath("//a[@href='/vacancies/']"));
        vacanciesLink.click();
        String vacanciesTitle = driver.getTitle();
        Assert.assertEquals(vacanciesTitle, "Вакансії на DOU");

        WebElement eventsLink = driver.findElement(By.xpath("//a[@href='/events/']"));
        eventsLink.click();
        String eventsTitle = driver.getTitle();
        Assert.assertEquals(eventsTitle, "Календар IT-подій в Україні");

        WebElement companiesLink = driver.findElement(By.xpath("//a[@href='/companies/']"));
        companiesLink.click();
        String companiesTitle = driver.getTitle();
        Assert.assertEquals(companiesTitle, "Компанії");

        WebElement topicsLink = driver.findElement(By.xpath("//a[@href='/topics/']"));
        topicsLink.click();
        String topicsTitle = driver.getTitle();
        Assert.assertEquals(topicsTitle, "DOU: Теми");

        WebElement salaryLink = driver.findElement(By.xpath("//a[@href='/salary/']"));
        salaryLink.click();
        String salaryTitle = driver.getTitle();
        Assert.assertEquals(salaryTitle, "DOU: Зарплати в IT");

        WebElement blogLink = driver.findElement(By.xpath("//a[@href='/blog/']"));
        blogLink.click();
        String blogTitle = driver.getTitle();
        Assert.assertEquals(blogTitle, "DOU: Блоги");

        WebElement newsLink = driver.findElement(By.xpath("//a[@href='/news/']"));
        newsLink.click();
        String newsTitle = driver.getTitle();
        Assert.assertEquals(newsTitle, "DOU: Новини");

    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}