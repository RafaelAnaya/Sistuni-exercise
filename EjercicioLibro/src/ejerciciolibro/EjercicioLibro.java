/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibro;

/**
 *
 * @author RAFAEL
 */
public class EjercicioLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AlumnoSec As = new AlumnoSec();
    As.setGrado(4);
   if(As.gradoRec(3))
            System.out.println("El grado es recomendable");
   else
            System.out.println("El grado no es recomendable");
    }
    
}
