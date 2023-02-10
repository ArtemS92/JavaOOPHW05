package Console;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public void print(double data, String title) { // Метод вывода
        System.out.printf("%s %f\n", title, data);
    }

    public int getChoice() { // Метод выбора операции
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        return in.nextInt();
    }
}
