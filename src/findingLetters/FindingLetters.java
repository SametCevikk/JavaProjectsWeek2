package findingLetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingLetters {

    public static void main(String[] args) {

        List<String> letters = new ArrayList<>();
        letters.add("g");
        letters.add("c");
        letters.add("s");
        letters.add("t");


        findLetter(letters);
        findLetter(letters);
        findLetter(letters);
        findLetter(letters);

        System.out.println(letters);

    }

    private static void findLetter(List<String> letters) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a letter  ");
        String letter = scanner.nextLine();

        if (letters.contains(letter)) {
            for (int i = 0; i < letters.size(); i++) {
                if (letters.get(i).contains(letter)) {
                    letters.set(i, "found");
                    System.out.println("Letter is available");
                }
            }
        } else {
            letters.add(letter);
            System.out.println("Letter added");
        }


    }

}
