
package proyectoconversor;

import java.awt.Color;

/**
 *
 * @author User
 */
public class primeraVista implements TestConversor<Conversor>{
    public void primeraVista(){
        Conversor visual = new Conversor();
        primeraVista vista1 = new primeraVista();
        vista1.TestConversor(visual, 100,100,400,300);
        Color color = Color.decode("#252850");
        visual.getContentPane().setBackground(color);
    }

    public static void main(String[] args) {
        primeraVista ver = new primeraVista();
        ver.primeraVista();
    }
    @Override
    public void TestConversor(Conversor conversor, int x, int y, int z, int w) {
        menu1.setComponenteMenu(conversor, x,y,z,w);
        conversor.setVisible(true);
        conversor.setResizable(false); //Para que pueda modificarse el tamaño de la interfaz, false: no se lo pemrita
        conversor.setLocationRelativeTo(null); //para que aparezca en el centro de la pantalla
    }
}
