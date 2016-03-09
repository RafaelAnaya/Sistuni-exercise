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
public class Alumno {
    protected  String Name;
    protected String Apellido;
    protected int Edad;
    protected double Tamaño;
    protected boolean Disponibilidad = false;
    
    public void YDispocision(){
    Disponibilidad = true;
    }
    public void NDispocision(){
    Disponibilidad = false;
    }
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Tamaño
     */
    public double getTamaño() {
        return Tamaño;
    }

    /**
     * @param Tamaño the Tamaño to set
     */
    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }

    /**
     * @return the Disponibilidad
     */
    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    /**
     * @param Disponibilidad the Disponibilidad to set
     */
    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
}
