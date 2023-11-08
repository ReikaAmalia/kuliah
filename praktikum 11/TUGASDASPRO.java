import java.util.Scanner;
public class TUGASDASPRO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggiSegitiga = input.nextInt();
        
        for (int i = tinggiSegitiga; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
