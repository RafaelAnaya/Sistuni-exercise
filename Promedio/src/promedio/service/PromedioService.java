/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio.service;

/**
 *
 * @author RAFAEL
 */
public class PromedioService {
    
    double notas[] = new double[4];
    public double Calcular3Mayores(double nota[]){
    
    double promedio;
    if (nota[0]<nota[1] && nota[0]<nota[2] && nota[0]<nota[3] )
     notas[0]=0;
    else { notas[0]=nota[0];
    }
    if (nota[1]<nota[2] && nota[1]<nota[0] && nota[1]<nota[3] )
     notas[1]=0;
    else { notas[1]=nota[1];
    }
    if (nota[2]<nota[0] && nota[2]<nota[1] && nota[2]<nota[3] )
     notas[2]=0;
    else { notas[2]=nota[2];
    }
    if (nota[3]<nota[0] && nota[3]<nota[1] && nota[3]<nota[2] )
     notas[3]= 0;
    else { notas[3]=nota[3];
    }
    promedio=(notas[0]+notas[1]+notas[2]+notas[3])/4;
    return promedio;
    }
    public double NotaEliminada(double nota[]){
        double MalaNota=0;
        for(int i=0; i<4;i++){
        MalaNota= nota[i]-notas[i]+MalaNota;
        }
        return MalaNota;
}
    
   /** public double CalcularPromedio(double notas[3])
            
    {**/
    
    
}
