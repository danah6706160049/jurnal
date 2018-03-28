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
        int a = 0;
        int b = 1;
        int hasil = 0;
        
        System.out.print("Input : ");
        int input = scn.nextInt();
        
        for (int i = 1; i <= input; i++) {
            a = b;
            b = hasil;
            System.out.print(hasil+" ");
            hasil = a + b;
        }
        
    }
    
}
