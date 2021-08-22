package encryptdecrypt.algorithm;

public class UnicodeAlgorithm implements Encryption {

    @Override
    public String encrypt(String text, int key) {
        StringBuilder newSuggestion = new StringBuilder();
        text.chars().forEach(c ->{
            newSuggestion.append((char)(c+key));
        });
        return newSuggestion.toString();
    }

    @Override
    public String decrypt(String text, int key) {
        StringBuilder newSuggestion = new StringBuilder();
        text.chars().forEach(c ->{
            newSuggestion.append((char)(c-key));
        });
        return newSuggestion.toString();
    }
}
