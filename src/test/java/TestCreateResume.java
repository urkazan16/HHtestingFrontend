import Constants.ElementsResumePage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestCreateResume extends ConfTests {

    @Test
    @DisplayName("Проверка создания резюме")
    public void checkAuthorizationUserButtonSignIn() throws IOException{
        objAuthorizationPage.openMain();
        objAuthorizationPage.completeAuthorizationForm(objDataOptions.getConfEmail(), objDataOptions.getConfPassword());
        objResumePage.clickButtonCreateResume();
        Assert.assertTrue(objResumePage.getMagritteText());
        objResumePage.clickButtonSaveAndContinue();
        Assert.assertTrue(objResumePage.getTextErrorSelect());
        objResumePage.setSelectProfession(ElementsResumePage.PROFESSION_TEXT);
        objResumePage.clickButtonSaveAndContinue();
        objResumePage.clickButtonSaveAndContinue();
        Assert.assertTrue(objResumePage.getTextErrorGender());
        Assert.assertTrue(objResumePage.getTextErrorPhone());
    }
}
