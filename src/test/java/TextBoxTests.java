import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Timur Timur");
        $("#userEmail").setValue("timur@gmail.com");
        $("#currentAddress").setValue("Пушкина стрит");
        $("#permanentAddress").setValue("Пушкин стрит_1");
        $("#submit").click();
    }

}
