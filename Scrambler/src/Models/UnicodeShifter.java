package Models;

import java.util.Arrays;

public class UnicodeShifter implements StringEncryptable{
    String result = "";
    @Override
    public String encrypt(String phraseToEncrypt) {
        char[] encryptedPhrase = new char[phraseToEncrypt.length()];
        for (int i = 0; i < encryptedPhrase.length; i++) {
            encryptedPhrase[i] = (char)(phraseToEncrypt.codePointAt(i) + 5);
        }
        return readCharArray(encryptedPhrase);
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        char[] decryptedPhrase = new char[phraseToDecrypt.length()];
        for (int i = 0; i < decryptedPhrase.length; i++) {
            decryptedPhrase[i] = (char)(phraseToDecrypt.codePointAt(i) - 5);
        }
        return readCharArray(decryptedPhrase);
    }


}
