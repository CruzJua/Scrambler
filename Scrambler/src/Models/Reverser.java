package Models;

import java.util.Arrays;

public class Reverser implements StringEncryptable{
    @Override
    public String encrypt(String phraseToEncrypt) {
        char[] lettersInPhrase = new char[phraseToEncrypt.length()];
        for (int i = 0; i < lettersInPhrase.length; i++) {
            lettersInPhrase[lettersInPhrase.length - (1 + i)] = phraseToEncrypt.toCharArray()[i];
        }
        return readCharArray(lettersInPhrase);
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
            char[] lettersInEncryptedPhrase = new char[phraseToDecrypt.length()];
            for (int i = 0; i < lettersInEncryptedPhrase.length; i++) {
                lettersInEncryptedPhrase[(lettersInEncryptedPhrase.length - (1 + i))] = phraseToDecrypt.toCharArray()[i];
            }
            return readCharArray(lettersInEncryptedPhrase);
        }
    }

