import Constants.ElementsAuthorizationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPage {

    private final WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открытие страницы автооризации")
    public void openMain() {
        driver.get("https://kazan.hh.ru/account/login?backurl=%2F&hhtmFrom=main");
    }

    public void isWaitPageDisplayed(By waitElement) {
        WebDriverWait elementWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        elementWait.until(ExpectedConditions.visibilityOfElementLocated(waitElement));
    }

    @Step("Нажате на кнопку \"Показать пароль\"")
    public void clickButtonShowPassword() {
        driver.findElement(ElementsAuthorizationPage.EXPAND_LOGIN_BY_PASSWORD).click();
    }


    public void setEmail(String email) {
        driver.findElement(ElementsAuthorizationPage.EMAIL_AUTH_FIELD).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(ElementsAuthorizationPage.PASSWORD_AUTH_FIELD).sendKeys(password);
    }

    public void clickAuthorizationButton() {
        driver.findElement(ElementsAuthorizationPage.BUTTON_AUTH).click();
    }

    public boolean getMainText() {
            isWaitPageDisplayed(ElementsAuthorizationPage.TEXT_HEADER_MAIN);
            return driver.findElement(ElementsAuthorizationPage.TEXT_HEADER_MAIN).isDisplayed();
 }


    @Step("Получение текста ошибки")
    public boolean getTextError() {
        isWaitPageDisplayed(ElementsAuthorizationPage.TEXT_PASSWORD_NO_VALID);
        return driver.findElement(ElementsAuthorizationPage.TEXT_PASSWORD_NO_VALID).isDisplayed();
    }


    @Step("(\"Ввод email\") - (\"Ввод пароля\") - (\"Клик на кнопку авторизации\")")
    public void completeAuthorizationForm(String email, String password) {
        setEmail(email);
        clickButtonShowPassword();
        setPassword(password);
        clickAuthorizationButton();
    }
}
