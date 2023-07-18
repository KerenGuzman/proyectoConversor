
package com.ConversoresGUI;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

/**
 * La clase ConversorMonedaGUI es la primera vista cuya funcion es informarnos las opciones que tenemos
 * en este caso si deseamos realizar conversion de divisas o de temperatura
 * @author mikem
 */
public class ConversorMonedasGUI extends ConversorAluraBase {
    protected String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};


    public ConversorMonedasGUI() {
        super("Escoja una opción:", new int[]{100, 50, 300, 20}, new int[]{60, 150, 110, 30},
                new int[]{210, 150, 110, 30});
    }

    public void initGUI() {
        comboBox = new JComboBox(opciones);
        comboBox.setBounds(40, 90, 300, 25);
        comboBox.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(comboBox);
        comboBox.addActionListener(this);

        setBounds(100, 100, 400, 300);
        getContentPane().setBackground(Color.decode("#252850"));

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonAceptar){   
            String texto = comboBox.getSelectedItem().toString();
            ConversorMonedaGUIVista2 conversor = new ConversorMonedaGUIVista2();
            ConversorTemperaturaGUI conversorTemperatura = new ConversorTemperaturaGUI();
            if(texto.equals(opciones[0])){
                conversor.initGUI();
                dispose();
            }else if(texto.equals(opciones[1])){
                conversorTemperatura.initGUI();
                dispose();
            }  
        }else if(e.getSource() == botonCancelar){
            System.exit(0); 
        }
    }
}