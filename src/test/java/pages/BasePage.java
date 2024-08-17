package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    public SelenideElement panelHeader = $x("//h1[text()='Панель быстрого запуска']");

    public ElementsCollection menuFilters  = $$x("//a[@class='unclickable']/ancestor::li");

    public SelenideElement menuBusinessTrip = $x("//span[text()='Командировки']");

    public SelenideElement buttonCreateTrip = $x("//a[ text()='Создать командировку']");

    public SelenideElement loader = $x("//div[@class='loader-content']");

    public  SelenideElement headerTrip = $x("//h1[ text()='Создать командировку']");

    public SelenideElement chooseSubUnit = $x("//select[@name='crm_business_trip[businessUnit]']");

    public SelenideElement chooseDevelopment = $x("//option[text()='Отдел внутренней разработки']");

    public SelenideElement fillField = $x("//span[text()='Отдел внутренней разработки']");

    public SelenideElement openList = $x("//a[text()='Открыть список']");

    public SelenideElement chooseOrganisation = $x("//span[text()='Укажите организацию']");

    public SelenideElement chooseHunterOrg = $x("//div[text()='(Хром) Призрачная Организация Охотников']");

    public SelenideElement createTicket = $x("//label[text()='Заказ билетов']/..//input");

    public SelenideElement cityDeparture = $x("//input[@data-name='field__departure-city']");

    public SelenideElement cityArrival = $x("//input[@data-name='field__arrival-city']");

    public SelenideElement dataDeparture = $x("//input[contains(@id, 'date_selector_crm_business_trip_departure')]");

    public SelenideElement  dataArrival = $x("//input[contains(@id, 'date_selector_crm_business_trip_return')]");

   public SelenideElement applyButton = $x("//button[@class='btn btn-success action-button']");

   public  SelenideElement validationError = $x("//div[@class='controls validation-error']");







    public void selectFilter(String nameFilter) {
        for(WebElement itemFilter:menuFilters) {
            if(itemFilter.getText().equals(nameFilter)) {
                itemFilter.click();
            }
        }
    }


}
