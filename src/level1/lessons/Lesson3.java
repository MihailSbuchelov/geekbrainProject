package level1.lessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    String userWord, patternWord;
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public Lesson3() {
        enterGame();
        while (!userWord.equals(patternWord)) {
            comparingWords();
        }
        System.out.println("Congratulate! You are win!");

    }

    void enterGame() {
        System.out.println("Welcome to the game!");
        System.out.println();
        patternWord = getRandomFromWords();
        System.out.println("Enter your word:");
        Scanner scanner = new Scanner(System.in);
        this.setUserWord(scanner.next());
        System.out.println("Your word: " + this.getUserWord());

    }

    void comparingWords() {
        hideOtherCharCompMass(fillingCompMass(userWord, patternWord), calculateBaseLengthCharMass(userWord, patternWord));
        System.out.println("Try again please:");
        Scanner scanner = new Scanner(System.in);
        this.setUserWord(scanner.next());
    }

    char[] fillingCompMass(String userWord, String patternWord) {
        char[] compMass = new char[15];
        char userChar, patternChar;
        for (int i = 0; i < calculateBaseLengthCharMass(userWord, patternWord); i++) {
            userChar = userWord.charAt(i);
            patternChar = patternWord.charAt(i);
            if (userChar == patternChar) {
                compMass[i] = userChar;
            } else {
                compMass[i] = '#';
            }
        }
        return compMass;
    }

    int calculateBaseLengthCharMass(String userWord, String patternWord) {
        if (patternWord.length() >= userWord.length()) {
            return userWord.length();
        } else {
            return patternWord.length();
        }
    }

    void hideOtherCharCompMass(char[] compMass, int compMassLength) {
        for (int i = compMassLength; i < 15; i++) {
            compMass[i] = '#';
        }
        for (int i = 0; i < compMass.length; i++) {
            System.out.print(compMass[i]);
        }
        System.out.println();
    }

    String getRandomFromWords() {
        int randomIndex = new Random().nextInt(words.length - 1);
        return words[randomIndex];
    }

    public String getUserWord() {
        return userWord;
    }

    public void setUserWord(String userWord) {
        this.userWord = userWord;
    }


}