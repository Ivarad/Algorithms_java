package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selectAlgorithm(); // Вызов функции, с выбором нужного алгоритма
    }

    private static boolean selectAlgorithm() // Функция выбора алгоритма
    {
        Scanner input = new Scanner(System.in); // Объявляем и инициализируем сканер, необходимый для получения введенных пользователем данных
        System.out.println("Select algorithm: \n 1. Bubble sort");
        if (input.hasNextInt()) {  // Проверяем, является ли введеное значение пользователем, числом
            switch (input.nextInt()) { // Выбираем алгоритм, в зависимости от введеного значения
                case 1:
                    new BubbleSort().Sort(); // Вызов сортировки пузырьком
                    break;
                case 2:
                    break;

                default:
                    return false; // Если пользователь ввел не подходящее значение, завершаем работу функции путем возврата значния
            }
        } else return false; // Завершаем работу функции, если введеное значние не число
        return true; // Конец функции и возврат значения, при правильно введенных данных
    }
}