
package proyectoconversor;

import java.awt.Color;

/**
 *
 * @author User
 */

public class segundaVista implements TestConversor<Ventana2>{
    public void segundaVista(){
        Ventana2 ventana2 = new Ventana2();
        segundaVista vista1 = new segundaVista();
        vista1.TestConversor(ventana2, 100,100,500,350);
        Color color = Color.decode("#252850");
        ventana2.getContentPane().setBackground(color);
    }

    @Override
    public void TestConversor(Ventana2 conversor, int x, int y, int z, int w) {
        menu1.setComponenteMenu(conversor, x,y,z,w);
        conversor.setVisible(true);
        conversor.setResizable(false); //Para que pueda modificarse el tamaño de la interfaz, false: no se lo pemrita
        conversor.setLocationRelativeTo(null); //para que aparezca en el centro de la pantalla
    }
    
    public static void main(String[] args) {
        segundaVista ver = new segundaVista();
        ver.segundaVista();
    }
}
