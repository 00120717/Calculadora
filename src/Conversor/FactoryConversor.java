/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import Aritmetica.Aritmetica;
import Calculadora.AbstractFactory;

/**
 *
 * @author Marvin Ramirez
 */
public class FactoryConversor implements AbstractFactory{
     @Override
    public Aritmetica getAritmetica(String type) {
       return null;
    }

    @Override
    public Conversor getConversor(String type) {
        switch (type){
            case "binario":
                return new Binario();
        }
        return null;
}
}
