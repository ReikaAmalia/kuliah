import java.util.Scanner;
public class Gaji24 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, Totgaji, Gaji;
        int gaji, potGaji;
       
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan gaji pokok anda ");
        Gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji=input.nextInt();
        Totgaji=(jmlMasuk*Gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah " +Totgaji);

    }
    
}
