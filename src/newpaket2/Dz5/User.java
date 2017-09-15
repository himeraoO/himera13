package newpaket2.Dz5;

import java.util.Date;

public class User {

    private String login;
    private String password;



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return (login != null ? login.equals(user.login) : user.login == null) && (password != null ? password.equals(user.password) : user.password == null);
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
