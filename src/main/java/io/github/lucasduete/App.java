package io.github.lucasduete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final List<String> alphabetA = Arrays.asList(
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","z"
    );

    private static final List<String> alphabetB = Arrays.asList(
            "4","b","h","d","3","z","g","c","a","j","k","t","m","n","1", "0","p","q","r","o","s","l","u","w","x","y","f","e"
    );

    public static void main(String[] args) {

//        Letra A
//        System.out.printf("Letra A:\n");
//        encryptText(10,"Hello World",1);

//        System.out.printf("\n\n");

//        Letra B
//        System.out.printf("Letra B:\n");
//        encryptText(5,"HelloWorld",1);


        System.out.printf("\n\nDigite o Texto:");
        Scanner scanner = new Scanner(System.in);

        decryptText(
                scanner.next(), 1
        );

    }

    private static void encryptText(int key, String plainText, int choise) {
        String cifredText = plainText.toLowerCase().replaceAll(" ","");
        List<String> alphabet = alphabetA;

        switch (choise) {
            case 1:
                alphabet = alphabetA;
                break;
            case 2:
                alphabet = alphabetB;
                break;
        }

        for(int i = 0; i < cifredText.length(); i++) {
            int positionNewKey = alphabet.indexOf(String.valueOf(cifredText.charAt(i))) + key;

            if (positionNewKey >= alphabet.size())
                positionNewKey -= alphabet.size();

            System.out.printf("%s", alphabet.get(positionNewKey));
        }
    }

    private static void decryptText(String cifredText, int choise) {
        String plaindText = cifredText.toLowerCase().replaceAll(" ","");
        List<String> alphabet = alphabetA;

        switch (choise) {
            case 1:
                alphabet = alphabetA;
                break;
            case 2:
                alphabet = alphabetB;
                break;
        }

        for(int key = 0; key <= alphabet.size(); key++) {

            System.out.printf("|%d|     ", key);

            for(int i = 0; i < cifredText.length(); i++) {
                int positionNewKey = alphabet.indexOf(String.valueOf(plaindText.charAt(i))) - key;

                if (positionNewKey < 0)
                    positionNewKey += alphabet.size();

                System.out.printf("%s", alphabet.get(positionNewKey));
            }

            System.out.printf("\n");
        }
    }



//    private static String encryptText(int key, String plainText) {
//        String cifredText;
//
//        cifredText = plainText.toLowerCase().trim();
//
//        for(int i = 0; i < alphabet.size(); i++) {
//            int positionNewKey = i + key;
//
//            if (positionNewKey >= alphabet.size())
//                positionNewKey -= alphabet.size();
//
//            cifredText = cifredText.replaceAll(alphabet.get(i), alphabet.get(positionNewKey));
//        }
//
//        return cifredText;
//    }


}