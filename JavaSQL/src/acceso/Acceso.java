
package acceso;
import java.sql.*;
import conexion.*;
import clases.*;
import java.util.*;


public class Acceso extends Conexion {
    Connection con=conectar();
    public int busca_usuario(String us,String cla){
        int sw=0;
        String sql="exec busca_usuario ?,?";
    try{
  PreparedStatement ps=con.prepareStatement(sql);
       ps.setString(1,us);
       ps.setString(2,cla);
       ResultSet rs=ps.executeQuery();
       if(rs.next()==true)
           sw=1;
       
    }
    catch(Exeption e){
        System.out.println(e.getMessage());
    }
    return sw;

 public int graba_usuario(String us,String psw){
     
 }
 
}


