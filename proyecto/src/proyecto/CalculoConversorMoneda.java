
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CalculoConversorMoneda {
    private float dolar = 4168f;
    private float euro = 4553.24f;
    private float libra = 5298.98f;
    private float yen = 28.92f;
    private float won =  3.17f;
    private float resultado;
    public void CalculoConversorMoneda(String text, float num){
        switch (text){
            case "COP a Dolar":
                this.resultado = num / dolar;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Dolares");
                break; 
            case "COP a Euro":
                this.resultado = num / euro;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Euros");
                break;
            case "COP a Libra":
                this.resultado = num / libra;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Libras");
                break; 
            case "COP a Yen":
                this.resultado = num / yen;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Yen");
                break; 
            case "COP a Won":
                this.resultado = num / won;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Won");
                break; 
            case "Dolar a COP":
                this.resultado = num * dolar;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Dolares son: " + mensaje + " COP");
                break; 
            case "Euro a COP":
                this.resultado = num * euro;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Euros son: " + mensaje + " COP");
                break; 
            case "Libra a COP":
                this.resultado = num * libra;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Libras son: " + mensaje + " COP");
                break; 
            case "Yen a COP":
                this.resultado = num * yen;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Yen son: " + mensaje + " COP");
                break; 
            case "Won a COP":
                this.resultado = num * won;
                mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Won son: " + mensaje + " COP");
                break; 
            default:
                break;
        }
       
    }
}

    
