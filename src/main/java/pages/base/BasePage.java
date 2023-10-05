package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class BasePage {

    public final SelenideElement authWidgetP24New = $x("//iframe[@src='https://login-widget.privat24.ua/']");
    /**
     * The method for navigating to a specific @param url
     * */
    public void goToUrl(String URL) {
        open(URL);
    }
    /**
     * A method that cleans the element of the text and enters the desired text
     * @paran element Selenide Element
     * @param value test
     * */
    protected void clearAndType (SelenideElement element, String value) {
        while(!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
    }

    /**
     * Checking whether a frame for authorization
     * */
    public void checkIsDisplayedAuthWidget(){
        authWidgetP24New.shouldBe(Condition.visible);
    }

    public void checkMessage(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }
}
