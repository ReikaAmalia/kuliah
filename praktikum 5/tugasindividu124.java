import java.util.Scanner;
public class tugasindividu124 {
    public static void main(String[] args) {
        int jarak;
        Scanner input = new Scanner(System.in);
        jarak = input.nextInt();
        if (jarak < 5) {
            System.out.println("Menggunakan melee weapon");
        } else {
            System.out.println("Menggunakan ranged weapon");
        }
    }
    
}
