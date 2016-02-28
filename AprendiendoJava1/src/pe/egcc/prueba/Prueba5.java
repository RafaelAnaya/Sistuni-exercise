/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import pe.egcc.ddo.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba5 {
    public static void main(String[] args) {
        Producto bean= new Producto();
        mostrar(bean);
        bean.setNombre("Cocacola");
        bean.setPrecio(2.4);
        bean.setStock(10);
        mostrar(bean);
    }

    private static void mostrar(Producto bean) {
        System.err.println("-----------");
        System.err.println("Nombre "+ bean.getNombre());
        System.err.println("Precio "+ bean.getPrecio());
        System.err.println("Stock "+ bean.getStock());
       
    }
    
}
