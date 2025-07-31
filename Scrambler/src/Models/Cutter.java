package Models;

import java.util.Arrays;

public class Cutter implements StringEncryptable {
    @Override
    public String encrypt(String phraseToEncrypt) {
        int sizeOfHalfTheWord = phraseToEncrypt.length() / 2;
        char[] encryptedPhrase = new char[phraseToEncrypt.length()];
        for (int i = 0; i < sizeOfHalfTheWord; i++) {
            encryptedPhrase[(encryptedPhrase.length - (1 + i))] = phraseToEncrypt.charAt(i);
        }
        for (int i = 0; i < sizeOfHalfTheWord; i++) {
            encryptedPhrase[i] = phraseToEncrypt.charAt(i + sizeOfHalfTheWord);
        }
        return readCharArray(encryptedPhrase);
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        int sizeOfHalfTheWord = phraseToDecrypt.length() / 2;
        char[] decryptedPhrase = new char[phraseToDecrypt.length()];
        for (int i = 0; i < sizeOfHalfTheWord; i++) {
            decryptedPhrase[i] = phraseToDecrypt.charAt((phraseToDecrypt.length() - (1 + i)));
        }
        for (int i = 0; i < sizeOfHalfTheWord; i++) {
            decryptedPhrase[i + sizeOfHalfTheWord] = phraseToDecrypt.charAt(i);
        }
        return readCharArray(decryptedPhrase);
    }
}
