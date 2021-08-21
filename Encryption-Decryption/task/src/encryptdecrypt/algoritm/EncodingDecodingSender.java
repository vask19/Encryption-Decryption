package encryptdecrypt.algoritm;

public class EncodingDecodingSender {
    private EncodingDecoding encodingDecoding;

    public void setEncodingDecoding(EncodingDecoding encodingDecoding){
        this.encodingDecoding = encodingDecoding;
    }

    public String encrypt(String text,int key){
        return encodingDecoding.encrypt(text,key);
    }

    public String decrypt(String text,int key){
        return encodingDecoding.decrypt(text,key);

    }


    }
