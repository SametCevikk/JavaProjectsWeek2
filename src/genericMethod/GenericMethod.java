package genericMethod;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {

    public static void printArray(Object array){

        System.out.println(Arrays.deepToString(new Object[]{array}));
    }


    public static void main(String[] args) {
    String [] words={"Java","Generic","Array"};
    int [] numbers={5,85,63};
    char[] letter= {'s','t','k'};

    printArray(words);
    printArray(numbers);
    printArray(letter);


    }
}
