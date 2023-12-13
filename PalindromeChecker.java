import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      // Число, которое нужно проверить
        int n = scanner.nextInt();
      // Преобразовываю его в String, чтобы было удобнее сравнивать его
        String sn = String.valueOf(n);
        
        if(sn.length() % 2 == 0){
          // Создаю 2 переменные:
          // 1 - половина: от 0 индекса до половины строки
          // 2 - половина: от половины до конца
            String firstHalf = String.valueOf(new StringBuilder(sn.substring(0, sn.length() / 2)));
            String secondHalf = String.valueOf(new StringBuilder(sn.substring(sn.length() / 2)).reverse()); // Тут нужно перевернуть строку
          // И просто сравниваем их через  equals
          if(firstHalf.equals(secondHalf)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
          // Тут также как и с первым случаем, только тут нужно учитывать "центральное число".
          /*
          Например:
          1234321 - палиндром.
          и 4-ка, которая в центре не учитывается при проверке, поэтому во второй половину нужно учитывать данный факт
          */
            String firstHalf = String.valueOf(new StringBuilder(sn.substring(0, sn.length() / 2)));
            String secondHalf = String.valueOf(new StringBuilder(sn.substring((sn.length() / 2) + 1)).reverse());
          // Также просто сравниваем строки через equals
            if(firstHalf.equals(secondHalf)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
