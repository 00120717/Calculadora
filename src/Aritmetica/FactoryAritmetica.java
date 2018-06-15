/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Conversor.Conversor;
import Calculadora.AbstractFactory;

/**
 *
 * @author Marvin Ramirez
 */
public class FactoryAritmetica implements AbstractFactory{
        
    @Override
    public Aritmetica getAritmetica(String type){
        switch(type){
            case"suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multi":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }

    @Override
    public Conversor getConversor(String type) {
        return null;
    }
    
}
