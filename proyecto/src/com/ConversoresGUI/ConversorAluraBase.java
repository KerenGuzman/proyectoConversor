
package com.ConversoresGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * La clase ConversorAluraBase sera el "molde" para la creacion de botones y label de la interfaz
 * @author KEREN 
 */
class ConversorAluraBase extends JFrame implements ActionListener {

    protected JLabel labelDescrip;
    protected JButton botonAceptar;
    protected JButton botonCancelar;
    protected JTextField input;
    protected JComboBox comboBox;
    protected JComboBox comboBox1;

    public ConversorAluraBase(String labelText, int[] labelBounds, int[] aceptarBounds, int[] cancelarBounds) {
        setLayout(null);
        setTitle("Conversor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelDescrip = new JLabel(labelText);
        labelDescrip.setBounds(labelBounds[0], labelBounds[1], labelBounds[2], labelBounds[3]);
        labelDescrip.setForeground(Color.WHITE);

        Font nuevaTipografia = new Font("Courier New", Font.CENTER_BASELINE, 15);
        labelDescrip.setFont(nuevaTipografia);
        add(labelDescrip);

        // Botones
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(aceptarBounds[0], aceptarBounds[1], aceptarBounds[2], aceptarBounds[3]);
        botonAceptar.setBackground(Color.WHITE);
        botonAceptar.setForeground(Color.BLACK);
        botonAceptar.setFont(nuevaTipografia);
        add(botonAceptar);
        botonAceptar.addActionListener(this);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(cancelarBounds[0], cancelarBounds[1], cancelarBounds[2], cancelarBounds[3]);
        botonCancelar.setBackground(Color.WHITE);
        botonCancelar.setForeground(Color.BLACK);
        botonCancelar.setFont(nuevaTipografia);
        add(botonCancelar);
        botonCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAceptar) {
            JOptionPane.showMessageDialog(rootPane, "Hola");
        } else if (e.getSource() == botonCancelar) {
            System.exit(0);
        }
    }
}