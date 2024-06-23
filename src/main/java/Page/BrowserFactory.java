package Page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;


import static Constants.SettingsPage.*;

public class BrowserFactory {

    public static ChromeOptions getDriver(String browserName) {

        switch (browserName) {
            case "chrome":
                ChromeOptions optionsChrom = new ChromeOptions();
                optionsChrom.addArguments("--user-agent="+MY_USER_AGENT+"");
                optionsChrom.addArguments("window-size="+WINDOW_SIZE+"");
                optionsChrom.addArguments("--incognito");
                optionsChrom.addArguments("--no-sandbox", "--disable-dev-shm-usage");
                optionsChrom.addArguments("--remote-allow-origins=*");
                optionsChrom.addArguments("start-maximized");
//                optionsChrom.addArguments("--headless");
                return optionsChrom;

            case "yandex":
                ChromeOptions optionsYandex = new ChromeOptions();
                System.setProperty("webdriver.chrome.driver", "yandexdriver");
                optionsYandex.addArguments("--user-agent="+MY_USER_AGENT+"");
                optionsYandex.addArguments("window-size="+WINDOW_SIZE+"");
                optionsYandex.addArguments("--incognito");
                optionsYandex.addArguments("--no-sandbox", "--disable-dev-shm-usage");
                optionsYandex.addArguments("--remote-allow-origins=*");
                optionsYandex.addArguments("start-maximized");
//                optionsYandex.addArguments("--headless");
                return optionsYandex;

            default:
                throw new RuntimeException("Incorrect BrowserName");
        }
    }

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath){
        try {
            // Convert web driver object to TakeScreenshot
            TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
            // Call getScreenshotAs method to create image file
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            // Move image file to new destination
            File destFile = new File(fileWithPath);
            // Copy file at destination
            FileUtils.copyFile(srcFile, destFile);
        } catch (Exception e) {
            // Handle exceptions gracefully
            e.printStackTrace();
        }
    }

}
