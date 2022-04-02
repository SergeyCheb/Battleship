import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) throws IllegalArgumentException {
        // write your code here
        switch (number) {
            case 1 :
                return new String("Mon");
            case 2 :
                return new String("Tue");
            case 3 :
                return new String("Wed");
            case 4 :
                return new String("Thu");
            case 5 :
                return new String("Fri");
            case 6 :
                return new String("Sat");
            case 7 :
                return new String("Sun");
            default:
                throw new IllegalArgumentException();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}