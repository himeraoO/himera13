package lesson8;

public class User {
    private String login;
    private String name;
    private  String lastName;
    private int age;



    private User(){}


    public static UserBuilder createBuilder(){
        return  new User().new UserBuilder();
    }


    public class UserBuilder{

        public User build(){
            if(age < 0|| age > 100){
                throw new IllegalArgumentException();
            }
            if (login == null || login.isEmpty()){
                throw new IllegalArgumentException("Invalid login");
            }
            return User.this;
        }

        public UserBuilder setLogin(String login){
            User.this.login = login;
            return this;
        }

        public UserBuilder setName(String name){
            User.this.name = name;
            return this;
        }

        public  UserBuilder setLastName(String lastName){
            User.this.lastName = lastName;
            return this;
        }
        public  UserBuilder setAge(int age){
            User.this.age = age;
            return this;
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
