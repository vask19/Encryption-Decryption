package encryptdecrypt.algorithm;

public class ShiftAlgorithm implements Encryption {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public String encrypt(String text, int key) {
        StringBuilder newSuggestion = new StringBuilder();
        int index = 0;
        for (char c: text.toCharArray()){
            if (String.valueOf(c).matches("\\w")){
                index =  alphabet.indexOf(c);
                if (index + key >25) index = index + key - 26;
                else index += key;
                newSuggestion.append(alphabet.charAt(index));
            }
            else newSuggestion.append(c);
        }
        return newSuggestion.toString();
    }

    @Override
    public String decrypt(String text, int key) {
        StringBuilder newSuggestion = new StringBuilder();
        int index = 0;
        for (char c: text.toCharArray()){
            if (String.valueOf(c).matches("\\w")){
                index =  alphabet.indexOf(c);
                if (index - key <0) index = index - key + 26;
                else index -= key;
                newSuggestion.append(alphabet.charAt(index));
            }
            else newSuggestion.append(c);
        }
        return newSuggestion.toString();
    }
    }

