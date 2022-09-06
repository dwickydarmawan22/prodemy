import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args)  {
        System.out.print("Masukkan angka : ");
        Scanner sc = new Scanner(System.in);
        int inputAngka = sc.nextInt();
        for (int i = 1; i <= inputAngka; i++){
            if (i % 2 == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "\n" + DateUtil.getInfoHari());
    }
}
