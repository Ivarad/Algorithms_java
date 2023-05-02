package org.example;

import java.util.Scanner;

public class BubbleSort {
    public boolean Sort() { // Функция сортировки
        boolean isSorted = false; // Булевая переменная, которая поможет определить, отсортирован ли массив
        int[] numbersArray = getArray(); // Объявлем и инициализируем int массив, с помощью функции для приема пользовательских значений

        if (numbersArray.length == 0)
            return false; // Проверка длины массива, если ее значение 0, прервем функцию, так как сортировать нечего

        while (!isSorted) { // Цикл, который закончится, только в том случае, если все значения в массиве будут отсортированы
            isSorted = true; // Меняем значение переменной, отвечающей за итеррации цикла сортировки, в случае если массив будет сразу отсортирован, цикл завершится
            for (int i = 0; i < numbersArray.length - 1; ++i) { // Идем по массиву
                if (numbersArray[i] > numbersArray[i + 1]) { // Проверяем, является ли текущее значение массива больше другого
                    // *Далее будет использоваться swap алгоритм
                    numbersArray[i + 1] = numbersArray[i] + numbersArray[i + 1]; // Присвоим значение следующему элементу, которое будет суммой его и текущего элемента

                    numbersArray[i] = numbersArray[i + 1] - numbersArray[i]; // Теперь присвоим значение текущему элементу, которое будет разностью следующего и его самого соответственно, таким образом в текущий элемент попадет значение следующего

                    numbersArray[i + 1] = numbersArray[i + 1] - numbersArray[i]; // Присваиваем следующему элементу, разность его и текущего, вследствии чего, мы меняем их значения местами

                    isSorted = false; // Так как порядок в массиве изменился, мы не знаем, стал ли он отсортированным, поэтому присваиваем значение переменной, отвечающей за иттерацию цикла, дабы повторить его
                }
            }
        }

        System.out.println("\nSorted array: ");

        for (int element : numbersArray) { // Цикл который выведет итог сортировки
            System.out.printf("%d ", element);
        }
        return true; // Конец функции, возвращаем значение, соответствующее успешной сортировке
    }

    private int[] getArray() { // Фукнция, которая позволяет наполнить массив пользовательскими данными
        Scanner input = new Scanner(System.in); // Объявляем и инициализируем сканер, необходимый для получения введенных пользователем данных
        System.out.println("Enter array size:");

        int[] numbersArray = new int[0]; // Объявляем и инициализируем массив

        if (input.hasNextInt()) { // Проверим, является ли введеное пользователем значение числом
            numbersArray = new int[input.nextInt()]; // Задаем длину массива, которую ввел пользователь
        } else {
            System.out.println("Incorrect value!");
            return numbersArray; // В случае если, введенное значение некорректно, завершаем фукнцию возвратом пустого массива
        }

        System.out.println("Enter array values:");

        for (int i = 0; i < numbersArray.length; ) { // Цикл, в котором массив наполняется введенными значениями
            input.nextLine(); // Переходим на следующее значение для сканера, это необходимо, для предотвращения бесконечного цикла, который возникнет, при некорректном вводе значения пользователем
            if (input.hasNextInt()) { // Проверка, является ли введеное значение числом
                numbersArray[i] = input.nextInt(); // Добавляем значение в массив
                i++; // Инкрементируем счетчик
            } else {
                System.out.println("Incorrect value!");
            }
        }
        System.out.println("You input this array:");

        for (int number : numbersArray) { // Цикл выводящий заполненный массив
            System.out.printf("%d ", number);
        }
        return numbersArray; // Конец функции, возвращаем массив
    }

}
