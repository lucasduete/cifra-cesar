package io.github.lucasduete;

import java.util.Arrays;
import java.util.List;

public class App {

    private static final List<String> alphabet = Arrays.asList(
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","w","x","y","z"
    );

    public static void main(String[] args) {

        //Letra A
        System.out.printf("Letra A:\n");
        encryptText(10,"Hello World'");

        System.out.printf("\n\n");

        //Letra B
        System.out.printf("Letra B:\n");
        encryptText(5,"Hello World'");
    }

    private static void encryptText(int key, String plainText) {
        String cifredText = plainText.toLowerCase().trim();

        for(int i = 0; i < cifredText.length(); i++) {
            int positionNewKey = alphabet.indexOf(String.valueOf(cifredText.charAt(i))) + key;

            if (positionNewKey >= alphabet.size())
                positionNewKey -= alphabet.size();

            System.out.printf("%s", alphabet.get(positionNewKey));
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