package newpaket2.Dz5;

public class GenericExample<T> { //<T extends Number> смотри ниже *

    public void sort(T[] array){

    }
    public void sortO(Object[] array){
        //sort
        for (Object el: array){
            User user = (User) el;
        }
    }

    public <E> void sort1(E[] array){
        //sort
    }

    public static void main(String[] args) {
        new GenericExample<String>();   //.sort(new Integer[] {1, 2}); ошибка //* при <T extends Number> то String будет ошибкой
        new GenericExample<Integer>().sortO(new Object[]{1, "String"});
        new GenericExample<>().sort1(new Integer[]{1, 2});
    }




//    public void sort(int[] array){
//        //sort
//    }
//    public void sort(double[] array){
//        //sort
//    }
//    public void sort (Objects[] array){
//        //sort
//    }
//
}
