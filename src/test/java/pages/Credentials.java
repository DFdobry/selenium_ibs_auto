package pages;

public enum Credentials {

 USER("Taraskina Valeriya", "testing");


    public final String login;
 public final String password;

    Credentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
