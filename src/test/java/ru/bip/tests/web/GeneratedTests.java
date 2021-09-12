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
    void menuTest() {
        step("Тест сервиса 'Калькулятор ОСАГО'", () -> {
            open(BASE_URL + "/kalkulyator");

            $(".InputSelect_arrow__xf645", 0).click();
            $(".Input_field__2Zdfy", 0).val("г Москва").pressEnter();
            $(".InputSelect_arrow__xf645", 1).click();
            $(".Input_field__2Zdfy", 1).val("120").pressEnter();
            $(".InputSelect_dropdown__386hc", 2).click();
            $(".Input_field__2Zdfy", 2).val("30").pressEnter();
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Тест сервиса 'Коэффициенты ОСАГО'")
    void testCoefficients() {
        step("Тест сервиса 'Коэффициенты ОСАГО'", () -> {
            open(BASE_URL + "/osago");
            $("#base").shouldHave(text("Базовая ставка"));
        });
    }

    @Test
    @JiraIssues({@JiraIssue("HOM-229")})
    @Tag("Web")
    @DisplayName("Тест сервиса 'Карта штрафов ГИБДД'")
    void testShtrafyOsagoMap() {
        step("Тест сервиса 'Карта штрафов ГИБДД'", () -> {
            open(BASE_URL + "/shtrafy-osago-map");
            $(".LandingHeader_contentBlock__3aU9J").shouldHave(text("Карта штрафов ГИБДД — Москва"));
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