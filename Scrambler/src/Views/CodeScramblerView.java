package Views;

import java.util.Scanner;

public class CodeScramblerView {
    Scanner scanLee = new Scanner(System.in);
    public void printMessage(String message){
        System.out.println(message);
    }
    public int chooseEncryption(){
        while (true){
            System.out.println("""
                    What methods of encryption would you like to use:
                    1. Reverser
                    2. Cutter
                    3. Vowel Replacer
                    4. UnicodeShifter
                    5. Start Encrypting!!""");

            switch (scanLee.nextLine()){
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                default:
                    System.out.println("Sorry that's an invalid option!");

            }
        }
    }
    public String start(){
        while(true) {
            System.out.println("Please enter a message to Encrypt");
            String message = scanLee.nextLine();
        if (message.isBlank()){
            System.out.println("Sorry the message can't be blank! Try again!");
        }else {
            return message;
        }
        }
    }

}
