package newpaket2.Dz5;
// меню Дмитрия Процко
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        printMenu();

        String line;

        while (!(line = reader.readLine()).equals("4")) {
            Integer number = parseNumber(line);
            if (number == null || number <= 0 || number > 4) {
                System.out.println("You should enter the number between 1 and 4!");
                continue;
            }

            // Do here something with number
            System.out.println(number);

        }

        System.out.println("Good luck!");
        reader.close();
    }

    /**
     * Prints menu into console.
     */
    private static void printMenu() {
        System.out.println("Actions:");
        System.out.println("1. Show my posts");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. Exit");
    }

    /**
     * Parse passed string line into int. If line is not a number,
     * exception will be caught and returned null.
     *
     * @param line line to parse
     * @return integer value or null, if line contains symbols
     */
    private static Integer parseNumber(String line) {
        try {
            return Integer.parseInt(line);
        } catch (Exception exc) {
            return null;
        }
    }


}

