package am.aca.disco;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
//        File file = new File("./scr/test.txt");
//
//        try (Scanner scanner = new Scanner(file)) {
//            System.out.println(scanner.nextLine());
//        } catch (FileNotFoundException e) {
//            System.out.println("In catch block");
//            e.printStackTrace();
//        }
//
//        try (MyCustomAutoCloseable customAutoCloseable = new MyCustomAutoCloseable();
//             Scanner scanner = new Scanner(file)) {
//            customAutoCloseable.foo();
//        } catch (Exception e) {
//        }

        String s = "asdfafs";

        if (!isValidEmail(s)) {
            throw new EmailValidationException("Invalid email");
        }
    }

    static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    static void throwSomeExp() throws IOException {
        throw new IOException();
    }

    static void first() {
        second();
    }

    private static void second() {
        third();
    }

    private static void third() {
        throw new RuntimeException();
    }
}
