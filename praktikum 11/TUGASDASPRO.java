import java.util.Scanner;
public class TUGASDASPRO {
        public static void main(String[] args) {
            int tinggi = 5;
            int lebar = 8;
    
            for (int i = 1; i <= tinggi; i++) {
                for (int j = 1; j <= lebar; j++) {
                    // Cetak '*' jika berada di pinggir atau dalam persegi
                    if (i == 1 || i == tinggi || j == 1 || j == lebar) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
