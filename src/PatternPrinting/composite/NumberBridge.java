package PatternPrinting.composite;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();


        for(int i = 1; i<=2*n-1;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        n--;

        for (int i = 1; i <= n ; i++) {//rows
            int a = 1;
            for (int j = 1; j <= n+1-i; j++) {//number
                System.out.print(a + " ");
                a++;
            }
            for (int j = 1; j <= 2*i-1; j++) { //spaces
                System.out.print(" " + " ");
                a++; //very important
            }
            for (int j = 5; j<=n+5-i; j++) { //numbers
                System.out.print(a + " ");
                a++;
            }
            System.out.println();

        }
    }
}
