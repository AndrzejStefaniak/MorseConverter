package MorseConverter;

import java.util.Scanner;

public class Menu {

    public static void menu() {

        int userChoice;
        String text, morse;

        Scanner scanner = new Scanner();
        TextToMorse textToMorse = new TextToMorse();
        MorseToText morseToText = new MorseToText();

        System.out.println("Wybierz rodzaj konwersji:");
        System.out.println("1. Tekst -> Kod Morsa");
        System.out.println("2. Kod Morsa -> Tekst");
        System.out.println("3. Zakończ program");

        try {
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> {
                    System.out.println("Podaj tekst do konwersji:");
                    text = scanner.nextLine();
                    textToMorse.Convert(text);
                    System.out.println();
                    System.out.println("Tekst w postacji kodu morsa:");
                    System.out.println();
                }
                case 2 -> {}
                case 3 -> { System.exit(0);}
            }
        }
        catch () {

        }
    }
}
