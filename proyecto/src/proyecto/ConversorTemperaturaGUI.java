
package proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ConversorTemperaturaGUI extends ConversorAluraBase{
    public ConversorTemperaturaGUI(){
        
        super("Ingrese Cantidad a Convertir:", new int[]{60, 30, 300, 20}, new int[]{70, 150, 110, 30},
                new int[]{220, 150, 110, 30});
    }
    String[] opciones = {"...", "Kelvin","Celsius", "Farentheint"};
    String[] opciones2 = {"...", "Kelvin","Celsius", "Farentheint"};

    public void initGUI() {
        input = new JTextField();
        input.setBounds(50, 60, 300, 25);
        input.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(input);
        input.addActionListener(this);
        
        comboBox = new JComboBox(opciones);
        comboBox.setBounds(50, 100, 120, 25);
        comboBox.setFont(new Font("Courier New", Font.CENTER_BASELINE, 15));
        add(comboBox);
        comboBox.addActionListener(this);
        
        comboBox1 = new JComboBox(opciones2);
        comboBox1.setBounds(230, 100, 120, 25);
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
        if (e.getSource() == botonAceptar) {
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
                    //dispose();
                }
            }
        } else if (e.getSource() == botonCancelar) {
            System.exit(0);
        }
    }
}
}

