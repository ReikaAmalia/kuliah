import java.util.Scanner;
public class ProgramKasirToko24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
       
        String nama;

        System.out.println("Program toko");
        System.out.println("Masukkan nama Anda");
        nama = input24.nextLine();

        String produk, lanjut, member;
        int jumlah = 0, harga = 0;
        double diskon = 0, TotalItem, TotalBeli = 0, TotalDiskon = 0;

        do{
        System.out.println("Masukkan produk yang anda beli : ");
        produk = input24.nextLine();
        System.out.println("Banyaknya : ");
        jumlah = input24.nextInt();
        System.out.println("harga : ");
        harga = input24.nextInt();
        System.out.println("Diskon (%) : ");
        diskon = input24.nextDouble();
       
        input24.nextLine();
        TotalItem++;
        TotalBeli = jumlah * harga;
        TotalDiskon = TotalBeli * diskon;
        System.out.println("Apakah Anda mau menambahkan produk (y/t)");
        lanjut = input24.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Apakah anda mau mempunyai member (y/t)");
        member = input24.nextLine();

        if (member == 'Y' || member == 'y') {
            tipe = "member";
            if (subtotal >= 200000) {
                dis_mem = 0.1;
            } else {
                dis_mem = 0.05;
            }
        } else {
            tipe = "bukan member";
            dis_mem = 0;
        }
        nom_dis_mem = dis_mem * subtotal;
        total = subtotal - (jum_dis + nom_dis_mem);

        System.out.println("--------------------Total Pembelian--------------------");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Tipe : " + tipe);
        System.out.println("Total barang yang dibeli : " + jum_prod);
        System.out.println("Subtotal                 : " + subtotal);
        System.out.println("Jumlah diskon            : " + (jum_dis + nom_dis_mem));
        System.out.println("Total yang harus dibayar : " + total);

    }
}

