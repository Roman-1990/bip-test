package ru.bip.tests;

import ru.bip.helpers.DriverUtils;
import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    String city = "г Москва",
            carPower = "120",
            numberOfDrivers = "1 и более";

    static final String BASE_URL = "https://bip.ru/";

    @Test
    @DisplayName("Открытие и проверка надписи на сайте")
    void generatedTest() {
        step("Открыть 'https://bip.ru/'", () -> {
            open(BASE_URL);
        });

        step("Проверить текст 'Узнайте цены на ОСАГО в  20 страховых и оформите полис онлайн'", () -> {
            $("#__next").shouldHave(Condition.text("Узнайте цены на ОСАГО в  20 страховых и оформите полис онлайн"));
            step("// todo: just add selenium action");
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://bip.ru/'", () ->
                open(BASE_URL));

        step("Page title should have text 'Купить ОСАГО онлайн на 🚙 bip.ru'", () -> {
            String expectedTitle = "Купить ОСАГО онлайн на 🚙 bip.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Тест сервиса 'Калькулятор ОСАГО'")
    void menuTest() {
        step("Тест сервиса 'Калькулятор ОСАГО'", () -> {
            open(BASE_URL);
            $(".HeaderNavigation_content__24XmP").shouldHave(Condition.text("Калькулятор ОСАГО")).click();
            $(".InputSelect_dropdown__386hc", 0).click();
            $(".Input_field__2Zdfy", 0).val(city);
            $(".InputSelect_arrow__xf645", 0).click();
            $(".InputSelect_dropdown__386hc", 1).click();
            $(".Input_field__2Zdfy", 1).val(carPower);
            $(".InputSelect_arrow__xf645", 1).click();
            $(".Input_field__2Zdfy", 2).val(numberOfDrivers);
            $(".InputSelect_arrow__xf645", 2).click();
        });
    }

    @Test
    @DisplayName("Тест сервиса 'Коэффициенты ОСАГО'")
    void testCoefficients() {
        step("Тест сервиса 'Коэффициенты ОСАГО'", () -> {
            open(BASE_URL + "osago");
            $("#base").shouldHave(Condition.text("Базовая ставка"));
        });
    }

    @Test
    @DisplayName("Тест сервиса 'Карта штрафов ГИБДД'")
    void testShtrafyOsagoMap() {
        step("Тест сервиса 'Карта штрафов ГИБДД'", () -> {
            open(BASE_URL + "shtrafy-osago-map");
            $(".LandingHeader_contentBlock__3aU9J").shouldHave(Condition.text("Карта штрафов ГИБДД — Москва"));

        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://bip.ru/'", () ->
                open("https://bip.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}