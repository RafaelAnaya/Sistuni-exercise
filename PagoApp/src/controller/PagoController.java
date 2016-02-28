/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.PagoDto;
import service.PagoService;

/**
 *
 * @author Alumno
 */
public class PagoController {
public void procesar(PagoDto dto){
PagoService service= new PagoService();
service.procesar(dto);
}    
}
