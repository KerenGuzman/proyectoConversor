package proyectoconversor;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class menu1{
    //Medida del JComboBox, static para que se pueda llamar sin instanciar
   public static void setComponent(JComponent componente, int x, int y, int width, int height){
       componente.setBounds(x, y, width, height);
   }
   public static void setComponenteMenu(JFrame frame, int x, int y, int width, int height){
       frame.setBounds(x, y, width, height);
   }
}