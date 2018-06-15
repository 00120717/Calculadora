/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author Marvin Ramirez
 */
public class Binario implements Conversor{

    @Override
    public String Convertir(int n) {
        
        
        String b = ""; 
        while (n != 0) {
            int r = (int)(n % 2); 
            b = r + b;
            n /= 2; 
        }
        return b;
    }
    
    
}

