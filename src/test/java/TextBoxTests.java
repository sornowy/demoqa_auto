import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        //System.setProperty("webdriver.chromedriver", "C:\\WebDrivers\\chromedriver.exe");
        //Configuration.baseUrl = "https://demoqa.com";
        //Configuration.baseUrl = "https://www.google.ru/";
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("https://www.saucedemo.com/");


        //Проверки для https://www.saucedemo.com/
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();

        //Проверка для demoqq
//        $(".card mt-4 top-card").click();
//        $("#item-0").click();
//        $("#userName").setValue("Timur Timur");
//        $("#text").setValue("Timur Timur");// Проверка работоспособности кода в Яндекс поиске:)
//        $("#userEmail").setValue("timur@gmail.com");
//        $("#currentAddress").setValue("Some street");
//        $("#permanentAddress").setValue("Another street");
//        $("#submit").click();
    }

}
