
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CalculoConversorTemperatura{
    private float kelvin;
    private float celsius;
    private float farent;
    private float resultado = 0;
    String[] opciones = {"...", "Kelvin", "Celsius", "Fahrenheit"};
    
    
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
            continuar continuar = new continuar();
            if(0 != resultado){
                continuar.initGUI();
                
            }
            
        }
        
    }
    
}
