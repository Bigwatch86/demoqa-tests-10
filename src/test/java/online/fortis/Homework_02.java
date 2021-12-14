package online.fortis;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Homework_02 {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillPracticeFormTests(){
    // открываем сайт
        open("https://demoqa.com/automation-practice-form");
    // заполняем имя
        $("#firstName").setValue("FirstName");
    // заполняем фамилию
        $("#lastName").setValue("LastName");
    // заполняем почту
        $("#userEmail").setValue("test@test.ru");
    // выбираем пол
        $("#gender-radio-3").selectRadio(By.name("sex"), "Other");;
    // заполняем телефон
        $("#userNumber").setValue("9991234567");
    // выбираем дату рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1986");
        //$(".react-datepicker__day").setValue("12");
        $("aria-label=\"Choose Tuesday, August 12th, 1986\"").setValue("12");
    // заполняем subjects
        $("#subjectsInput").setValue("Blablabla");
    // выбираем хобби
       // $("#hobbies-checkbox-3").click();
    // загружаем файл
       //$("#uploadPicture").click();
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
