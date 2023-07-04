/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoconversor;

/**
 *
 * @author User
 */
public class ValidarNumero {
    //validacion de numeros
    public static boolean validarNumeros(String datos){
        //parametro String es el dato que se valida 
        return datos.matches("[0-9-.]*");   //* para que nos tome cualquier cantidad de numeros
        //matches valida que haya concordancia y nos retorna un booleano
    }
}
