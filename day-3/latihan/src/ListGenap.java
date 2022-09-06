import java.util.Scanner;

public class ListGenap {
    public static void main(String[] args) {       
        System.out.print("Masukkan angka : ");
        Scanner sc = new Scanner(System.in);
        int inputAngka = sc.nextInt();
        int i = 0;
        int count=0;
        while (count < inputAngka)
        {
            if(i % 2 == 0){
                System.out.print(i);
                count++;
                if (count < inputAngka){
                    System.out.print(", ");
                }
            }
            i++;}

        System.out.println("\n\n" + DateUtil.getInfoHari());
    }
}
