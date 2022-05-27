package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiService service = new BmiService();
        System.out.println("Расчёт индекса массы тела" +
                "\n" + "Введите вес: ");
        double weight = scanner.nextDouble();
        System.out.println("Введите рост");
        double growth = scanner.nextDouble();
        double index = service.calculate(weight, growth);
        System.out.println("Ваш индекс массы тела: " + index);
    }
}