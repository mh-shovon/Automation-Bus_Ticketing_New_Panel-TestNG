import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminPanel {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement txtPhone;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    WebElement txtPassword;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/button[1]")
    WebElement btnLogin;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/button[1]")
    WebElement btnLoginDisplayed;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnDashboardView;

    WebDriver driver;

    public SuperAdminPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean doSuperAdminLoginWithWrongCredentials(String phone, String password) throws InterruptedException {
        txtPhone.sendKeys(phone);
        Thread.sleep(1000);
        txtPassword.sendKeys(password);
        Thread.sleep(1000);
        btnLogin.click();
        Thread.sleep(1000);
        return btnLoginDisplayed.isDisplayed();
    }

//    public boolean doSuperAdminLoginWithValidCredentials(String phone, String password) throws InterruptedException {
//        txtPhone.sendKeys(phone);
//        Thread.sleep(1000);
//        txtPassword.sendKeys(password);
//        Thread.sleep(1000);
//        btnLogin.click();
//        Thread.sleep(1000);
//        return btnDashboardView.isDisplayed();
//    }

}