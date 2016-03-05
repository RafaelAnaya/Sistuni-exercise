/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.MyMath;

/**
 *
 * @author Alumno
 */
public class MateController {
    public long factorial(int n ){
    return MyMath.factorial(n);
    }
    public int[] fibonacci(int ctd){
    return MyMath.fibonacci(ctd);
    }
    
}
