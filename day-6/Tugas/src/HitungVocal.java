import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HitungVocal {
    static char[] vocals = new char[]{'a','i','u','e','o'};
    
    static Collection <HurufVocal> hurufCollection = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        for (int i = 0 ; i < kalimat.length();i++){
            tambah(kalimat.toLowerCase().charAt(i));
        }

        for (HurufVocal hv : hurufCollection){
            System.out.print(hv);
        }

        
        
    }

    public static void tambah(char huruf){
        boolean ditemukan = false;
        for (HurufVocal hv : hurufCollection){
            if (hv.vocal == huruf){
                hv.jumlah++;
                ditemukan=true;
            }
        }

        if (!ditemukan && apakahHurufVocal(huruf)){
            HurufVocal hv = new HurufVocal();
            hv.vocal = huruf;
            hv.jumlah = 1;
            hurufCollection.add(hv);
        }
        
        
    }

    static boolean apakahHurufVocal (char huruf) {
        for (char c : vocals){
            if(huruf==c) return true;
        }
        return false;
    }

    static class HurufVocal {
        char vocal;
        int jumlah=0;
        String hasil="";
        @Override
        public String toString() {
            for (int i = 0; i < jumlah; i++){
                hasil += vocal;
            }
            return  hasil;
        }

        
    }
}
