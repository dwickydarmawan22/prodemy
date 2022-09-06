import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {
    public static void main(String[] args)  {
        // Inisiasi Array
        ArrayList<String> listExample = new ArrayList<String>(Arrays.asList("Senin", "Selasa","Rabu"));

        // List add
        listExample.add("Jum'at");
        listExample.add("Sabtu");
        listExample.add("Minggu");
        
        System.out.println("Add \n" + listExample);
        
        // List Add by index
        listExample.add(3,"Kamis");
        
        System.out.println("Add by Index \n" + listExample);
        
        //List Remove
        listExample.remove(0);
        System.out.println("Remove by Index \n" + listExample);

        listExample.remove("Selasa");
        
        System.out.println("Remove by Value \n" + listExample);
        
        
        //List ascending sort
        Collections.sort(listExample);
        System.out.println("Ascending sort \n" +listExample);

        
        // List descending sort
        Collections.sort(listExample, Collections.reverseOrder());
        System.out.println("Descending sort \n" +listExample);

        // subList from ArrayList to Arraylist by index
        ArrayList <String> getList = new ArrayList<String>(listExample.subList(0, 4));
        System.out.println("Get List by index start to index end \n" + getList);




    }
}
