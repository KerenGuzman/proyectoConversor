
package proyectoconversor;


/**
 * 
 * En este caso, se utiliza el parámetro de tipo T en la interfaz 
 * para indicar que puede ser cualquier tipo de clase.
 * 
 * 
 * @author User Keren Guzman - Proyecto Conversor Alura
 * 
 */

public interface TestConversor<T>{
    public void TestConversor(T conversor, int x, int y, int z, int w);
}
