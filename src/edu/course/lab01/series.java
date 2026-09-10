package edu.course.lab01;

public class series{
    public static void calculate() {
        double sum = 0;
        int n = 2;
        int count = 0;

        while (true) {
            double term = 1.0 / (n * n + n - 2);
            if (Math.abs(term) < 0.000001) {
                break;
            }
            sum = sum + term;
            count++;
            n++;
        }

        System.out.println("Сумма ряда: " + sum);
        System.out.println("Последний номер n: " + (n - 1));
        System.out.println("Добавлено членов: " + count);
    }
}