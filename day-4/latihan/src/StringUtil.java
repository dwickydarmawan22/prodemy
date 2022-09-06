public class StringUtil {
    
        public static String pad(String bil, int panjang){
            String result = "";
            for (int i =0; i<panjang;i++) result += " ";
            result += bil;
            result = result.substring(result.length()-panjang);
            return result;
        }
        
        public static String pad(int bil, int panjang){
            String result = "";
            for (int i =0; i<panjang;i++) result += " ";
            result += bil;
            result = result.substring(result.length()-panjang);
            return result;
        }
}
