/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import lib.Promedio;

/**
 *
 * @author Alumno
 */
public class MateController {
    private Promedio service;
    public MateController(){
    service = new Promedio();
    }
    public int promediar(int n1,int n2){
    int pr = service.promediar(n1, n2);
    return pr;
    }
    public int promediar(int n1, int n2, int n3){
    int pr1 = service.promediar(n1, n2, n3);
    return pr1;
    }
    public int promediar (int n1, int n2, int n3, int n4){
    int pr2= service.promediar(n1, n2, n3, n4);
    return pr2;
    }
    public int promediar (int n1, int n2 , int n3, int n4, int n5){
    int pr3= service.promediar(n1, n2, n3, n4, n5);
    return pr3;
    }
}
