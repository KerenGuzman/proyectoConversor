package com.ConversoresGUI;

import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 * La clase continuar es una pequenha ventana donde nos pregunta si deseamos continuar usando el programa o si deseamos finalizar
 * @author KEREN
 */
public class continuar extends ConversorAluraBase{
    ConversorMonedasGUI conversorMoneda = new ConversorMonedasGUI();
    public continuar(){
        super("Deseas Continuar:", new int[]{50, 5, 200, 100}, new int[]{50,70, 110, 30}, new int[]{210,70, 110, 30});
    } 

    public static boolean validarNumeros(String datos){
        return datos.matches("[0-9-.]*");   
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
        if(e.getSource() == botonAceptar){   
            dispose();
            conversorMoneda.initGUI();
        }else if(e.getSource() == botonCancelar){
            System.exit(0); 
        }
    }
}

