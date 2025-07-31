package Models;

public interface StringEncryptable {
    String encrypt(String phraseToEncrypt);
    String decrypt(String phraseToDecrypt);
    default String readCharArray(char[] chAr){
        String result = "";
        for (int i = 0; i < chAr.length; i++) {
            result += chAr[i];
        }
        return result;
    }
}
