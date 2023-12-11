import java.util.Scanner;
/*
*  Данная программа принимает 3 строки:
    1. 1 - ю подстроку
    2. 2 - ю подстроку
    3. 3 - строку, в которой содержится 1 и 2 подстрока.

    Если в 3ьей строке есть и первая и вторые подстроки, программа выводит на экран YES, и NO в противном случае.
    Программа работает вне зависимости от порядка символов строк.
    
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      // Считывание строк
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
      // Создаём дополнительную строку, а именно строку, которая содержит первую со второй строки
        String str4 = str1 + str2;
      
        // Если длина 4 - ой строки будет больше 3ей, то это означает, что 1 и 2 строка не может содержаться в 3ей строке
        if(str4.length() > str3.length()){
            System.out.println("NO");
        }else{
          // Иначе, мы инициализируем переменную matchingcount и используем созданный нами метод countMatching
            int matchingCount = countMatching(str3, str4);
            // Если количество совпадаемых элементов(типа char) равна длине строки 3, тогда YES
            if(matchingCount == str3.length()){
                System.out.println("YES");
            }else{
              // Иначе NO
                System.out.println("NO");
            }
        }
    }
    // Метод countMatching, для подсчета количества элементов, которые совпадают между строками
    private static int countMatching(String str1, String str2) {
      // Создаём массив char и конвентируем строки в массив 
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        int matchingCount = 0;
        // Цикл для самого подсчета
        // В данном случае я использовал for - each, который удобнее мне
        for (char c : charArray1) {
            for (int i = 0; i < charArray2.length; i++) {
              // Идет сравнение текущего символа с символом первого массива
                if (c == charArray2[i]) {
                  // Если есть совпадение, тогда увеличиваем наш счётчик
                    matchingCount++;
                  // А также, мы присваимваем пустую строку для символа из 2-го массива, чтобы
                    charArray2[i] = ' '; // Чтобы избежать повторного подсчета символа
                    break;
                }
            }
        }

        return matchingCount;
    }
}
