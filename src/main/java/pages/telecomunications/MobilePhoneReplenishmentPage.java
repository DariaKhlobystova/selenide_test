package pages.telecomunications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;


public class MobilePhoneReplenishmentPage extends BasePage {

    private final SelenideElement buttonWallet = $x("//div[contains(text(), 'My wallet')]");
    private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement inputAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement buttonSubmitToTheCard = $x("//button[@data-qa-node='submit']");
    private final SelenideElement inputFirstName = $x("//input[@data-qa-node='firstNamedebitSource']");
    private final SelenideElement inputLastName = $x("//input[@data-qa-node='lastNamedebitSource']");


    /**
 * Choose a card from the wallet
 * */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }
    /**
     * Enter phone number excluding country code
     * @param number phone number
     * */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        clearAndType(inputPhoneNumber, number);
        return this;
    }
//    /**
//     * Clear amount field
//     * */
//    public MobilePhoneReplenishmentPage clearAmount() {
//        driver.findElement(inputAmount).sendKeys(Keys.chord(Keys.COMMAND, "a", Keys.DELETE));
//        return this;
//    }
    /**
     * Enter minimal amount
     * */
    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        clearAndType(inputAmount, amount);
        return this;
    }
    /**
     * Enter card number
     * @param cardNumber
     * */
    public MobilePhoneReplenishmentPage enterCardFrom(String cardNumber) {
        clearAndType(inputCardFrom, cardNumber);
        return this;
    }
    /**
     * Enter expired date of the card
     * @param expDate expired date in format MM/yy
     * */
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        clearAndType(inputCardExpDate, expDate);
        return this;
    }
    /**
     * Enter CVV-code of the card
     * @param cvv cvv-code
     * */
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv) {
        clearAndType(inputCardCvv, cvv);
        return this;
    }

    /**
     * Enter first name of the cardholder
     * @param firstName name of CardHolder
     * */
    public MobilePhoneReplenishmentPage enterFirstName(String firstName) {
        clearAndType(inputFirstName, firstName);
        return this;
    }
    /**
     * Enter last name of the cardholder
     * @param lastName name of CardHolder
     * */
    public MobilePhoneReplenishmentPage enterLastName(String lastName) {
        clearAndType(inputLastName, lastName);
        return this;
    }

    /**
     * Click on button "Add to cart"
     * */
    public MobilePhoneReplenishmentPage submitToTheCart() {
        buttonSubmitToTheCard.shouldBe(Condition.visible).click();
        return this;
    }
    /**
     * Check is the payment details is present or not
     * @param text
     * */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCart(String text) {
       checkMessage(text);
       return this;
    }
}
