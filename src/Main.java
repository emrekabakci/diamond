import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++){
            for (int k = 1; k <= line - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = line - 1; i >= 1; i--){
            for (int j = 1; j <= line - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}