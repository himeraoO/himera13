package newpaket2.Dz5;
public class UserStorage {

    //не корректный вариант
/*    static {
        User user1 = new User("login1", "password1");
        User user2 = new User("login2", "password2");
        User user3 = new User("login3", "password3");
        User user4 = new User("login4", "password4");
        User user5 = new User("login5", "password5");
        User user6 = new User("login6", "password6");
        User user7 = new User("login7", "password7");
        User user8 = new User("login8", "password8");
        User user9 = new User("login9", "password9");
        User user10 = new User("login10", "password10");
        User[] user =  {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
    }



    public void authenticate(User user){







//
//     //   us = user.getLogin(), user.getPassword();
//            for (User s : ){
//                if (user(authenticate(User user)).equals(s)) {
//                    return true;
//                }
//            }
//            return false;
//        }

//        User newUser = new User(newUser.getLogin(), newUser.getPassword());
//        while (newUser.getLogin().equals(user.getLogin()) && newUser.getPassword().equals(user.getPassword())){
//            System.out.println("Authentication false");
//        }
//        System.out.println("Authentication true");



}

*/
    private static User[] users;
    static {
        users = new User[]{
                new User("l1", "p1"),
                new User("l2", "p2"),
                new User("login3", "password3"),
                new User("login4", "password4"),
                new User("login5", "password5"),
                new User("login6", "password6"),
                new User("login7", "password7"),
                new User("login8", "password8"),
                new User("login9", "password9"),
                new User("login10", "password10")
        };

    }


    public boolean authenticate(User user) {
        for (User el : users){
            if (el.equals(user)){
                return true;
            }
        }

        return false;
    }

}
