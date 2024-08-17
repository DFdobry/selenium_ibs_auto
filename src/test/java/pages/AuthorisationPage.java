package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorisationPage {

    protected SelenideElement fieldUserName = $x("//input[@name='_username']");
    protected SelenideElement fieldPassword = $x("//input[@name='_password']");
    protected SelenideElement submit = $x("//button[@id='_submit']");

    public void login(Credentials credentials) {
        fieldUserName.val(credentials.getLogin());
        fieldPassword.val(credentials.getPassword());
        submit.click();
    }

}
