package online.fortis;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

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
    // выбираем хобби
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
    // загружаем файл
        File file = new File("src/test/resources/Glazov.txt");
        $("input[id='uploadPicture']").uploadFile(file);
    // заполняем адрес
        $("#currentAddress").setValue("СurrentAddress");
    // выбираем штат
        $(". css-tlfecz-indicatorContainer").click();
        //$("#react-select-3-input").setValue("Haryana");
    // выбираем город
        $("#react-select-4-input").setValue("Karnal");
    // нажимаем submit
        //$("#submit").click();

    }
}
