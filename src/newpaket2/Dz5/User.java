package newpaket2.Dz5;

import java.util.Date;

public class User {
    private int userId;
    private String login;
    private String password;
    private String email;
    private Date registrationDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int userId, String login, String password, String email, Date registrationDate) {
        this.userId = userId;
        this.login = login;
        this.password = password;
        this.email = email;
        this.registrationDate = registrationDate;
    }
}
