package branching;

import java.util.Scanner;

public class BranchStatement {
    public static void main(String[] args) {
        BranchMethod bm = new BranchMethod();
        bm.printMethod();
    }
    
}

class BranchMethod {
    public void printMethod(){
        System.out.print("Masukkan angka : ");
        Scanner sc = new Scanner(System.in);
        int inputAngka = sc.nextInt();
        if (inputAngka > 10){
            System.out.printf("Angka kamu adalah %d\n dan lebih dari 10", inputAngka);
        } else {
            System.out.printf("Angka kamu adalah %d\n dan kurang dari 10", inputAngka);
        }
    }
}

