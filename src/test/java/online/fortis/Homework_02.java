package online.fortis;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework_02 {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillPracticeFormTests() {
    // открываем сайт
        open("https://demoqa.com/automation-practice-form");
    // заполняем имя
        $("#firstName").setValue("FirstName");
    // заполняем фамилию
        $("#lastName").setValue("LastName");
    // заполняем почту
        $("#userEmail").setValue("test@test.ru");
    // выбираем пол
        $("[for='gender-radio-3']").click();
    // заполняем телефон
        $("#userNumber").setValue("9991234567");
    // выбираем дату рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1986");
        $(".react-datepicker__day--012").click();
    // заполняем subjects
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
    // выбираем хобби
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
    // загружаем файл
        File file = new File("src/test/Glazov.txt");
        $("input[id='uploadPicture']").uploadFile(file);
    // заполняем адрес
        $("#currentAddress").setValue("Any Address");
    // выбираем штат
        $("#react-select-3-input").setValue("Haryana").pressEnter();
    // выбираем город
        $("#react-select-4-input").setValue("Karnal").pressEnter();
    // нажимаем submit
        $("#submit").click();

    // Проверка результата
        $("#example-modal-sizes-title-lg").shouldBe(visible);
        $(".table-responsive").shouldHave(text("FirstName"));
        $(".table-responsive").shouldHave(text("LastName"));
        $(".table-responsive").shouldHave(text("test@test.ru"));
        $(".table-responsive").shouldHave(text("Other"));
        $(".table-responsive").shouldHave(text("9991234567"));
        $(".table-responsive").shouldHave(text("12 August,1986"));
        $(".table-responsive").shouldHave(text("English, Computer Science"));
        $(".table-responsive").shouldHave(text("Sports, Music"));
        $(".table-responsive").shouldHave(text("Glazov.txt"));
        $(".table-responsive").shouldHave(text("Any Address"));
        $(".table-responsive").shouldHave(text("Haryana Karnal"));

    }
}
