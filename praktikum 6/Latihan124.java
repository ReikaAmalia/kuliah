import java.util.Scanner;

public class Latihan124 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input24.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input24.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input24.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                System.out.println("Bilangan terbesar adalah " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah " + bil3);
            }
        } else {
            if (bil2 >= bil3) {
                System.out.println("Bilangan terbesar adalah " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah " + bil3);
            }
        }
    }
}