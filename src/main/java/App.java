import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to cipher application, select your action:\n 1. Encode \n 2. Decode \n ");
        int option = scanner.nextInt();
        scanner.nextLine();

        if(option == 1){
            System.out.println("Enter some text");
            String userText = scanner.nextLine();
            System.out.println("Enter a key");
            int key = scanner.nextInt();
            Encrypt encrypt = new Encrypt(userText,key);
            System.out.println(String.format("Your encrypted text is:  %s",encrypt.encryption()));
        }


    }
}
