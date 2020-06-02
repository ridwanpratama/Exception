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
public class Ex2 {
    public static void main(String[] args){
        int a=5; int b=0; int c=0;
        try{
            c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Hasil: " + a + " " + b + " " + c);
        }
    }
}
