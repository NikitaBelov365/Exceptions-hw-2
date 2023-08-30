import java.io.IOException;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) throws IOException {
        userInput();
    }

    public static void userInput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input something");

        String userInput = scanner.nextLine();
        if (userInput.equals("")) {
            System.out.println("Input cant be empty");
            throw new IOException("Input cant be empty");
        }
    }
}
