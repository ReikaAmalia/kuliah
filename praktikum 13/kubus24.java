import java.util.Scanner;
public class kubus24 {
    public static int hitungVolume(int s){
        int volume=s*s*s;
        return volume;
    }
    public static int hitungLuasPermukaan(int s){
        int luasPermukaan=6*s*s;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi :");
        int sisi=input.nextInt();

        int Vol = hitungVolume(sisi);
        System.out.println("volume kubus adalah "+Vol );
        int luas = hitungLuasPermukaan(sisi);
        System.out.println("luas permukaan "+luas );
    }
}
