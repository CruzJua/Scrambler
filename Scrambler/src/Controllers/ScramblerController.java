package Controllers;

import Models.*;
import Views.CodeScramblerView;

import java.util.ArrayList;

public class ScramblerController {
    private String usersMessage;
    String message = "Hello my Brother";
    String encrypted;
    String decrypted;
    ArrayList<StringEncryptable> stringEncryptables = new ArrayList<>();
    CodeScramblerView view = new CodeScramblerView();
    boolean isRunning;

    public void run() {
        isRunning = true;
        message = view.start();
        while (isRunning) {
            addEncryption(view.chooseEncryption());
        }
    }

    public void runEncryption() {
        for (StringEncryptable stringEncryptable : stringEncryptables) {
            encrypted = stringEncryptable.encrypt(message);
            decrypted = stringEncryptable.decrypt(encrypted);
            view.printMessage(encrypted);
            view.printMessage(decrypted);
        }
    }

    public void addEncryption(int encryption) {
        switch (encryption) {
            case 1:
                    if (stringEncryptables.isEmpty() || !stringEncryptables.contains(Reverser.class)) {
                        stringEncryptables.add(new Reverser());
                    }
                    break;
            case 2:
                    if (stringEncryptables.isEmpty() || !stringEncryptables.contains(Cutter.class)) {
                        stringEncryptables.add(new Cutter());
                    }
                    break;
            case 3:
                    if (stringEncryptables.isEmpty() || !stringEncryptables.contains(VowelReplacer.class)) {
                        stringEncryptables.add(new VowelReplacer());
                    }
                    break;
            case 4:
                    if (stringEncryptables.isEmpty() || !stringEncryptables.contains(UnicodeShifter.class)) {
                        stringEncryptables.add(new UnicodeShifter());
                    }
                    break;
            case 5:
                    if (!stringEncryptables.isEmpty()) {
                        isRunning = false;
                        runEncryption();
                    }

        }
    }
}
