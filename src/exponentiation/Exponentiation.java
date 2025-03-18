package exponentiation;

import java.util.Scanner;

public class Exponentiation {

    public static int takeExponent(int number, int exponent){

        if(exponent>1){
             number*=takeExponent(number,exponent-1);
        }

        return number;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number  ");
        int number = scanner.nextInt();
        System.out.print("Please enter exponent value  ");
        int exponent = scanner.nextInt();
        System.out.println(takeExponent(number,exponent));
    }
}
