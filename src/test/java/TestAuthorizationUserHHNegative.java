import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestAuthorizationUserHHNegative extends ConfTests {

    @Test
    @DisplayName("Проверка авторизации пользователя c неправильным паролем")
    public void checkAuthorizationUserButtonSignIn() throws IOException {
        objAuthorizationPage.openMain();
        objAuthorizationPage.completeAuthorizationForm(objDataOptions.getConfEmail(), "12345"); // Вводим логин и пароль
        Assert.assertTrue(objAuthorizationPage.getTextError());
    }
}
