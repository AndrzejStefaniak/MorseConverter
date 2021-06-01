package MorseConverter;

import java.util.HashMap;
import java.util.Map;

public class TextToMorse {


    private int textLenght;
    private String textLowerCase;
    private char[] textchar = new char[textLenght];
    private String morseCode;

    public void setConvert(String text) {

        Map<Character, String> charToMorse = new HashMap<>();
        charToMorse.put('a', ".-");
        charToMorse.put('b', "-...");
        charToMorse.put('c', "-.-.");
        charToMorse.put('d', "-..");
        charToMorse.put('e', ".");
        charToMorse.put('f', "..-.");
        charToMorse.put('g', "--.");
        charToMorse.put('h', "....");
        charToMorse.put('i', "..");
        charToMorse.put('j', ".---");
        charToMorse.put('k', "-.-");
        charToMorse.put('l', ".-..");
        charToMorse.put('m', "--");
        charToMorse.put('n', "-.");
        charToMorse.put('o', "---");
        charToMorse.put('p', ".--.");
        charToMorse.put('q', "--.-");
        charToMorse.put('r', ".-.");
        charToMorse.put('s', "...");
        charToMorse.put('t', "-");
        charToMorse.put('u', "..-");
        charToMorse.put('v', "...-");
        charToMorse.put('w', ".--");
        charToMorse.put('x', "-..-");
        charToMorse.put('y', "-.--");
        charToMorse.put('z', "--..");
        charToMorse.put(' ', " ");

        this.textLowerCase = text.toLowerCase();
        textLenght = textLowerCase.length();
        textchar = textLowerCase.toCharArray();
        for (int i = 0; i < textLenght; i++) {
            morseCode = morseCode + charToMorse.get(textchar[i]);
        }
    }

    public String getConvert() {
        return morseCode;
    }


}
