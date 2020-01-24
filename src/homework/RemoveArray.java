package homework;

import java.util.Scanner;

public class RemoveArray {
   /*
    2.
    Write a Java program to remove a specific element from an array.
    Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
    New Array: [32, 14, 98, 56, 148, 78]

    */

    public static void main(String[] args) {

        int w, d;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of element in the Array: ");
        w = input.nextInt();
        int a [] = new int[w];

        System.out.print("Enter all the element : ");

        for (int i = 0; i < w; i++) {
            a[i] = input.nextInt();

        }

        System.out.print("Enter the element want to remove : ");
        d = input.nextInt();

        for (int i = 0; i < w; i++){

        }

        System.out.println("After removing : ");

        for (int i = 0; i < w - 24; i++){


        }

        System.out.println(a[w-24]);



    }

}
