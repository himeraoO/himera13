package lesson7;

public class Application {

    public static void main(String[] args) {
        CustomList<Integer> list = new CustomOneWayList<>();
        int count = 0;

        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count++);
        list.add(count);

        list.delete(12);
        list.delete(0);
        System.out.println("");

    }

}