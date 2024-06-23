import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class TestTitlePage extends ConfTests{

    @Test
    @DisplayName("Проверка заголовка страицы")
    public void checkTitlePage() {
        objAuthorizationPage.openMain();
        String actual = driver.getTitle();
        String expected = "Вход в личный кабинет";
        Assert.assertEquals(expected, actual);
    }
}
