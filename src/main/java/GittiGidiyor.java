import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


import java.util.concurrent.TimeUnit;

public class GittiGidiyor {

    private WebDriver driver;
    private By login = new By.ByCssSelector("div.gekhq4-6.hnYHyk[title='Giriş Yap']");
    private By loginButton = new By.ByCssSelector("a.qjixn8-0.sc-1bydi5r-0.kNKwwK[data-cy='header-login-button']");


    public GittiGidiyor(WebDriver driver){
        this.driver = driver;
    }

    public void setLogin(){
        WebElement findlogin = driver.findElement(login);
        findlogin.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement pressloginButton = driver.findElement(loginButton);
        pressloginButton.click();
    }

    public void setLoginForm(){

        WebElement kullaniciAdi = driver.findElement(By.id("L-UserNameField"));
        kullaniciAdi.click();
        kullaniciAdi.sendKeys("kadiralat559@gmail.com");

        WebElement sifre = driver.findElement(By.id("L-PasswordField"));
        sifre.click();
        sifre.sendKeys("testinium12");


        WebElement login2 = driver.findElement(By.id("gg-login-enter"));
        login2.click();

    }

    public void setSearch(){

        WebElement kesfet = driver.findElement(new By.ByCssSelector("input.sc-4995aq-0.sc-14oyvky-0.itMXHg"));
        kesfet.click();
        kesfet.sendKeys("bilgisayar");


        WebElement bul = driver.findElement(new By.ByCssSelector("button.qjixn8-0.sc-1bydi5r-0.hKfdXF"));
        bul.click();

    }

    public void setSecondPage() {

        /*
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(new By.ByXPath("//li/a[starts-with(text(),'2')]"))).click().build().perform();
*/


        WebElement secondpage = driver.findElement(new By.ByXPath("//li/a[starts-with(text(),'2')]"));
        System.out.println("deneme");
        WebElement secondpagetrue = driver.findElement(new By.ByXPath("//div[@class='pager pt30 hidden-m gg-d-24']//ul//li[2]"));
        WebElement secondpagetrue2 = driver.findElement(new By.ByCssSelector("li.next-link"));

        try {
            System.out.println("try blogu");
            secondpage.click();
        } catch (ElementClickInterceptedException e) {

            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//div[@class='pager pt30 hidden-m gg-d-24']//ul//li[2]")));
            //secondpagetrue2.click();

            WebElement element = driver.findElement(new By.ByXPath("//div[@class='pager pt30 hidden-m gg-d-24']//ul//li[2]"));

            Point p = element.getLocation();

            Actions actions = new Actions(driver);

            actions.moveToElement(element).moveByOffset(308, 413).click().perform();
            //actions.moveToElement(element).moveByOffset(p.x,p.y).click().perform();

/*

           driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
           System.out.println("catch blogu");
           Actions act = new Actions(driver);
           act.doubleClick(driver.findElement(new By.ByXPath("//div[@class='pager pt30 hidden-m gg-d-24']//ul//li[2]")));
*/
        }
    }

    public String getLoginMail(){
        WebElement mail = driver.findElement(By.id("L-UserNameField"));
        return mail.getAttribute("value");
    }





}
