/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Alumno
 */
public class MyMath {
    private MyMath(){
    
    }
    
    public static long factorial(int n){
    long f=1;
    while(n>1){
    f*=n--;
    }
    return f;
    }
    public static int mcd(int n1,int n2){
    
    
    return 0;
    }
    
    public static int mcm(int n1, int n2){
        int mini;
        mini= Math.min(n1, n2);
        
    return mini;
    }
    
    public static int[] fibonacci (int ctd){      
        int[] num= new int[2];
        int[] temp= new int[ctd+1];
        temp[0]=1;
        num[0]=0;
        num[1]=1;
        for(int i=0;i<ctd;i++){ 
            num[0]=num[1];
            num[1]=temp[i];
            temp[i]=num[0]+num[1];
            temp[i+1]=num[1];
    }
    return temp;
    }
    public static boolean esPrimo(int n){
    return false;
    }
}
