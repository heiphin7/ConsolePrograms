import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String[][] array = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i % 2 == 0){
                    array[i][j] = "#";
                }else{
                    array[i][j] = ".";
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < a; i++) {
            if(i % 2 != 0){
                if(counter % 2 == 0){
                    array[i][b - 1] = "#";
                }else{
                    array[i][0] = "#";
                }
                counter++;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
