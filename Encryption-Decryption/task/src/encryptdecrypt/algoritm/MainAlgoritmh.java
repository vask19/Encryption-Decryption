package encryptdecrypt.algoritm;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainAlgoritmh {
    public String encryptOrDecrypt(String mode, String data, int key){
        String answer = null;
        switch (mode){
            case "enc":
                encrypt(data,key);
                break;
            case "dec":
                answer = decrypt(data,key);
                break;
            default:
                answer = "error";
        }
        System.out.println(answer);
        return answer;
    }

    public void encryptOrDecrypt(String mode, int key, String inFile, String outFile){
        String answer = null;
        switch (mode){
            case "enc":
                writeInFile(outFile,encrypt(readFile(inFile),key));
                break;
            case "dec":
                writeInFile(outFile,decrypt(readFile(inFile),key));
                break;
            default:
                answer = "error";
        }

    }






    private String encrypt(String text,int key){
        StringBuilder newSuggestion = new StringBuilder();
        text.chars().forEach(c ->{
            newSuggestion.append((char)(c+key));
        });
        return newSuggestion.toString();
    }
    private String decrypt(String text,int key){
        StringBuilder newSuggestion = new StringBuilder();
        text.chars().forEach(c ->{
            newSuggestion.append((char)(c-key));
        });
        return newSuggestion.toString();
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
