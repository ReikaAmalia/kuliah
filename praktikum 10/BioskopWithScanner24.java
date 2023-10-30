import java.util.Scanner;
public class BioskopWithScanner24 {

    public static void main(String[] args) {
        Scanner scan24 = new Scanner (System.in);
        Scanner scan241 = new Scanner (System.in);

        int baris, kolom;
        String nama, next;
        String [][] penonton = new String [4][2];

        while (true) {
        System.out.println("Menu 1: Input Data Penonton");
        System.out.println("Menu 2: Tampilkan daftar penonton");
        System.out.println("Menu 3: Exit");
        System.out.println("Pilih menu: ");
        int menu = scan241.nextInt();

        if (menu==1){
        System.out.print("Masukkan nama: ");
        nama = scan24.nextLine();
        boolean kursiTersedia = true;
        while (kursiTersedia){ // jika tidak tersedia maka akan kembali untuk memasukkan baris dan kolom}
        System.out.print("Masukkan baris: ");
        baris = scan24.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = scan24.nextInt();
        scan24.nextLine();


        // pengecekan kolom dan baris valid/tidak
        if (baris >= 1 && baris <= penonton.length && kolom >=1 && kolom <= penonton[0].length){
            if (penonton[baris - 1][kolom - 1]== null){
                penonton[baris - 1][kolom - 1]= nama;
                System.out.println("Kursi berhasil terisi");
                kursiTersedia=false;
            }else {
                System.out.println("Kursi telah terisi");
            }
        }else {
                System.out.println("Kolom dan baris tidak tersedia");
            }
        }

        
        }else if (menu==2){
            for (int i =0; i<penonton.length;i++){
            for (int j =0; j<penonton[i].length; j++){
                if(penonton[i][j] != null){
                System.out.printf("Baris %d, Kolom%d: %s\n", i + 1,j + 1, penonton[i][j]);
                }else {
                    System.out.printf("Baris %d, Kolom %d: *\n", i + 1, j + 1, penonton[i][j]);
                }
            }
        }

    }else if (menu==3){
        System.out.println("Keluar sistem");
        break;
    }

        System.out.print("Input penonton lainnya? (y/n): ");
        next = scan24.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;

        }

    }
}
}