public class TestNo2 {
    public static void main(String[] args) {
        int b = 10;
        int w = 10;
        int bc = 1;
        int wc = 1;
        int z = 1;
        int result = 0;

        if (bc == wc){
            result = b * bc + w * wc;
        } else if (z > bc && z > wc){
            result = b * bc + w * wc;
        } else if ( bc > wc + z){
            result = (b * (wc + z)) + w * wc;
        } else if ( wc > bc + z){
            result = (b * bc) + (wc * (bc + z));
        }


        System.out.println(result);
    }
}
