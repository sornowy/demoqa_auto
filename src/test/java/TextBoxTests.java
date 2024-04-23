import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        //Configuration.browserSize = "1920x1080";
        //Configuration.browser = "firefox";
        //System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 100;
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("Timur Timur");
        $("#userEmail").setValue("timur@gmail.com");
        $("#currentAddress").setValue("Some street");
        $("#permanentAddress").setValue("Another street");
        $("#submit").click();
    }

}
