package nyc.c4q.ramonaharrison;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Ramona Harrison
 * WordTracker.java
 */

public class WordTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        boolean addMode = true;

        System.out.println("Please give me some words:");
        while(true) {
            String wordToAdd = sc.next();
            if (wordToAdd.equalsIgnoreCase("stop")) {
                break;
            }
            if (wordToAdd.equalsIgnoreCase("rm")) {
                addMode = false;
                continue;
            }
            if (wordToAdd.equalsIgnoreCase("add")) {
                addMode = true;
                continue;
            }
            if (wordToAdd.equalsIgnoreCase("clr")) {
                words.clear();
                continue;
            }

            if (addMode) {
                if (words.containsKey(wordToAdd)) {
                    words.put(wordToAdd, words.get(wordToAdd) + 1);
                } else {
                    words.put(wordToAdd, 1);
                }
            } else {
                if (words.get(wordToAdd) > 1) {
                    words.put(wordToAdd, words.get(wordToAdd) - 1);
                } else {
                    words.remove(wordToAdd);
                }

            }

        }

        System.out.println("Thanks! You have given me " + words.size() + " word(s)!");
        if (words.isEmpty()) {
            System.out.println("Words is empty.");
        } else {
            System.out.println("Here they are:");
            for (String word : words.keySet()) {
                System.out.println(word + ": " + words.get(word));
            }

        }

    }

}
