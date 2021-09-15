package ru.rteu.remd.tests.base;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import ru.rteu.remd.config.App;
import ru.rteu.remd.helpers.DriverSettings;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        DriverSettings.configure();
        RestAssured.baseURI = App.appConfig.apiUrl();
    }
}
