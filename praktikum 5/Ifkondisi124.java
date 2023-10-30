/**
 * Ifkondisi124
 */
import java.util.Scanner;
 public class Ifkondisi124 {

    public static void main(String[] args) {
        Scanner sc00 = new Scanner(System.in);

        System.out.print("Masukkan Suhu :");
        int suhu = sc00.nextInt();

        if (suhu<16){
            System.out.println("silakan menggunakan jaket");
        }
        if (suhu<20){
            System.out.println("silakan pakai baju tebal");
        }
        else{
            System.out.println("silakan pakai topi");
        }
    }
}