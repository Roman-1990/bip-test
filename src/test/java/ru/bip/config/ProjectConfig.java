package ru.bip.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("https://%s:%s@selenoid.autotests.cloud/wd/hub/")
    @Key("selenoid.url")
    String selenoidUrl();

    @DefaultValue("user1")
    @Key("username")
    String username();

    @DefaultValue("1234")
    @Key("password")
    String password();

    @DefaultValue("chrome")
    @Key("browser")
    String browser();

    @DefaultValue("91.0")
    @Key("browserVersion")
    String browserVersion();

    @DefaultValue("1920x1080")
    @Key("browserSize")
    String browserSize();

    @Key("browserMobileView")
    String browserMobileView();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("baseUrl")
    String baseUrl();
}
