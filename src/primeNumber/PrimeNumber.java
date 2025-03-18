package primeNumber;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number,int divisor){


        if(number<2){
            return false;
        }
        if(divisor> number/2){  //We checked all the divisors, the number is prime
            return true;
        }
        if(number % divisor ==0){
            return false;
        }
        return isPrime(number,divisor+1);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number  ");
        int number = scanner.nextInt();
        if(isPrime(number,2)){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }

}
