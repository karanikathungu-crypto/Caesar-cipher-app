import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean program = true;

        int option = scanner.nextInt();
        scanner.nextLine();
//        while (program) {
            System.out.println("Welcome to cipher application, select your action:\n 1. Encode \n 2. Decode \n");
            if (option == 1) {
                System.out.println("Enter some text");
                String userText = scanner.nextLine();
                System.out.println("Enter a key");
                int key = scanner.nextInt();
                System.out.println(String.format("Your encrypted text is:  %s", Encrypt.encryption(userText, key)));
            } else if (option == 2) {
                System.out.println("Enter the encrypted text to be decrypted");
                String userText = scanner.nextLine();
                System.out.println("Enter a key");
                int key = scanner.nextInt();
                System.out.println(String.format("Your decrypted text is:  %s", Decrypt.decryption(userText, key)));
//            } else if (option == 3) {
//                program = false;
//            }
        }
    }

}
