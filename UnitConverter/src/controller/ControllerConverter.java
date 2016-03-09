/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.ServiceConverter;

/**
 *
 * @author RAFAEL
 */
public class ControllerConverter {
    public double Temperature(double conv, String unit1,String unit2){
    return ServiceConverter.Temperature(conv,unit1,unit2);
    }
    public double Flow (double convf,String unitf1,String unitf2){
    return ServiceConverter.Flow(convf, unitf1, unitf2);
    }
    public double Pressure (double convp,String unitp1,String unitp2){
    return ServiceConverter.Pressure(convp, unitp1, unitp2);
    }
}
