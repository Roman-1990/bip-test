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

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.core.Is.is;

@Layer("Api")
@Owner("roman")
@Feature("Reqres")
public class ApiTests {

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-01")})
    @Description("Main page")
    @DisplayName("List user test")
    void listUserTest() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200);
    }


    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-02")})
    @Description("Main page")
    @DisplayName("Single user not found test")
    void singleUserNotFoundTest() {
        given()
                .when()
                .get("https://reqres.in/api/users/23")
                .then()
                .statusCode(404);
    }

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-03")})
    @Description("Main page")
    @DisplayName("Create test")
    void createTest() {
        given()
                .contentType(JSON)
                .body("{\"name\": \"morpheus\"," +
                        "\"job\": \"leader\"}")
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .body("name", is("morpheus"))
                .body("job", is("leader"));
    }

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-04")})
    @Description("Main page")
    @DisplayName("Register successful test")
    void registerSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{\"email\": \"eve.holt@reqres.in\"," +
                        "\"password\": \"pistol\"}")
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(200)
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-05")})
    @Description("Main page")
    @DisplayName("Authorization test")
    void loginSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{\"email\": \"eve.holt@reqres.in\"," +
                        "\"password\": \"cityslicka\"}")
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(200)
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-06")})
    @Description("Main page")
    @DisplayName("Unsuccessful registration test")
    void unsuccessfulRegistrationTest() {
        given()
                .contentType(JSON)
                .body("{\"email\": \"sydney@fife\"}")
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(400)
                .body("error", is("Missing password"));
    }

    @Test
    @Tag("Api")
    @JiraIssues({@JiraIssue("RK-07")})
    @Description("Main page")
    @DisplayName("Delete")
    void deleteUser() {
        String response =
                given()
                        .contentType(JSON)
                        .body("{\"name\": \"morpheus\"," + "\"job\": \"zion resident\"}")
                        .when()
                        .post("https://reqres.in/api/users/2")
                        .then()
                        .statusCode(201)
                        .extract().path("id");

        delete("https://reqres.in/api/users/" + response)
                .then()
                .statusCode(204);
    }
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
