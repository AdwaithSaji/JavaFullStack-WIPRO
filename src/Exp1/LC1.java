//ADWAITH URK23CS1074
package Exp1;

import java.util.Scanner;

public class LC1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b, t;

        System.out.print("Enter value of A: ");
        a = s.nextInt();

        System.out.print("Enter value of B: ");
        b = s.nextInt();

        t = a;
        a = b;
        b = t;

        System.out.println("After Swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        s.close();
    }
}