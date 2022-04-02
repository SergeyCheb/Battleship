import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int tempInt = -1;
        do {
            String tempStr = scanner.next();
            try {
                tempInt = Integer.parseInt(tempStr) * 10;
                if (tempInt != 0) {
                    System.out.println(tempInt);
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: " + tempStr);
            }
        } while (tempInt != 0);
    }
}
