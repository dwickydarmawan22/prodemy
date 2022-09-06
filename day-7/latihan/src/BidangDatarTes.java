import java.util.ArrayList;
import java.util.List;

public class BidangDatarTes {
    public static void main(String[] args) {
        
        BidangDatar bd1 = new Persegi(5);
        BidangDatar bd2 = new Segitiga(7,3);
        BidangDatar bd3 = new Lingkaran(7);
    
        List<BidangDatar> list = new ArrayList<>();
        list.add(bd1);
        list.add(bd2);
        list.add(bd3);

        for (BidangDatar bd : list){
            System.out.println(bd);
        }
    }
}
