package com.CalculoConversores;

import com.ConversoresGUI.*;
import javax.swing.JOptionPane;

public class CalculoConversorTemperatura{
    private float kelvin;
    private float celsius;
    private float farent;
    private float resultado = 0;
    String[] opciones = {"...", "Kelvin", "Celsius", "Fahrenheit"};
    
    /**
     * EL metodo CalculoConversorTemperatura realizara las correspondientes verificaciones para los calculos de conversion
     * 
     * @param texto     -> dato del combobox 1
     * @param texto2    -> dato del combobox 2
     * @param k         -> dato numerico a calcular
     */
    public void CalculoConversorTemperatura(String texto, String texto2, float k){
        String seleccion = texto + " " + texto2;
        if(texto.equals(texto2)){
            JOptionPane.showMessageDialog(null, "Seleccione una que no sea igual");
        }else if (seleccion.equals("... Kelvin") || seleccion.equals("... Celsius") || seleccion.equals("... Fahrenheit")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción");
        } else if (seleccion.equals("Kelvin ...") || seleccion.equals("Celsius ...") || seleccion.equals("Fahrenheit ...")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción");
        }else{
            switch(seleccion){
                case "Kelvin Celsius" -> resultado = k - 273.15F;
                case "Kelvin Fahrenheit" -> resultado =  (((k - 273.15F) * 9)/5) + 32;
                case "Celsius Fahrenheit" -> resultado =  (k * 9/5) + 32;
                case "Celsius Kelvin" -> resultado =  k + 273.15F;
                case "Fahrenheit Kelvin" -> resultado =  (((k - 32) * 5)/9) + 273.15F;
                case "Fahrenheit Celsius" -> resultado =   (k - 32) * 5/9;
                default -> { JOptionPane.showMessageDialog(null, "Invalido");
                }
            }
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            /**
             * Creamos una instancia para el objeto de la clase continuar y asi verificar si se desea seguir con el programa o si desea finalizar
             */
            continuar continuar = new continuar();
            if(0 != resultado){
                continuar.initGUI();
                
            }
            
        }
        
    }
    
}
