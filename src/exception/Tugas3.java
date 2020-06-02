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
public class Tugas3 {
    public static void main (String[] args){
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try{
            System.in.read(b);
                    }
        catch(java.io.IOException e){};
        int N = Integer.valueOf(b[1]).intValue();
        String string = new String(b);
        System.out.println("Hasil : "+ (N+2));
        System.out.println("String : "+string);
}
}
    