/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Tugas1 {
        public static void main (String [] args) {
        int n = 0;
        try {
            System.out.print("Input: ");
            n = System.in.read();
        } catch (IOException ex) {}
       System.out.println("Hasil : "+(char) n);
    }
}