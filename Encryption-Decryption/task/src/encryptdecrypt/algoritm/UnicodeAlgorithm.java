package encryptdecrypt.algoritm;

public class UnicodeAlgorithm implements EncodingDecoding{

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
