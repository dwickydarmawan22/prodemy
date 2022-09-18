import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestProSigmaka {
    public static void main(String[] args) {

        int indeksAwal = 6;
        int indeksAkhir = 7;
        int result=1;
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,3,1,2,3,2,3,3));
        System.out.println(arr);

        List<Integer> arr2 = arr.subList(indeksAwal, indeksAkhir+1);
        Collections.sort(arr2);
        System.out.println(arr2);

        for (int i = 1; i < arr2.size(); i++){
            if (arr2.get(0) == arr2.get(i)){
                result++;
            }
        }

        System.out.println(result);


        
    }
}
