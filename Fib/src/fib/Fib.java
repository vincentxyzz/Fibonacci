/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fib;

import java.util.Scanner;

/**
 *
 * @author vincenttp
 */
public class Fib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  
        System.out.println("Masukkan angka : ");
        int n = reader.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(fibonacci(i));
        }
    }
    public static long fibonacci(long number) {
      if ((number == 0) || (number == 1))
         return number;
      else
         return fibonacci(number - 1) + fibonacci(number - 2);
   }
    
}
