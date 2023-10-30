import java.util.Scanner;

public class suhu24 {
    public static void main(String[] args) {
         Scanner input24 = new Scanner (System.in);

         int suhu;
         char hujan;

         System.out.print("Masukkan suhu: ");
         suhu = input24.nextInt();
         System.out.print("Masukkan status: ");
         hujan = input24.next().charAt(0);

         if (suhu > 27) {
            System.out.println("Memakai Dress");
         if (hujan == 'y' || hujan== 'Y') {
            System.out.println("Membawa Payung");

         }else {
            System.out.println("Memakai Sunscreen");
         }
    }else{
        System.out.println("Memakai Celana Panjang");
    }
    
}
}