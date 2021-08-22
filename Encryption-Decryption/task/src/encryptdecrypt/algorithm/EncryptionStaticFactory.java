package encryptdecrypt.algorithm;

public class EncryptionStaticFactory {

    public static Encryption newInstance(String type){
        if ("unicode".equals(type)) {
            return new UnicodeAlgorithm();
        }
        return new ShiftAlgorithm();



    }

}
