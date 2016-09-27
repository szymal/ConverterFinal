package com.odzera.zadania;

import java.util.Scanner;

/**
 * Created by Kamil on 27.09.2016.
 */
public class Count {
    double temp;
    int choise;
    void Count(){
    System.out.println("Enter temperature to be converted in degrees Fahrenheit (°F) or Celsius (°C aka centigrade)");
    System.out.println("Convert Celsius to Fahrenheit please write 1");
    System.out.println("Convert Fahrenheit to Celsius please write 2");
    Scanner input = new Scanner(System.in);
    choise = input.nextInt();
    if(choise==1){
        System.out.print("Enter temperature to be converted: ");
        temp = input.nextDouble();
        double score = ((temp+40)*1.8)-40;
        System.out.println(temp+" °C Celsius is " +score + " °F Farenheit");
    }
    else if (choise==2){
        System.out.print("Enter temperature to be converted: ");
        temp = input.nextDouble();
        double score = ((temp+40)/1.8)-40;
        System.out.println(temp+" F Farenheit is " +score + " °C Celsius");
    }
    else {
        System.out.println("Error!");
    }
    }
}

