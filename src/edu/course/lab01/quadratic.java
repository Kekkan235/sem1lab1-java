package edu.course.lab01;

public class quadratic {
    public static void solve(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Ошибка: a не может быть 0 (уравнение не квадратное)");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два вещественных корня: " + root1 + " и " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Один вещественный корень: " + root);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}