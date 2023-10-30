import java.util.Scanner;
public class BioskopWithScanner24 {

    public static void main(String[] args) {
        Scanner scan24 = new Scanner (System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        while (true) {
        System.out.print("Masukkan nama: ");
        nama = scan24.nextLine();
        System.out.print("Masukkan baris: ");
        baris = scan24.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = scan24.nextInt();
        scan24.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = scan24.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;

        }

    }
}
}