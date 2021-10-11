package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float x1, x2, y1, y2;

        System.out.print("A: \n");

        System.out.print("  x: ");
        x1 = scan.nextFloat();
        scan.nextLine();

        System.out.print("  y: ");
        y1 = scan.nextFloat();
        scan.nextLine();

        System.out.print("B: \n");

        System.out.print("  x: ");
        x2 = scan.nextFloat();
        scan.nextLine();

        System.out.print("  y: ");
        y2 = scan.nextFloat();
        scan.nextLine();

        printC(x1, x2, y1, y2);
        printABC(x1, x2, y1, y2);
    }

    private static void printC(float x1, float x2, float y1, float y2) {

        //        String C = String.format(
//                "(x %f) / (%f - %f) = (y %f) / (%f - %f)",
//                x1, x2, x1, y1, y2, y1
//        );

        String C = "(x ";

        C = getString(x1, x2, C);

        C += " = (y ";

        C = getString(y1, y2, C);

        System.out.println(C);
    }

    private static void printABC(float x1, float x2, float y1, float y2) {
        float A = y2 - y1;
        float B = (x2 - x1) * -1;
        float C = A*x1*(-1) + B*y1*(-1);

        System.out.println(A + " " + B + " " + C + " = 0");
    }

    private static void printKX(float x1, float x2, float y1, float y2) {

    }

    private static String getString(float y1, float y2, String c) {
        if (y1 >= 0) {
            c += "- " + y1;
        } else {
            c += "+ " + y1 * -1;
        }

        c += ") / ";

//        if (y1 < 0) {
//            c += y2 + " + " + y1*-1;
//        } else {
//            c += y2 + " - " + y1;
//        }

        c += y2 - y1;

        return c;
    }
}
