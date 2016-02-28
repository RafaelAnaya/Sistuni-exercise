/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import dto.PagoDto;
import service.PagoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        //Data
        PagoDto dto = new PagoDto();
        dto.setHorasDia(6);
        dto.setDias(20);
        dto.setPagoHora(140.0);
        //proceso
        PagoService pagoService = new PagoService();
        pagoService.procesar(dto);
        //Reporte
        System.out.println(" Ingresos: "+ dto.getIngreso());
        System.out.println(" Renta: "+ dto.getRenta());
        System.out.println(" Neto: "+ dto.getNeto());
        System.out.println(Math.PI);
        
    }
    
}
