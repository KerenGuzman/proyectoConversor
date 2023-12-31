package com.ConversoresGUI;

import com.CalculoConversores.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * La clase ConversorTemperaturaGUI hace referencia a la interfaz de conversion de temperatura, en ella se ingresa el dato a convertir
 * y posteriormente se escoge las temperaturas a convertir
 * @author KEREN
 */
public class ConversorTemperaturaGUI extends ConversorAluraBase{
    public ConversorTemperaturaGUI(){
        
        super("Ingrese Cantidad a Convertir:", new int[]{70, 30, 300, 20}, new int[]{80, 150, 110, 30},
                new int[]{230, 150, 110, 30});
    }
    String[] opciones = {"...", "Kelvin","Celsius", "Fahrenheit"};
    String[] opciones2 = {"...", "Kelvin","Celsius", "Fahrenheit"};

    public void initGUI() {
        input = new JTextField();
        input.setBounds(60, 60, 300, 25);
        input.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(input);
        input.addActionListener(this);
        
        comboBox = new JComboBox(opciones);
        comboBox.setBounds(60, 100, 130, 25);
        comboBox.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(comboBox);
        comboBox.addActionListener(this);
        
        comboBox1 = new JComboBox(opciones2);
        comboBox1.setBounds(240, 100, 130, 25);
        comboBox1.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(comboBox1);
        comboBox1.addActionListener(this);

        setBounds(100, 100, 450, 300);
        getContentPane().setBackground(Color.decode("#252850"));

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CalculoConversorTemperatura calculo = new CalculoConversorTemperatura();
        if(e.getSource() == botonAceptar){
           String texto1 = input.getText().trim();
           if (texto1.isEmpty()) {
               JOptionPane.showMessageDialog(rootPane, "Ingrese Dato");
               input.requestFocus();
           }else if(!texto1.isEmpty()){
               if(!continuar.validarNumeros(input.getText().trim())){
                   JOptionPane.showMessageDialog(rootPane, "Solo Numeros");
                   input.setText("");
                   input.requestFocus();
               }else if(continuar.validarNumeros(input.getText().trim())){
                   String texto = comboBox.getSelectedItem().toString();
                   String texto2 = comboBox1.getSelectedItem().toString();
                   float dato = Float.parseFloat(input.getText());
                   calculo.CalculoConversorTemperatura(texto, texto2, dato);
               }
           }
           
        }else if (e.getSource() == botonCancelar) {
                System.exit(0);
        }
    }
}

