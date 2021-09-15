package ru.rteu.remd.helpers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.rteu.remd.config.App;
import ru.rteu.remd.config.Project;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = Project.projectConfig.browser();
        Configuration.browserVersion = Project.projectConfig.browserVersion();
        Configuration.browserSize = Project.projectConfig.browserSize();
        Configuration.baseUrl = App.appConfig.webUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (Project.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = Project.projectConfig.remoteDriverUrl();
        }

        Configuration.browserCapabilities = capabilities;
    }
}
