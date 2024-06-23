package Constants;

import org.openqa.selenium.By;

public class ElementsAuthorizationPage {

    public static final By EXPAND_LOGIN_BY_PASSWORD = By.xpath(".//div[@class = 'account-login-actions ']/button[contains(@type, 'button')]");
    public static final By EMAIL_AUTH_FIELD = By.xpath(".//input[contains(@inputmode, 'email')]"); // ???
    public static final By PASSWORD_AUTH_FIELD = By.xpath(".//input[contains(@type, 'password')]");
    public static final By BUTTON_AUTH = By.xpath(".//div[@class = 'account-login-actions ']/button[contains(@type, 'submit')]");
    public static final By TEXT_HEADER_MAIN = By.xpath(".//h2[text()='Мои события']");
    public static final By TEXT_PASSWORD_NO_VALID = By.xpath(".//div[text()='Неправильные данные для входа. Пожалуйста, попробуйте снова.']");
}
