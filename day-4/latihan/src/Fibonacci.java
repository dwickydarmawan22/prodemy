public class Fibonacci {
    static void bilFibo(int[] fibo){
        fibo[0]=1;
        fibo[1]=1;
        for(int i=2; i < fibo.length; i++){
            fibo[i]=fibo[i - 1]+ fibo[i-2];
        }

    }
    public static void main(String[] args) {
        int n=9;
        int[] angkaFibo = new int[n];
        bilFibo(angkaFibo);
        
        for(int i = 0; i < n; i++) {
            for (int j = 0;j < n;j++){
                if (i == j || j == n - i - 1){
                    
                    System.out.print(angkaFibo[j] + " ");
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
