import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap : ");
        String fullname = sc.nextLine();
        System.out.printf("Selamat Sore " + fullname);
        
    }
}
