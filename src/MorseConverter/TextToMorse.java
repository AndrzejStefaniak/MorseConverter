package MorseConverter;

public class TextToMorse {


    private int textLenght;
    private String textLowerCase;
    private char[] textchar = new char[textLenght];
    private String[] morseCode = new String[textLenght * 3];

    public void setConvert(String text) {
        this.textLowerCase = text.toLowerCase();
        textLenght = textLowerCase.length();
        for (int i = 0; i < textLenght; i++) {

        }
    }

    public String[] getConvert () {
        return morseCode;
    }


}
