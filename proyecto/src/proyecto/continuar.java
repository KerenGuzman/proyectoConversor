/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

/**
 *
 * @author User
 */
class continuar extends ConversorAluraBase{
    ConversorMonedasGUI conversorMoneda = new ConversorMonedasGUI();
    public continuar(){
        super("Deseas Continuar:", new int[]{50, 5, 200, 100}, new int[]{50,70, 110, 30}, new int[]{210,70, 110, 30});
    } 
    
     //validacion de numeros
    public static boolean validarNumeros(String datos){
        //parametro String es el dato que se valida 
        return datos.matches("[0-9-.]*");   //* para que nos tome cualquier cantidad de numeros
        //matches valida que haya concordancia y nos retorna un booleano
    }
    
    public void initGUI() {
        setBounds(100, 100, 400, 200);
        getContentPane().setBackground(Color.decode("#252850"));

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonAceptar){   //indica que el evento esta en e y se usa getSource que recupera el evento que se guardo en e
            dispose();
            conversorMoneda.initGUI();
        }else if(e.getSource() == botonCancelar){
            System.exit(0); //Para cerrar la interfaz grafica
        }
    }
}

