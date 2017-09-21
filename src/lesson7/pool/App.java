package lesson7.pool;

import java.util.*;

public class App {
    public static void main(String[] args) {

    /*

        int i1 = 127;
        int i2 = 127;
        int i3 = 129;
        int i4 = 129;

        System.out.println(i1 == i2);
    //    System.out.println(i1.hashCode() + " " + i2.hashCode());
        System.out.println(i3 == i4);
    //    System.out.println(i3.hashCode() + " " + i4.hashCode());

        System.out.println();
        String s1= "qwe";
        String s2= "qwe";
        String s3= "qwe";
        String s4= new String("qwe");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
*/
///////////////////////////////////////////////////////////////////
      /*  Map<String, Integer> map = new HashMap<>();
        map.put("one",     1);
        map.put("two",     2);
        map.put("three",     3);
        map.put("four",     4);

        System.out.println(map.get(1));
        System.out.println(map.get("two"));
        System.out.println(map.get("two1"));
*/

        Map<Key, Integer> map = new HashMap<>();   // не сохраняет порядок!!!!   //LinkedHashMap хранит в порядке добавления
        Key key1 = new Key("two");
        map.put(new Key ("one"),     1);
        map.put(key1,                2);
        map.put(new Key ("three"),   3);
        map.put(new Key ("four"),    4);


        System.out.println(map.get(new Key("two")));
        System.out.println(map.get(key1));
        System.out.println(map.get(new Key("two")));
        System.out.println(map.get(new Key("two")));

        for (Key key: map.keySet()){
            System.out.println("Key = " + key.s + ", value = " + map.get(key));
        }


        System.out.println();
        System.out.println();




        Set<String> strings = new HashSet<>();
        System.out.println(strings.add("s1"));
        System.out.println(strings.add("s2"));
        System.out.println(strings.add("s3"));
        System.out.println(strings.add("s1"));
        System.out.println(strings.add("s4"));
        System.out.println(strings.add("s3"));
        System.out.println(strings.add("s2"));
        System.out.println(strings.size());



    }

    static class Key{
        String s;
        public Key(String s){
            this.s = s;
        }

        @Override
        public boolean equals(Object obj) {
            Key other = (Key)obj;
            return Objects.equals(s, other.s);

        }

        @Override
        public int hashCode() {
            return s.hashCode();
        }
    }

}

