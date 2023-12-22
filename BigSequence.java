import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        // Заполняем список 
        for (int i = 0; i < 10; i++) {
            int n  = scanner.nextInt();
            array.add(n);
        }

        // Инициализируем 2 переменных:
      // Максимальная Длина последовательности
      // Текущая Длина последовательности
        int maxLength = 1;
        int currentLength = 1;
      
        for (int i = 0; i < array.size() - 1; i++) {
            // Если текущий и стоящий после него элементы равны, то 
          // значение текущей длины последовательности будет увеличено
            if(array.get(i).equals(array.get(i + 1))){
                currentLength++;
            }else if(currentLength > maxLength){
              // И если текущая последовательность больше максимальной,
              // мы ее заменяем и "обнуляем" текущую последовательность
                maxLength = currentLength;
                currentLength = 1;
            }else{
                currentLength = 1;
            }
        }
      // Опять же, контрольная проверка на максимальную последовательность
        if(currentLength > maxLength){
            maxLength = currentLength;
        }
      // Вывод результата
        System.out.println(maxLength);
    }
}
