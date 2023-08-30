import java.io.IOException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        float result = userInput();
    }

    public static float userInput() {
        Scanner scanner = new Scanner(System.in);
        boolean checker = false;
        float parsedInput = 0;
        while (!checker) {
            System.out.println("Input float");
            String userInput = scanner.nextLine();
            try {
                parsedInput = Float.parseFloat(userInput);
                System.out.println("Parsed successfully");
                checker = true;
            } catch (NumberFormatException e) {
                System.out.println("Can't parse to float");
            }

        }
        return parsedInput;
    }
}