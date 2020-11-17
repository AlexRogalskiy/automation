package entities;

import com.codeborne.selenide.Browsers;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxBrowser implements Browser {
    @Override
    public String getType() {
        return Browsers.FIREFOX;
    }

    @Override
    public String getVersion() {
        return StringUtils.defaultString(System.getProperty("browser.version"), "79.0");
    }

    @Override
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }
}