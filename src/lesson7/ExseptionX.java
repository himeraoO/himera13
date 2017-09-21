package lesson7;

        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Date;

public class ExseptionX {
    public static void main(String[] args) throws ParseException  {

        SimpleDateFormat format = new SimpleDateFormat(("dd.MM.yyyy"));
        //      try {
        Date date = format.parse("19.09dd.2017");
//        } catch (ParseException e){
//            System.out.println("Exception occurred");
//            System.out.println("Exception message = " + e.getMessage());
//        }
        System.out.println("After try - catch");

    }









}
