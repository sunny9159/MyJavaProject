package homework;

import java.util.Scanner;

/*
3.
Scenario: Traffic ticketing system
   1. Speed Limit = 70
   2. Every 5 miles over the speed limit will add 1 point
   3. Use Math.floor(1.4)to round the speed to downward value
   4. If user reaches 12 points then license is suspended
	Example:
	userspeed=78(70-75->1point)
userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)
 */

public class TrafficTicketing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter speed limit : ");
        num = input.nextInt();

        if (num > 70) {
            System.out.println("1 Point");

        }

        else if (num < 70){
            System.out.println("Zero");
        }

        else {
            System.out.println("");
        }
    }
}
