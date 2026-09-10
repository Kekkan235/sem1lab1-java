package edu.course.lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду (fizzbuzz, reverse, quadratic, series, palindrome):");
        System.out.print("> ");

        String inputLine = scanner.nextLine().trim();
        if (inputLine.isEmpty()) {
            System.out.println("Ошибка: пустой ввод");
            return;
        }

        String[] inputArgs = inputLine.split("\\s+");
        String command = inputArgs[0];

        switch (command) {
            case "fizzbuzz" -> fizzbuzz.run();
            case "reverse" -> {
                if (inputArgs.length < 2) {
                    System.out.println("Ошибка: для reverse нужна строка");
                    return;
                }
                String text = inputArgs[1];
                reverse.replace(text);
            }
            case "quadratic" -> {
                if (inputArgs.length < 4) {
                    System.out.println("Ошибка: для quadratic нужно 3 числа (a b c)");
                    return;
                }
                double a = Double.parseDouble(inputArgs[1]);
                double b = Double.parseDouble(inputArgs[2]);
                double c = Double.parseDouble(inputArgs[3]);
                quadratic.solve(a, b, c);
            }
            case "series" -> series.calculate();
            case "palindrome" -> {
                if (inputArgs.length < 2) {
                    System.out.println("Ошибка: для palindrome нужна строка");
                    return;
                }
                String fullText = String.join(" ", java.util.Arrays.copyOfRange(inputArgs, 1, inputArgs.length));
                fullText = fullText.replace("\"", "").replace("'", "");
                palindrome.checkPalindrome(fullText);
            }
            default -> {
                System.out.println("Неизвестная команда: " + command);
                System.out.println("Доступные команды: fizzbuzz, reverse, quadratic, series, palindrome");
            }
        }
    }
}