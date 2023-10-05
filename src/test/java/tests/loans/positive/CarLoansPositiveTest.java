package tests.loans.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;

import static constants.Constant.Urls.CAR_CREDITS_URL;
@Link(name = "check-list", url = CAR_CREDITS_URL)
@Feature("Tests to check credit for cars")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)

public class CarLoansPositiveTest extends BaseTest {
    @Test
    @DisplayName("Public session, non-client, applying for a loan for car with a mileage")
    void applyingForAnOldCarLoanPublicSession() {
        basePage.goToUrl(CAR_CREDITS_URL);
        carLoansPage
                .checkSelectedTabWithMileageAuto()
                .enterAmountFieldCArCost("1500000")
                .enterAmountFieldPrepaidExpense("900000")
                .selectPhoneCodeButton()
                .searchPhoneCountryCodeField("Russ")
                .selectCountryRussiaFromList()
                .enterPhoneNumber("000000000");
//                .submitOrderButton()
//                .checkIsDisplayedConfirm();
    }

    @Test
    @DisplayName("Public session, non-client, reviewing the contract")
    void selectAgreementsTabInPublicSession() {
        basePage.goToUrl(CAR_CREDITS_URL);
        carLoansPage.selectAgreementsTab();
    }
}
