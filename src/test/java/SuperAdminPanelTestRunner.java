import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SuperAdminPanelTestRunner extends Setup {
    SuperAdminPanel superAdminPanel;
    UtilsSuperAdmin utilsSuperAdmin;

    @Test(priority = 1)
    public void doSuperAdminLoginWithNoCredential() throws IOException, ParseException, InterruptedException {
        superAdminPanel = new SuperAdminPanel(driver);
        utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(0);
        Thread.sleep(1000);
        driver.get("http://admin.core-intercity.jatri.co/");
        Thread.sleep(1000);
        boolean isLogoutButtonFound = superAdminPanel.doSuperAdminLoginWithWrongCredentials(utilsSuperAdmin.getPhone(), utilsSuperAdmin.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(isLogoutButtonFound, true);
        Thread.sleep(1000);
        superAdminPanel.btnLoginDisplayed.isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void doSuperAdminLoginWithPhoneOnly() throws IOException, ParseException, InterruptedException {
        superAdminPanel = new SuperAdminPanel(driver);
        utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(1);
        Thread.sleep(1000);
        driver.get("http://admin.core-intercity.jatri.co/");
        Thread.sleep(2000);
        boolean isLogoutButtonFound = superAdminPanel.doSuperAdminLoginWithWrongCredentials(utilsSuperAdmin.getPhone(), utilsSuperAdmin.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(isLogoutButtonFound, true);
        Thread.sleep(1000);
        superAdminPanel.btnLoginDisplayed.isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void doSuperAdminLoginWithPasswordOnly() throws IOException, ParseException, InterruptedException {
        superAdminPanel = new SuperAdminPanel(driver);
        utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(2);
        Thread.sleep(1000);
        driver.get("http://admin.core-intercity.jatri.co/");
        Thread.sleep(1000);
        boolean isLogoutButtonFound = superAdminPanel.doSuperAdminLoginWithWrongCredentials(utilsSuperAdmin.getPhone(), utilsSuperAdmin.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(isLogoutButtonFound, true);
        Thread.sleep(1000);
        superAdminPanel.btnLoginDisplayed.isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void doSuperAdminLoginWithInvalidPhone() throws IOException, ParseException, InterruptedException {
        superAdminPanel = new SuperAdminPanel(driver);
        utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(3);
        Thread.sleep(1000);
        driver.get("http://admin.core-intercity.jatri.co/");
        Thread.sleep(1000);
        boolean isLogoutButtonFound = superAdminPanel.doSuperAdminLoginWithWrongCredentials(utilsSuperAdmin.getPhone(), utilsSuperAdmin.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(isLogoutButtonFound, true);
        Thread.sleep(1000);
        superAdminPanel.btnLoginDisplayed.isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void doSuperAdminLoginWithValidPass() throws IOException, ParseException, InterruptedException {
        superAdminPanel = new SuperAdminPanel(driver);
        utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(4);
        Thread.sleep(1000);
        driver.get("http://admin.core-intercity.jatri.co/");
        Thread.sleep(1000);
        boolean isLogoutButtonFound = superAdminPanel.doSuperAdminLoginWithWrongCredentials(utilsSuperAdmin.getPhone(), utilsSuperAdmin.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(isLogoutButtonFound, true);
        Thread.sleep(1000);
        superAdminPanel.btnLoginDisplayed.isDisplayed();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void doSuperAdminLoginWithValidCredential() throws IOException, ParseException, InterruptedException {
        superAdminPanel = new SuperAdminPanel(driver);
        utilsSuperAdmin = new UtilsSuperAdmin();
        utilsSuperAdmin.getUserCredentials(5);
        Thread.sleep(1000);
        driver.get("http://admin.core-intercity.jatri.co/");
        Thread.sleep(1000);
        boolean isDashboardFound = superAdminPanel.doSuperAdminLoginWithValidCredentials(utilsSuperAdmin.getPhone(), utilsSuperAdmin.getPassword());
        Thread.sleep(1000);
        Assert.assertEquals(isDashboardFound, true);
        Thread.sleep(1000);
        superAdminPanel.btnDashboardView.isDisplayed();
        Thread.sleep(2000);
    }

}