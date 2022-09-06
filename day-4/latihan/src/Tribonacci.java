import java.util.Scanner;

public class Tribonacci {
    

    static void bilTribo(int[] tribo){
        int n = 9;
        tribo[0]=1;
        tribo[1]=1;
        tribo[2]=1;

        for(int i=3; i < tribo.length; i++){
            tribo[i]=tribo[i - 1]+ tribo[i-2]+ tribo[i-3];
        }

        for(int i=n/2+1;i<n;i++){
            tribo[i] = tribo[n-i-1];
            System.out.print(tribo[i]);
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka N : ");
        int n = sc.nextInt();
        
        int[] angkaTribo = new int[n];
        bilTribo(angkaTribo);
        
        for(int i = 0; i < n; i++) {
            for (int j = 0;j < n;j++){
                if (j==(n-1)/2){
                    System.out.print(StringUtil.pad(angkaTribo[i]+" ", 4));
                } else if (i==(n-1)/2){
                    System.out.print(StringUtil.pad(angkaTribo[j]+" ", 4));
                }
                else {
                    System.out.print(StringUtil.pad(" ", 4));
                }
            }
            System.out.println();
        }
    }
}
