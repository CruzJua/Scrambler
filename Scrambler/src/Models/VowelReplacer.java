package Models;

import java.util.Arrays;

public class VowelReplacer implements StringEncryptable {

    @Override
    public String encrypt(String phraseToEncrypt) {
        char[] letters = phraseToEncrypt.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'a':
                    letters[i] = 'e';
                    break;
                case 'e':
                    letters[i] = 'i';
                    break;
                case 'i':
                    letters[i] = 'o';
                    break;
                case 'o':
                    letters[i] = 'u';
                    break;
                case 'u':
                    letters[i] = 'a';
                    break;
                default:

            }
        }
        return readCharArray(letters);
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        char[] letters = phraseToDecrypt.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'a':
                    letters[i] = 'u';
                    break;
                case 'e':
                    letters[i] = 'a';
                    break;
                case 'i':
                    letters[i] = 'e';
                    break;
                case 'o':
                    letters[i] = 'i';
                    break;
                case 'u':
                    letters[i] = 'o';
                    break;
                default:

            }
        }
        return readCharArray(letters);
    }
}
