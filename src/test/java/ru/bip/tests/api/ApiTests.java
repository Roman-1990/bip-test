package ru.bip.tests.api;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.bip.annotations.JiraIssue;
import ru.bip.annotations.JiraIssues;
import ru.bip.annotations.Layer;

import static io.restassured.RestAssured.given;


@Layer("Api")
@Owner("roman")
@Feature("Reqres")
public class ApiTests {

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-14")})
    @Description("Main page")
    @DisplayName("Kalkulyator")
    void bipKalkulatorTest() {
        given()
                .when()
                .get("https://bip.ru/kalkulyator")
                .then()
                .statusCode(200);
    }
}
