package uppgift3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {


        List<String> wordList = new ArrayList<>() {{
            add("Banana");
            add("Apple");
            add("Peer");
            add("Grapes");
            add("Watermelon");
            add("Orange");
            add("Lemon");
            add("Papaya");
            add("Pineapple");
            add("Broccoli");
        }};

        List<String> nameList = new ArrayList<>(){{
            add("Max");
            add("Sebastian");
            add("Connie");
            add("Malin");
            add("Alexander");
            add("Pavel");
            add("Andreas");
            add("Johanna");
            add("Kit");
            add("Luna");
        }};

        Predicate<String> wordsWithVowels = Pattern.compile("[AaEeUuIiOoYy][^AaEeUuIiOoYy].").asPredicate();

        List<String> vowelWords = wordList.stream()
                .filter(wordsWithVowels)
                .toList();
        System.out.println("Words with 2 or more vowels: " + vowelWords);

        wordList.stream()
                .filter(wordsWithVowels)
                .forEach(x -> System.out.println("My name is " + x + " and I have 2 or more vowels in my name"));

        List<String> vowelNames = nameList.stream()
                .filter(wordsWithVowels)
                .toList();
        System.out.println("Names with 2 or more vowels: " + vowelNames);

        nameList.stream()
                .filter(wordsWithVowels)
                .forEach(x -> System.out.println("My name is " + x + " and I have 2 or more vowels in my name."));
    }
}
