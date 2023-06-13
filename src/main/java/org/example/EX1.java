package org.example;

import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class EX1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(TriagularNumbers(n));
    }

    public static int TriagularNumbers(int n){
        double t = 0.5*n*(n+1);
        int t1 = (int)t;
        return t1;

    }
}
