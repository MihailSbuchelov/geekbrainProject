package lessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    String word, patternWord;
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public Lesson3() {
        System.out.println("Welcome to the game!");
        System.out.println();
        System.out.println("Enter the word:");
        Scanner scanner = new Scanner(System.in);
        this.setWord(scanner.next());
        System.out.println("Your word: " + this.getWord());
        patternWord = getRandomFromWords();

        comparingWords(word, patternWord);

    }

    private void comparingWords(String userWord, String pattWord) {

    }

    private String getRandomFromWords() {
        int randomIndex = new Random().nextInt(words.length - 1);
        return words[randomIndex];
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


}
