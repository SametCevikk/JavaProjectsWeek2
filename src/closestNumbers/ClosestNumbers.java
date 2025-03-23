package closestNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClosestNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(23);
        numbers.add(15);
        numbers.add(87);
        numbers.add(98);
        numbers.add(8);
        numbers.add(46);
        numbers.add(65);
        numbers.add(34);
        numbers.add(54);

        //numbers are listed from largest to smallest
        Collections.sort(numbers, Comparator.reverseOrder());


        int diff;
        //The difference between the first two elements was determined to be minimum
        int minDiff = numbers.get(0) - numbers.get(1);

        //The first 2 elements are considered as smallest.
        int minNumber1 = numbers.get(0);
        int minNumber2 = numbers.get(1);


        for (int i = 1; i < numbers.size() - 1; i++) {

            diff = numbers.get(i) - numbers.get(i + 1);

            if (diff < minDiff) {
                minDiff = diff;
                minNumber1 = numbers.get(i);
                minNumber2 = numbers.get(i + 1);
            }
        }
        System.out.println("Smallest two numbers are " + minNumber2 + "  " + minNumber1);
        System.out.println("The difference between two numbers is " + minDiff);



    }
}
