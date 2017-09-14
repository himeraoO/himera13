package newpaket2.Dz5;

import java.util.Arrays;
import java.util.Date;

public class UserStorage {
 //   User[] user;
    {
    //    User[] user = new User[10];
        User user1 = new User(1, "login1", "password1", "e-meil1", new Date());
        User user2 = new User(2, "login2", "password2", "e-meil2", new Date());
        User user3 = new User(3, "login3", "password3", "e-meil3", new Date());
        User user4 = new User(4, "login4", "password4", "e-meil4", new Date());
        User user5 = new User(5, "login5", "password5", "e-meil5", new Date());
        User user6 = new User(6, "login6", "password6", "e-meil6", new Date());
        User user7 = new User(7, "login7", "password7", "e-meil7", new Date());
        User user8 = new User(8, "login8", "password8", "e-meil8", new Date());
        User user9 = new User(9, "login9", "password9", "e-meil9", new Date());
        User user10 = new User(10, "login10", "password10", "e-meil10", new Date());
        User[] user =  {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof UserStorage)) return false;
//
//        UserStorage that = (UserStorage) o;
//
//        // Probably incorrect - comparing Object[] arrays with Arrays.equals
//        return Arrays.equals(user, that.user);
//    }
//
//    @Override
//    public int hashCode() {
//        return Arrays.hashCode(user);
//    }

    public void authenticate(User user){
//        User newUser = new User(newUser.getLogin(), newUser.getPassword());
//        while (newUser.getLogin().equals(user.getLogin()) && newUser.getPassword().equals(user.getPassword())){
//            System.out.println("Authentication false");
//        }
//        System.out.println("Authentication true");



}


}
