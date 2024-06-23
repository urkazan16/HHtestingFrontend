package Constants;

import org.openqa.selenium.By;

public class ElementsResumePage {
    public static String PROFESSION_TEXT = "Тестировщик ПО";

    public static final By BUTTON_CREATE_RESUME = By.xpath(".//a[text()='Создать резюме']");
    public static final By BUTTON_MAGRITTE_TEXT = By.xpath(".//h1[contains(@data-qa, 'title')]");
    public static final By BUTTON_SAVE_AND_CONTINUE = By.xpath(".//div[@class = 'EsL2FxJ___footer']//span/span");
    public static final By TEXT_ERROR_ENTERIN = By.xpath(".//div[text()='Напишите или выберите профессию, чтобы продолжить']");
    public static final By TEXT_ERROR_GENDER = By.xpath(".//div[text()='Укажите пол']");
    public static final By TEXT_ERROR_PHONE = By.xpath(".//div[text()='Укажите номер телефона']");
    public static final By PROFESSION_FIELD = By.xpath(".//input[contains(@inputmode, 'email')]");
    public static final By SELECT_PROFESSION_FIELD = By.xpath(".//div[@class = 'suggest']//ul/li");

}
