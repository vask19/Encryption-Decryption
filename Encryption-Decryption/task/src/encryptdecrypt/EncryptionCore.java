package encryptdecrypt;

import encryptdecrypt.algorithm.EncryptionSender;
import encryptdecrypt.algorithm.EncryptionStaticFactory;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptionCore {
    public String  encryptOrDecrypt(String date,String algorithm,String mode, int key, String inFile, String outFile){
        String answer = null;
        EncryptionSender encryptionSender = new EncryptionSender();
        encryptionSender
                .setEncodingDecoding(EncryptionStaticFactory.newInstance(algorithm));

        if (mode.equals("dec")){
            if (date == null){
                writeInFile(outFile,
                        encryptionSender.decrypt(readFile(inFile),key));
                return null;
            }
            else return encryptionSender.decrypt(date,key);

        }
        else {
            if (date == null){
                writeInFile(outFile,
                        encryptionSender.encrypt(readFile(inFile),key));
                return null;
            }
            else return encryptionSender.encrypt(date,key);

        }
    }



    private static String readFile(String filePath){
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(filePath)){
            while (true){
                int  c;
                if ((c = fr.read()) ==-1) break;
                sb.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public void writeInFile(String filePath,String date){
        try (FileWriter fw = new FileWriter(filePath)){
            fw.write(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
