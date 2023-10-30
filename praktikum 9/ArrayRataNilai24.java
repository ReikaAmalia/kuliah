import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyak;
        System.out.print("Masukkan jumlah mahasiswa : ");
        banyak = sc.nextInt();

        int[] nilaiMhs= new int[banyak];
        double jumLulus = 0, jumTidakLulus = 0, rataLulus, rataTidakLulus;
        int lulus = 0, tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) { 
        if (nilaiMhs[i] > 70) {
            lulus += 1;
            jumLulus += nilaiMhs[i];
        } else {
            tidakLulus += 1;
            jumTidakLulus += nilaiMhs[i];
        }
    }
    rataLulus = jumLulus / lulus;
    rataTidakLulus = jumTidakLulus / tidakLulus;
    System.out.println("Rata-rata nilai lulus = " +rataTidakLulus);
    System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        
}
}
