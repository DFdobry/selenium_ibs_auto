package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;

public class InitTest {

    private static final Properties properties = TestProperties.getInstance().getProperties();

    public AuthorisationPage authorisationPage = new AuthorisationPage();

    public BasePage basePage = new BasePage();



    @BeforeAll
    public static void setUp() {
        System.setProperty(properties.getProperty("WEB_DRIVER"),
                properties.getProperty("DRIVER_PATH"));
        Configuration.browser = "chrome";
        Configuration.browserBinary = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        Configuration.baseUrl = properties.getProperty("URL");
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void openStartPage() {
        open(Configuration.baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Selenide.clearBrowserLocalStorage();
    }

    @AfterEach
    public void tearDown() {
        closeWindow();
        closeWebDriver();
    }
}
