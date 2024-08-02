import java.util.Arrays;

public class Tasks {
    //Задание №1
    static void printThreeWords(){
        System.out.println("Задание №1\nOrange\nBanana\nApple");
    }
    //Задание №2
    static void checkSumSign(){
        int a = -5;
        int b = 4;
        System.out.println("\nЗадание №2");
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Задание №3
    static void printColor(){
        int value = 101;
        System.out.println("\nЗадание №3");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Задание №4
    static void compareNumbers(){
        int a = 5;
        int b = -34;
        System.out.println("\nЗадание №4");
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //Задание №5
    static void checkNumSum(int a, int b){
        System.out.println("\nЗадание №5");
        if (a + b >= 10 & a + b <= 20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    //Задание №6
    static void isNumPosOrNeg(int a){
        System.out.println("\nЗадание №6");
        if (a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    //Задание №7
    static void isNumNegative(int a){
        System.out.println("\nЗадание №7");
        if (a < 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    //Задание №8
    static void printString(String a, int b){
        System.out.println("\nЗадание №8");
        System.out.println(a.repeat(b));
    }
    //Задание №9
    static void checkYear(int year){
        System.out.println("\nЗадание №9");
        if (year % 400 == 0 & year % 100 != 0) {
            System.out.println(true);
        } else if (year % 4 == 0 & year % 100 != 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    //Задание №10
    static void task10(){
        System.out.println("\nЗадание №10");
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 0, 1};
        System.out.println("Заданный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Замененный массив: " + Arrays.toString(arr));
    }
    //Задание №11
    static void task11(){
        System.out.println("\nЗадание №11");
        int[] arr = new int[100];
        int n = 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = n;
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
    //Задание №12
    static void task12(){
        System.out.println("\nЗадание №12");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Заданный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Замененный массив: " + Arrays.toString(arr));
    }
    //Задание №13
    static void task13(){
        System.out.println("\nЗадание №13");
        int[][] arr = new int[5][5]; //Можно ввести любые одинаковые числа
        //Вывод пустого массива
        System.out.println("Заданный массив: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        //Замена по диагоналям
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (i == j){
                    arr[i][j] = 1;
                }
            }
            for (int a = 0, b = arr.length-1; a < arr.length; a++, b--){
                arr[a][b] = 1;
            }
        }
        //Вывод готового массива
        System.out.println("Измененный массив: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    //Задание №14
    static void task14(int len, int initialValue){
        System.out.println("\nЗадание №14");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println("Заданный массив: " + Arrays.toString(arr));
    }
}
