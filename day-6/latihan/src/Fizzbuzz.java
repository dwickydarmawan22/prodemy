
public class Fizzbuzz {
    public static void main(String[] args) {
        int n = 100;


        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if ((i % 3 == 0 && i % 5 == 0 ) || (s.contains("3") && s.contains("5"))) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 || s.contains("3")) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 || s.contains("5")) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
