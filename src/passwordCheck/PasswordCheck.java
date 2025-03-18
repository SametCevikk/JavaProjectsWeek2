package passwordCheck;

import java.util.Scanner;

public class PasswordCheck {

    public static void isCorrect(String password) {

        if (password.length() >= 8 && !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
                password.endsWith("?")) {
            System.out.println("Password accepted");
        } else {
            System.out.println("Password not accepted");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Must contain at least 8 characters\n" +
                "2-Must not contain space characters\n" +
                "3-First letter must be capital letter\n" +
                "4-Last character must be ?");

        System.out.print("Please enter password  ");

        String password = scanner.nextLine();

        isCorrect(password);

    }
}
