package lesson7.pool;

public class PoolTest {

    public static void main(String[] args) {

        Integer i1 = -127;
        Integer i2 = -127;
        Integer i3 = -129;
        Integer i4 = -129;

        System.out.println("Integer pool.");
        // Java caches integer values in range from -128 to 127
        System.out.println(i1 == i2);   // true!
        System.out.println(i3 == i4);   // false!


        System.out.println("String pool.");
        String s1 = "some";
        String s2 = "some";
        String s3 = "some";
        String s4 = new String("some"); // here will be created another object!
        System.out.println(s1 == s2);   // true
        System.out.println(s2 == s3);   // true
        System.out.println(s1 == s4);   // false


    }

}