/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio.pueba;

import java.util.Scanner;
import promedio.service.PromedioService;


/**
 *
 * @author RAFAEL
 */
public class Prueba01 {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        double nota[]=new double[4];
        for(int i=0;i<4;i++){
        System.out.println(" Ingresr valor" + " "+(i+1));
        nota[i]= scan.nextDouble();
        }
        PromedioService service = new PromedioService();
        double promedio = service.Calcular3Mayores(nota);  
        double MalaNota = service.NotaEliminada(nota);
        System.out.println( " El promedio es " + promedio);
        System.out.println( " La nota eliminada es " + MalaNota);
         
         
        
        
    
    }
    
}
