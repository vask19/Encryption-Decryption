package encryptdecrypt.algorithm;

public interface Encryption {

    String encrypt(String text,int key);
    String decrypt(String text,int key);


}
