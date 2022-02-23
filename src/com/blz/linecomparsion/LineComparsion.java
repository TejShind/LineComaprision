package com.blz.linecomparsion;
import java.util.Scanner;

public class LineComparsion {
    public double length(int a, int b, int c, int d) {
        double length0fline = Math.sqrt(Math.pow((c - a), 2) * Math.pow((d - b), 2));
        return length0fline;
    }
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

        System.out.println("Enter the second line coordinates");
        System.out.println("enter p1");
        int p1 = input.nextInt();
        System.out.println("enter q1");
        int q1 = input.nextInt();
        System.out.println("enter p2");
        int p2 = input.nextInt();
        System.out.println("enter q2");
        int q2 = input.nextInt();

        LineComparsion e = new LineComparsion();
    Double len1 = e.length(x1, y1, x2, y2);
      System.out.println("First Line length is : "+len1+"");

        LineComparsion f = new LineComparsion();
    Double len2 = f.length(p1, q1, p2, q2);
		System.out.println("Second Line length is : "+len2+"");
        System.out.println(len1.equals(len2));

}

}