package homework;

import java.util.Scanner;

/*
Homework
1. Celsius to Kelvin
2. Celsius to Fahrenheit
3. Kelvin to Celsius
4. Kelvin to Fahrenheit
* */

public class TemperatureConversion {

    public static void main(String[] args) {

        //take input from keyboard
        Scanner input = new Scanner(System.in);

        //initialization
        double celsius = 0;
        double kelvin = 0;
        double fahrenheit = 0;

        //1. Celsius to Kelvin
        System.out.println("Celsius to Kelvin : ");
        System.out.print("Enter Celsius : ");
        celsius = input.nextDouble();
        kelvin = celsius + 273.15;
        System.out.println(celsius + "C");
        System.out.println(kelvin + "K");

        System.out.println();
        // Kelvin to Fahrenheit
        System.out.println("Kelvin to Fahrenheit : ");
        System.out.print("Enter Kelvin : ");
        kelvin = input.nextDouble();
        fahrenheit = kelvin * 9/5 - 459.67;
        System.out.println(kelvin + "K");
        System.out.println(fahrenheit + "F");


    }
}


