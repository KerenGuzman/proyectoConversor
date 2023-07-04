package proyectoconversor;


import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author User
 */
public class Ventana2 extends VentanaBase{
    protected JTextField areaTexto;
    String[] opciones = {"COP a Dolar", "COP a Euro", "COP a Libra", "COP a Yen", "COP a Won","Dolar a COP", "Euro a COP", "Libra a COP", "Yen a COP", "Won a COP"};

    public Ventana2(){
        super("Ingrese Cantidad:", new int[]{160, 50, 300, 20}, new int[]{100,200, 110, 30}, new int[]{250,200, 110, 30});

        combobox = new JComboBox(opciones);
        componente.setComponent(combobox,45,140, 400, 25);
        combobox.setFont(nuevaTipografia);
        add(combobox);
        combobox.addActionListener(this);
        
        areaTexto = new JTextField();
        componente.setComponent(areaTexto, 45, 90, 400, 25);
        add(areaTexto);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //ValidarNumero validar = new ValidarNumero();
        if(e.getSource() == aceptar){
            //super.actionPerformed(e);
            String texto1 = areaTexto.getText().trim();
            //validar.ValidarNumero(texto1);
            //verificar si esta vacio
            if (texto1.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese Dato");
                areaTexto.requestFocus();
            }else if(!texto1.isEmpty()){
                //Si ValidadNumero es false
                if(!ValidarNumero.validarNumeros(areaTexto.getText().trim())){
                    JOptionPane.showMessageDialog(rootPane, "Solo Numeros");
                    //borrar texto
                    areaTexto.setText("");
                    //poner cursor
                    areaTexto.requestFocus();
                }else if(ValidarNumero.validarNumeros(areaTexto.getText().trim())){
                    texto = combobox.getSelectedItem().toString();
                    //convertir a float y capturar con getText
                    float dato = Float.parseFloat(areaTexto.getText());
                    calculo.conversorMoneda(texto, dato);
                    continuar.TestContinuar();     
                    dispose();
                }
            }
        }else if(e.getSource() == cancelar){
            System.exit(0); //Para cerrar la interfaz grafica
        }
    }
}