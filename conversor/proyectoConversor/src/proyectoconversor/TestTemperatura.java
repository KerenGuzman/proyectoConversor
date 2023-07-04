
package proyectoconversor;

import java.awt.Color;

public class TestTemperatura implements TestConversor<temperatura>{
    public void TestTemperatura(){
       temperatura visual = new temperatura();
       TestTemperatura vista1 = new TestTemperatura();
       vista1.TestConversor(visual, 100,100,500,350);
       Color color = Color.decode("#252850");
       visual.getContentPane().setBackground(color);
    }

    public static void main(String[] args) {
        TestTemperatura ver = new TestTemperatura();
        ver.TestTemperatura();
    }

    @Override
    public void TestConversor(temperatura conversor, int x, int y, int z, int w) {
        menu1.setComponenteMenu(conversor, x,y,z,w);
        conversor.setVisible(true);
        conversor.setResizable(false); //Para que pueda modificarse el tamaño de la interfaz, false: no se lo pemrita
        conversor.setLocationRelativeTo(null); //para que aparezca en el centro de la pantalla
    }
    
}
