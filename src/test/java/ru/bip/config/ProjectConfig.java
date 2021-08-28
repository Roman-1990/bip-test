package ru.bip.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("selenoid.url")
    @Key("selenoid.url")
    String selenoidUrl();

    @DefaultValue("username")
    @Key("username")
    String username();

    @DefaultValue("password")
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
}
