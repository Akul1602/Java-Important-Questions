package loops;

import java.util.Scanner;

public class BasicsOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            System.out.println("Hello World");
        }
    }
}
