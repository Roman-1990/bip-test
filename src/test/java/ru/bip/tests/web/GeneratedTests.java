package ru.bip.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import ru.bip.annotations.JiraIssue;
import ru.bip.annotations.JiraIssues;
import ru.bip.annotations.Layer;
import ru.bip.helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Layer("Web")
@Owner("roman")
@Feature("Issues")
public class GeneratedTests extends TestBase {

    static final String BASE_URL = "https://bip.ru";

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Открытие и проверка надписи на сайте")
    void generatedTest() {
        step("Открыть 'https://bip.ru'", () ->
                open(BASE_URL));

        step("Проверить текст 'Узнайте цены на ОСАГО в  20 страховых и оформите полис онлайн'", () -> {
            $("#__next").shouldHave(text("Узнайте цены на ОСАГО в  20 страховых и оформите полис онлайн"));
            step("// todo: just add selenium action");
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Заголовок страницы должен содержать текст заголовка")
    void titleTest() {
        step("Open url 'https://bip.ru'", () ->
                open(BASE_URL));

        step("Page title should have text 'Купить ОСАГО онлайн на 🚙 bip.ru'", () -> {
            String expectedTitle = "Купить ОСАГО онлайн на 🚙 bip.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Тест сервиса 'Калькулятор ОСАГО'")
    void calculatorTest() {
        step("Открываем сервис 'Калькулятор ОСАГО'", () -> {
            open(BASE_URL + "/kalkulyator");
            step("Выбираем поле для ввода города", () ->
                    $(".InputSelect_arrow__xf645").click()
            );
            step("Вводим город", () ->
                    $(".Input_field__2Zdfy").val("г Москва").pressEnter()
            );
            step("Выбираем поле для ввода 'л.с.'", () ->
                    $(".InputSelect_arrow__xf645", 1).click()
            );
            step("Вводим данные в 'л.с.'", () ->
                    $(".Input_field__2Zdfy", 1).val("120").pressEnter()
            );
            step("Выбираем поле для ввода 'Возраст (минимальный)'", () ->
                    $(".InputSelect_dropdown__386hc", 2).click()
            );
            step("Вводим данные в 'Возраст (минимальный)'", () ->
                    $(".Input_field__2Zdfy", 2).val("30").pressEnter()
            );
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Тест сервиса 'Коэффициенты ОСАГО'")
    void testCoefficients() {
        step("Открываем сервис 'Коэффициенты ОСАГО'", () -> {
            open(BASE_URL + "/osago");
            step("Проверяем работоспособность сервиса 'Коэффициенты ОСАГО'", () ->
                    $("#base").shouldHave(text("Базовая ставка"))
            );
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Тест сервиса 'Карта штрафов ГИБДД'")
    void testShtrafyOsagoMap() {
        step("Открываем сервис 'Карта штрафов ГИБДД'", () -> {
            open(BASE_URL + "/shtrafy-osago-map");
            step("Проверяем работоспособность сервиса 'Карта штрафов ГИБДД'", () ->
                    $(".LandingHeader_contentBlock__3aU9J")
                            .shouldHave(text("Карта штрафов ГИБДД — Москва"))
            );
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Журнал страницы консоли не должен содержать ошибок")
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