
package proyectoconversor;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class temperatura extends VentanaBase{
    String[] opciones = {"Seleccione...", "Kelvin", "Celsius", "Fahrenheit"};
    JTextField areaTexto;
    JComboBox combobox1;
    JLabel resultadoLabel;
    
    
    
    public temperatura(){
        super("Ingrese dato a convertir: ", new int[]{120, 50, 300, 20}, new int[]{110,200, 110, 30}, new int[]{260,200, 110, 30});
        
        combobox = new JComboBox(opciones);
        componente.setComponent(combobox,80,140, 150, 25);
        combobox.setFont(nuevaTipografia);
        add(combobox);
        combobox.addActionListener(this);
        
        combobox1 = new JComboBox(opciones);
        componente.setComponent(combobox1,250,140, 150, 25);
        combobox1.setFont(nuevaTipografia);
        add(combobox1);
        combobox1.addActionListener(this);
        
        areaTexto = new JTextField();
        componente.setComponent(areaTexto, 45, 90, 400, 25);
        add(areaTexto);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CalculoTemperatura calculo = new CalculoTemperatura();
         if(e.getSource() == aceptar){
            String texto1 = areaTexto.getText().trim();
            if (texto1.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese Dato");
                areaTexto.requestFocus();
            }else if(!texto1.isEmpty()){
                if(!ValidarNumero.validarNumeros(areaTexto.getText().trim())){
                    JOptionPane.showMessageDialog(rootPane, "Solo Numeros");
                    areaTexto.setText("");
                    areaTexto.requestFocus();
                }else if(ValidarNumero.validarNumeros(areaTexto.getText().trim())){
                    texto = combobox.getSelectedItem().toString();
                    String texto2 = combobox1.getSelectedItem().toString();
                    float dato = Float.parseFloat(areaTexto.getText());
                    calculo.CalculoTemperatura(texto, texto2, dato);
                    //dispose();
                }
            }
        }else if(e.getSource() == cancelar){
            System.exit(0); //Para cerrar la interfaz grafica
        }
    }
}

