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
public class AlumnoSec extends Alumno {
    private int grado = 2;
    
    public boolean gradoRec (int nivel){
    if( nivel >= getGrado())
        return true;
    else
        return false;
    
    }

    /**
     * @return the grado
     */
    public int getGrado() {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado) {
        this.grado = grado;
    }
}
