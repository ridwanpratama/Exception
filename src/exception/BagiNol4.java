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
public class BagiNol4 {
    public static void main(String [] args) {
        double BILANGAN = 100.0;
        
        System.out.println("Sebelum pembagian");
        
        for (int i = 5; i>= 0; i--) {
            try {
                System.out.print(BILANGAN + "/" + i + " = ");
                System.out.println((BILANGAN / i);
            }
            finally {
                System.out.print("Bagian finally dijalankan");
            }
        }
        System.out.println("Selesai");
    }
}
