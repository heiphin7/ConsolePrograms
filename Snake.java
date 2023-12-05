import java.util.Arrays;
import java.util.Scanner;

/*
Даются 2 вводных данных: a, b:
    Где a - количество строк.
        b - длина каждой строки

Задача данной программы:
    Создать двумерный массив ввиде "Змейки"

Условия:
Число а должно быть нечётным, это нужно для получения корректной "Змейки"
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вввод данных и создание Двумерного массива размеро a, b
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String[][] array = new String[a][b];

        //Заполняем массив "#" или "." в зависимости от чётности строки
        //То есть, если номер строки чётный, то полностью заполняем его одним из символов, а если иначе, то другим из символов
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i % 2 == 0){
                    array[i][j] = "#";
                }else{
                    array[i][j] = ".";
                }
            }
        }


        // Инициализируем вспомогательную переменную counter, чтобы наш массив обрёл вид змейки
        int counter = 0;
        for (int i = 0; i < a; i++) {
            if(i % 2 != 0){
                 //Заполняем либо первый либо последний элемент строки в зависимости от его номера i и counter
                if(counter % 2 == 0){
                    array[i][b - 1] = "#";
                }else{
                    array[i][0] = "#";
                }
                counter++;
            }
        }
        //Вывод двумерного массива через цикл
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
