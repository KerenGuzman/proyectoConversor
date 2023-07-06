
package proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ConversorMonedaGUIVista2 extends ConversorAluraBase{
    
    public ConversorMonedaGUIVista2(){
        super("Ingrese Cantidad a Convertir:", new int[]{60, 30, 300, 20}, new int[]{70, 150, 110, 30},
                new int[]{220, 150, 110, 30});
    }
    String[] opciones = {"COP a Dolar", "COP a Euro","COP a Libra", "COP a Yen", "COP a Won", "Dolar a COP", "Euro a COP", "Libra a COP", "Yen a COP", "Won a COP"};
    public void initGUI() {
        input = new JTextField();
        input.setBounds(50, 60, 300, 25);
        input.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(input);
        input.addActionListener(this);
        
        comboBox = new JComboBox(opciones);
        comboBox.setBounds(50, 100, 300, 25);
        comboBox.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(comboBox);
        comboBox.addActionListener(this);

        setBounds(100, 100, 420, 300);
        getContentPane().setBackground(Color.decode("#252850"));

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CalculoConversorMoneda calculo = new CalculoConversorMoneda();
        continuar continuar = new continuar();
        if (e.getSource() == botonAceptar) {
             String texto = input.getText().trim();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese Dato");
                input.requestFocus();
            }else if(!texto.isEmpty()){
                if(!continuar.validarNumeros(input.getText().trim())){
                    JOptionPane.showMessageDialog(rootPane, "Solo Numeros");
                    input.setText("");
                    input.requestFocus();
                }else if(continuar.validarNumeros(input.getText().trim())){
                    texto = comboBox.getSelectedItem().toString();
                    float dato = Float.parseFloat(input.getText());
                    calculo.CalculoConversorMoneda(texto, dato);
                    continuar.initGUI();
                    dispose();
                }
            }
        } else if (e.getSource() == botonCancelar) {
            System.exit(0);
        }
    }
}


