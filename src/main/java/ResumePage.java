import Constants.ElementsResumePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ResumePage {
    private final WebDriver driver;

    public ResumePage(WebDriver driver) {
        this.driver = driver;
    }

    public void isWaitPageDisplayed(By waitElement) {
        WebDriverWait elementWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        elementWait.until(ExpectedConditions.visibilityOfElementLocated(waitElement));
    }

    @Step("Нажате на кнопку \"Создать резюме\"")
    public void clickButtonCreateResume() {
        isWaitPageDisplayed(ElementsResumePage.BUTTON_CREATE_RESUME);
        driver.findElement(ElementsResumePage.BUTTON_CREATE_RESUME).click();
    }

    @Step("Нажате на кнопку \"Сохранить и продолжить\"")
    public void clickButtonSaveAndContinue() {
        isWaitPageDisplayed(ElementsResumePage.BUTTON_SAVE_AND_CONTINUE);
        driver.findElement(ElementsResumePage.BUTTON_SAVE_AND_CONTINUE).click();
    }


    @Step("Отображение текста ошибки \"Напишите или выберите профессию, чтобы продолжить\"")
    public boolean getTextErrorSelect() {
        isWaitPageDisplayed(ElementsResumePage.TEXT_ERROR_ENTERIN);
        return driver.findElement(ElementsResumePage.TEXT_ERROR_ENTERIN).isDisplayed();
    }
    @Step("Отображение текста \"Кем вы хотите работать?\"")
    public boolean getMagritteText() {
        isWaitPageDisplayed(ElementsResumePage.BUTTON_MAGRITTE_TEXT);
        return driver.findElement(ElementsResumePage.BUTTON_MAGRITTE_TEXT).isDisplayed();
    }

    @Step("Отображение текста ошибки \"Укажите пол\"")
    public boolean getTextErrorGender() {
        isWaitPageDisplayed(ElementsResumePage.TEXT_ERROR_GENDER);
        return driver.findElement(ElementsResumePage.TEXT_ERROR_GENDER).isDisplayed();
    }

    @Step("Отображение текста ошибки \"Укажите пол\"")
    public boolean getTextErrorPhone() {
        isWaitPageDisplayed(ElementsResumePage.TEXT_ERROR_PHONE);
        return driver.findElement(ElementsResumePage.TEXT_ERROR_PHONE).isDisplayed();
    }

    @Step("Ввод и выбор текста  \"Укажите пол\"")
    public void setSelectProfession(String text) {
        driver.findElement(ElementsResumePage.PROFESSION_FIELD).sendKeys(text);
        isWaitPageDisplayed(ElementsResumePage.SELECT_PROFESSION_FIELD);
        driver.findElement(ElementsResumePage.SELECT_PROFESSION_FIELD).click();
    }

}
