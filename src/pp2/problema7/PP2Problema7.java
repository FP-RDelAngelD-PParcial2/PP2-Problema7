/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema7;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        muestraResultado(convertirCantidad());
    }
    public static double solicitarDatos(String d){ //Solicita datos
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static double convertirCantidad(){ 
        double m = solicitarDatos("kilometros por hora ");//Se solicitan los kilometros por hora
        return (m*1000)/3600; //Los metros por 1000 entre 3600
    }
    public static void muestraResultado(double d){
        System.out.print("El resultado en metros sobre segundos es " + d); //Muestra resultado
    }
}
