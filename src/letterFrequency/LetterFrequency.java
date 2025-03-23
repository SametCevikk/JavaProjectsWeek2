package letterFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a text  ");
        String text = scanner.nextLine();
        text=text.toLowerCase();
        text=text.replace(" ","");
        Map<Character,Integer> letters = new HashMap<>();

        for(char letter : text.toCharArray()){
            letters.put(letter,letters.getOrDefault(letter,0)+1);
        }

        for(Map.Entry<Character,Integer> entry :letters.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
