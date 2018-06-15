/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Aritmetica.FactoryAritmetica;
import Conversor.FactoryConversor;

/**
 *
 * @author Marvin Ramirez
 */
public class operacionProducer {
    public static AbstractFactory getOperacion(String type){
        switch (type){
            case "Arit":
                return  new FactoryAritmetica();
            case "Conver":
                return new FactoryConversor();
        }
        return null;
    }
}
