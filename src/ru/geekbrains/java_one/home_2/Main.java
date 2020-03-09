package ru.geekbrains.java_one.home_2;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr4 = {14, 24, 5, 30, 28, 23, 2};

        replacement(arr1);
        fillArray(arr2);
        multiplicationByTwo(arr3);
        System.out.println("min =  " + min(arr4));
        System.out.println("max = " + max(arr4));


    }
    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0
        public static void replacement(int[] arr1) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr1[i] == 1 ? 0 : 1;
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    // Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
    public static void fillArray (int[] arr2) {
        for (int i = 0, j = -2; i < arr2.length; i++) arr2[i] = j +=3;
        for (int y : arr2) System.out.print(y + " ");
        System.out.println();
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static void multiplicationByTwo(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }

    //Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента
    public static int min(int[] arr4) {
           int x = arr4[0];
            for (int i = 0; i < arr4.length; i++) {
                if (x > arr4[i])
                   x = arr4[i];
           }
           return x;
        }

        public static int max(int[] arr4) {
           int x = arr4[0];
           for (int i = 0; i < arr4.length; i++) {
                if (x < arr4[i])
                    x = arr4[i];
            }
           return x;

        }
    }






