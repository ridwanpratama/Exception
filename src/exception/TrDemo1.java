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
public class TrDemo1 {
    static void demo () {
        try {
            throw new NullPointerException("nyoba");
        } catch (NullPointerException e) {
            throw e;
        }
    }
    
    public static void main(String [] args) {
        try {
            demo();
        } catch (NullPointerException e) {
            System.out.println("Re-caught: " + e );
        }
    }
}
