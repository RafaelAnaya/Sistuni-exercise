/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.Service;

/**
 *
 * @author RAFAEL
 */
public class Service {
    double Resultado;
    public double CalculosSuma (double numero[]){
        Resultado=numero[0]+numero[1];
        return Resultado;
    }
    public double CalculosResta (double numero[]){
        Resultado=numero[0]-numero[1];
        return Resultado;
    }
    public double CalculosMultiplicacion (double numero[]){
        Resultado= numero[0]*numero[1];
        return Resultado;
    }
    public double CalculosDivision (double numero[]){ 
        Resultado=numero[0]/numero[1];
        return Resultado;
    }
}
