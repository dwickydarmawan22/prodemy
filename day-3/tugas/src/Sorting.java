import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Sorting {
    static private Integer[] bilanganBulat = new Integer[] {6,2,3,1,4,7,8,5,9};
    static private int i, j, temp;
    public static void main(String[] args) {
        System.out.printf("Bilangan Bulat awal : %s\n", Arrays.toString(bilanganBulat));
        ascendingMethod();
        descendingMethod();
        ascendingNumber();
        descendingNumber();
    }
    
    public static void ascendingMethod(){
        Arrays.sort(bilanganBulat);
        System.out.printf("Bilangan bulat ascending sorting pakai method : %s\n",Arrays.toString(bilanganBulat));
    
    }
    public static void descendingMethod(){
        Arrays.sort(bilanganBulat, Collections.reverseOrder());
        System.out.printf("Bilangan bulat descending sorting pakai method : %s\n",Arrays.toString(bilanganBulat));
    }

    public static void ascendingNumber(){
        int n = bilanganBulat.length;
        for (int i = 0; i < n - 1; i++ ){
            for( int j = i+1 ; j< n;j++  ) {
                if (bilanganBulat[i] > bilanganBulat[j]){
                    temp = bilanganBulat[i];
                    bilanganBulat[i]=bilanganBulat[j];
                    bilanganBulat[j]=temp;
                }
            }
            
        }
        System.out.print("\nBilangan Bulat Ascending sort : ");
        for (int i=0; i<n;i++){
            System.out.print(bilanganBulat[i] + " ");
        }
    }

    public static void descendingNumber(){
        int n = bilanganBulat.length;
        for (int i = 0; i < n - 1; i++ ){
            for( int j = i+1 ; j< n;j++  ) {
                if (bilanganBulat[i] < bilanganBulat[j]){
                    temp = bilanganBulat[i];
                    bilanganBulat[i]=bilanganBulat[j];
                    bilanganBulat[j]=temp;
                }
            }
            
        }
        System.out.print("\nBilangan Bulat Descending sort : ");
        for (int i=0; i<n;i++){
            System.out.print(bilanganBulat[i] + " ");
        }
    }
}
