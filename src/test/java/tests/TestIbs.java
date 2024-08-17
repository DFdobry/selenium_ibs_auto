package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.Credentials;
import pages.InitTest;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class TestIbs extends InitTest {

    @Test
    @DisplayName("Добавление коммандировки")
    public void testIBS() {
        authorisationPage.login(Credentials.USER);
        basePage.panelHeader.shouldBe(Condition.visible, Duration.ofSeconds(7));
        basePage.selectFilter("Расходы");
        basePage.menuBusinessTrip.shouldBe(Condition.exist, Duration.ofSeconds(1));
        basePage.menuBusinessTrip.click();
        basePage.loader.shouldBe(Condition.hidden, Duration.ofSeconds(20));
        basePage.buttonCreateTrip.click();
        basePage.headerTrip.shouldBe(Condition.visible, Duration.ofSeconds(2));
        basePage.chooseSubUnit.click();
        basePage.chooseDevelopment.click();
        basePage.fillField.shouldBe(Condition.visible, Duration.ofSeconds(2));
        basePage.openList.click();
        basePage.chooseOrganisation.click();
        basePage.chooseHunterOrg.click();
        basePage.createTicket.click();
        basePage.cityDeparture.sendKeys(Keys.CONTROL + "a");
        basePage.cityDeparture.sendKeys(Keys.BACK_SPACE);
        basePage.cityDeparture.sendKeys("Россия, Курск");
        basePage.cityArrival.sendKeys(Keys.CONTROL + "a");
        basePage.cityArrival.sendKeys(Keys.BACK_SPACE);
        basePage.cityArrival.sendKeys("Россия, Москва");
        basePage.dataDeparture.sendKeys("01.09.2024");
        basePage.dataArrival.sendKeys("05.09.2024");
        basePage.dataArrival.sendKeys(Keys.ESCAPE);
        basePage.applyButton.click();
        basePage.validationError.shouldBe(Condition.exist, Duration.ofSeconds(3));
    }

}
