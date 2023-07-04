
package proyectoconversor;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CalculoTemperatura extends temperatura{
    private float kelvin;
    private float celsius;
    private float farent;
    private float resultado = 0;
    String[] opciones = {"Seleccione...", "Kelvin", "Celsius", "Fahrenheit"};
    
    
    public void CalculoTemperatura(String texto, String texto2, float k){
        String seleccion = texto + " " + texto2;
        if(texto.equals(texto2)){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una que no sea igual");
        }else if (seleccion.equals("Seleccione... Kelvin") || seleccion.equals("Seleccione... Celsius") || seleccion.equals("Seleccione... Fahrenheit")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción");
        } else if (seleccion.equals("Kelvin Seleccione...") || seleccion.equals("Celsius Seleccione...") || seleccion.equals("Fahrenheit Seleccione...")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción");
        }else{
            switch(seleccion){
                case "Kelvin Celsius":
                    resultado = k - 273.15F;
                    break;
                case "Kelvin Fahrenheit":
                    resultado =  (((k - 273.15F) * 9)/5) + 32;
                    break;
                case "Celsius Fahrenheit":
                    resultado =  (k * 9/5) + 32;
                    break;
                case "Celsius Kelvin":
                    resultado =  k + 273.15F;
                    break;
                case "Fahrenheit Kelvin":
                    resultado =  (((k - 32) * 5)/9) + 273.15F;
                    break;
                case "Fahrenheit Celsius":
                    resultado =   (k - 32) * 5/9;
                    break;  
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            temperatura TestTemperatura = new temperatura();
            if(0 != resultado){
                continuar.TestContinuar();
                
            }
            
        }
        
    }
    
}
