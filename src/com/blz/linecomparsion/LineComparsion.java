package com.blz.linecomparsion;
import java.util.Scanner;

public class LineComparsion {

    public static void main(String[] args) {
        System.out.println("Enter the first line coordinates");
        Scanner input = new Scanner(System.in);
        System.out.println("enter x1");
        int x1 = input.nextInt();
        System.out.println("enter y1");
        int y1 = input.nextInt();
        System.out.println("enter x2");
        int x2 = input.nextInt();
        System.out.println("enter y2");
        int y2 = input.nextInt();
    }

    public double length(int a, int b, int c, int d) {
        double length0fline = Math.sqrt(Math.pow((c - a), 2) * Math.pow((d - b), 2));
        return length0fline;
    }

}


