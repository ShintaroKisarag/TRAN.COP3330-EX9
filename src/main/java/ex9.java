/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sqftperGallon = 350;
        System.out.print("Enter length: ");
        double length = input.nextDouble(); //stores length
        System.out.print("Enter width: ");
        double width = input.nextDouble();  //stores width
        double totalsquareft = length * width;  //calculate total sqft
        int gallon=(int)Math.ceil(totalsquareft/sqftperGallon); //calculate number of gallon
        System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalsquareft+" square feet");
    }
}
