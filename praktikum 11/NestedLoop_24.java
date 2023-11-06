import java.util.Scanner;
public class NestedLoop_24 {

    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        double[][] arrayreika = new double[5][7];

        for (int i = 0; i < arrayreika.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < arrayreika[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                arrayreika[i][j] = sc24.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < arrayreika.length; i++) {
            System.out.println("Kota ke-" + i);
            double totalTemp = 0;
            for (double temp : arrayreika[1]) {
                totalTemp += temp;
                System.out.println(temp + " ");
            }
            double rerataTemp = totalTemp / arrayreika[i].length;
            System.out.println("\nRata-rata: " + rerataTemp);
        }
        sc24.close();
    }
}