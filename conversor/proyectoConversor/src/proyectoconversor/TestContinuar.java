
package proyectoconversor;

import java.awt.Color;

/**
 *
 * @author User
 */
public class TestContinuar implements TestConversor<continuar>{
    public void TestContinuar(){
        continuar cont = new continuar();
        TestContinuar vista3 = new TestContinuar();
        vista3.TestConversor(cont, 100,100,400,200);
        Color color = Color.decode("#252850");
        cont.getContentPane().setBackground(color);
    }

    public static void main(String[] args) {
        TestContinuar ver = new TestContinuar();
        ver.TestContinuar();
    }

    @Override
    public void TestConversor(continuar conversor, int x, int y, int z, int w) {
        menu1.setComponenteMenu(conversor, x,y,z,w);
        conversor.setVisible(true);
        conversor.setResizable(false); //Para que pueda modificarse el tamaño de la interfaz, false: no se lo pemrita
        conversor.setLocationRelativeTo(null); //para que aparezca en el centro de la pantalla
    }
}