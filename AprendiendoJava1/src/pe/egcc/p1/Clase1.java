/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.p1;

/**
 *
 * @author Alumno
 */
public class Clase1 {
   private int n1;//Privada
   int n2;//paquete
   protected int n3;//Protegida
   public int n4;//publica
   public void mostrarDatos(){
       System.out.println("n1:" + n1);
       System.err.println("n2:" + n2);
       System.out.println("n3:" + n3);
       System.err.println("n4:" + n4);
   }
}
