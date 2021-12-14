package online.fortis;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;

    }

    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Test");
        $("#userEmail").setValue("test@test.ru");
        $("#currentAddress").setValue("TestAdress1");
        $("#permanentAddress").setValue("TestAdress2");
        $("#submit").click();

        $("#output #name").shouldHave(text("Test"));
        $("#output #email").shouldHave(text("test@test.ru"));
        $("#output #currentAddress").shouldHave(text("TestAdress1"));
        $("#output #permanentAddress").shouldHave(text("TestAdress2"));
    }

}
