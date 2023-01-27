package org.example;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type x (|x| <= 1): ");
        double x = in.nextDouble();
        System.out.println("Type n: ");
        double n = in.nextInt();
        double sum = n/2;
        for(int i = 0; i <= n; i++){
            sum += (pow(-1, n+1)*pow(x, 2*n+1))/(2*n+1);
        }
        System.out.printf("Result: %f\n", sum);

    }
}