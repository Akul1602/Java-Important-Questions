package PatternPrinting.squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and cols : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){//rows
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
