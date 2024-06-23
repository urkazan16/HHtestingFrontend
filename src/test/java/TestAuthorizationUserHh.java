import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;


import java.io.IOException;

public class TestAuthorizationUserHh extends ConfTests{


    @Test
    @DisplayName("Проверка авторизации пользователя")
    public void checkAuthorizationUserButtonSignIn() throws IOException {
        objAuthorizationPage.openMain();
        objAuthorizationPage.completeAuthorizationForm(objDataOptions.getConfEmail(), objDataOptions.getConfPassword());
        Assert.assertTrue(objAuthorizationPage.getMainText());
    }

}
