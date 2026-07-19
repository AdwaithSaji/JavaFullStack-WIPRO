//ADWAITH URK23CS1074
package Exp1;

import java.util.Scanner;

public class LC2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = s.nextInt();

        while (n > 0) {
            int d = n % 10;
            System.out.println(d);
            n = n / 10;
        }

        s.close();
    }
}