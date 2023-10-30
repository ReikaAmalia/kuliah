import java.util.Scanner;
public class tugasindividu224 {
    public static void main(String[] args) {
        String username = "reikaamalia", username1, password = "abcd", password2;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan username : ");
        username1 = input.nextLine();
        System.out.println("Masukkan password : ");
        password2 = input.nextLine();

        if(username1.equals(username) && password2.equals(password)) {
            System.out.println("Anda berhasil login");
        } else {
            System.out.println("Anda gagal login");
        }
    }
}
