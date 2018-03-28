/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input;
        int b = 1;
        
        
        System.out.print("Input : ");
        input = scn.nextInt();
        b     = input - b;
        input = input + b;
        System.out.print(input+" ");
 
    }
    
}
