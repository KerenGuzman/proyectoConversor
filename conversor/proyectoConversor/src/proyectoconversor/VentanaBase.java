package proyectoconversor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class VentanaBase extends JFrame implements ActionListener{
    protected JComboBox combobox;
    protected JComboBox combobox1;
    protected JLabel labelDescrip;
    protected JButton aceptar;
    protected JButton cancelar;
    
    Font nuevaTipografia = new Font("Courier New", Font.CENTER_BASELINE, 15);
    menu1 componente = new menu1();
    protected String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura"};
    protected String texto, texto1;
    
    protected conversorMoneda calculo = new conversorMoneda(); 
    protected TestContinuar continuar = new TestContinuar();
    
    public VentanaBase(String labelText, int[] labelBounds, int[] aceptarBounds, int[] cancelarBounds){
        setLayout(null);
        setTitle("Conversor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelDescrip = new JLabel(labelText);
        componente.setComponent(labelDescrip, labelBounds[0], labelBounds[1], labelBounds[2], labelBounds[3]);
        labelDescrip.setForeground(Color.WHITE);

        Font nuevaTipografia = new Font("Courier New", Font.CENTER_BASELINE, 15);
        labelDescrip.setFont(nuevaTipografia);
        add(labelDescrip);

        
        //Button
        aceptar = new JButton("Aceptar");
        componente.setComponent(aceptar, aceptarBounds[0], aceptarBounds[1], aceptarBounds[2], aceptarBounds[3]);
        aceptar.setBackground(Color.WHITE);
        aceptar.setForeground(Color.BLACK);
        aceptar.setFont(nuevaTipografia);
        add(aceptar);

        aceptar.addActionListener(this);

        cancelar = new JButton("Cancelar");
        componente.setComponent(cancelar, cancelarBounds[0], cancelarBounds[1], cancelarBounds[2], cancelarBounds[3]);
        cancelar.setBackground(Color.WHITE);
        cancelar.setForeground(Color.BLACK);
        cancelar.setFont(nuevaTipografia);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar){   //indica que el evento esta en e y se usa getSource que recupera el evento que se guardo en e
            texto = combobox.getSelectedItem().toString(); 
            texto1 = combobox1.getSelectedItem().toString(); 
        }else if(e.getSource() == cancelar){
            System.exit(0); //Para cerrar la interfaz grafica
        }
    }
}
