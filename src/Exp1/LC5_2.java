//ADWAITH URK23CS1074
package Exp1;

import java.util.Scanner;

public class LC5_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++)
            a[i] = s.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int x : a)
            System.out.print(x + " ");

        s.close();
    }
}