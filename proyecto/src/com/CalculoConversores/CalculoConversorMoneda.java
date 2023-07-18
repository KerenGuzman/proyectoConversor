
package com.CalculoConversores;

import javax.swing.JOptionPane;

public class CalculoConversorMoneda {
    private float dolar = 4168f;
    private float euro = 4553.24f;
    private float libra = 5298.98f;
    private float yen = 28.92f;
    private float won =  3.17f;
    private float resultado;
    
    /**
     * El metodo CalculoConversorMoneda realizara los respectivos calculos para cada conversion
     * @param text  -> dato tipo String del combobox
     * @param num   -> dato numerico tipo float con el que se realizaran calculos
     */
    public void CalculoConversorMoneda(String text, float num){
        switch (text){
            case "COP a Dolar" -> {
                this.resultado = num / dolar;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Dolares");
            }
            case "COP a Euro" -> {
                this.resultado = num / euro;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Euros");
            }
            case "COP a Libra" -> {
                this.resultado = num / libra;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Libras");
            }
            case "COP a Yen" -> {
                this.resultado = num / yen;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Yen");
            }
            case "COP a Won" -> {
                this.resultado = num / won;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " COP son: " + mensaje + " Won");
            }
            case "Dolar a COP" -> {
                this.resultado = num * dolar;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Dolares son: " + mensaje + " COP");
            }
            case "Euro a COP" -> {
                this.resultado = num * euro;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Euros son: " + mensaje + " COP");
            }
            case "Libra a COP" -> {
                this.resultado = num * libra;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Libras son: " + mensaje + " COP");
            }
            case "Yen a COP" -> {
                this.resultado = num * yen;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Yen son: " + mensaje + " COP");
            }
            case "Won a COP" -> {
                this.resultado = num * won;
                String mensaje = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, num + " Won son: " + mensaje + " COP");
            }
            default -> {
            }
        }
       
    }
}

    
