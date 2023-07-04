package proyectoconversor;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Keren Guzman - Proyecto Conversor Alura
 */

public class Conversor extends VentanaBase{
    
    String texto;
    segundaVista segunda = new segundaVista();
    TestTemperatura temp = new TestTemperatura();
    
    public Conversor() {
        super("Escoja una opcion:", new int[]{110, 50, 300, 20}, new int[]{70,150, 110, 30}, new int[]{220,150, 110, 30});
        
        combobox = new JComboBox(opciones);
        componente.setComponent(combobox,50,90, 300, 25);
        combobox.setFont(nuevaTipografia);
        add(combobox);
        combobox.setFont(nuevaTipografia);
        combobox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar){   //indica que el evento esta en e y se usa getSource que recupera el evento que se guardo en e
            //super.actionPerformed(e);
            texto = combobox.getSelectedItem().toString();
            if(texto.equals(opciones[0])){
                segunda.segundaVista();
                //menu.ConversorMonedaMenu();
                dispose();
            }else if(texto.equals(opciones[1])){
                temp.TestTemperatura();
                dispose();
            }  
        }else if(e.getSource() == cancelar){
            System.exit(0); //Para cerrar la interfaz grafica
        }
    }
}
