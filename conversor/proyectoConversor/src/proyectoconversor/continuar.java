
package proyectoconversor;

import java.awt.event.ActionEvent;

public class continuar extends VentanaBase{
    primeraVista conversor = new primeraVista();
    public continuar(){
        super("Deseas Continuar:", new int[]{50, 5, 200, 100}, new int[]{50,70, 110, 30}, new int[]{210,70, 110, 30});
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar){   //indica que el evento esta en e y se usa getSource que recupera el evento que se guardo en e
            dispose();
           conversor.primeraVista();
        }else if(e.getSource() == cancelar){
            System.exit(0); //Para cerrar la interfaz grafica
        }
    }
}
