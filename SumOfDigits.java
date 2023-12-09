import java.util.Scanner;

public class Main {
    // Метод для вычисления суммы цифр числа
    public static int CalculateSum(int number){
        // Принимаем нужное число и инициализируем новую переменную Sum, в которую мы и будет прибавлять числа
        int Sum = 0;
        // Запускаем цикл while, который идет до тех пор, пока number > 0
        while(number > 0){
            // Прибавляем переменной Sum последнюю цифру числа number
            Sum += (number % 10);
            // "Убираем" последнее число у переменной number
            number /= 10;
        }
        return Sum;
    }

    public static int reverseNumber(int number){
        // Инициализируем переменную StringOfNumer, в которую записываем number ввиде String, после сразу переворачиваем строку
        String StringOfNumber = new StringBuilder(String.valueOf(number)).reverse().toString();
        // Инициализируем переменную intValue, в которую записываем StringOfNumber ввдие Integer
        int intValue = Integer.valueOf(StringOfNumber);

        return intValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int SumOfDigits = CalculateSum(n);
        int reversedNumber = reverseNumber(n);
        System.out.println("Digit Sum of Number: " + SumOfDigits);
        System.out.println("Reversed Number:" + reversedNumber);
    }
}

/*
 // by @heiPHin7
*/
