package encryptdecrypt.algorithm;

public class EncryptionSender {
    private Encryption encodingDecoding;

    public void setEncodingDecoding(Encryption encodingDecoding){

        this.encodingDecoding = encodingDecoding;
    }

    public String encrypt(String text,int key){

        return encodingDecoding.encrypt(text,key);
    }

    public String decrypt(String text,int key){
        return encodingDecoding.decrypt(text,key);

    }


    }
