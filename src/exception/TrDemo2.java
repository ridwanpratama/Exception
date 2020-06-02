/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Asus
 */
public class TrDemo2 {
    static void methodKU () throws IllegalAccessException {
        System.out.println("ini isi methodKU");
        throw new IllegalAccessException("nyoba");
    }
    
    public static void main (String [] args) {
        try {
            methodKU();
        } catch (IllegalAccessException e) {
            System.out.println("TERTANGKAP: " + e);
        }
    }
}
