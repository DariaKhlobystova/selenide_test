package tests.telecomunications.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Link;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;
import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

@Link(name = "check-list", url = MOBILE_PAYMENT_URL)
@Feature("Tests to check the operation of replenishment of the mobile phone number")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
    @Test
    public void checkMinimumReplenishmentAmount() throws InterruptedException {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .enterFirstName(MOBILE_PAYMENT_FIRST_NAME)
                .enterLastName(MOBILE_PAYMENT_LAST_NAME)
                .submitToTheCart()
                .checkMessage("Mobile payment. Phone number +380686979712");
    }

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
    }
}
