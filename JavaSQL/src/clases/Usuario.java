package clases;


public class Usuario {
    //campos
    private String usuario;
    private String clave;
    //constructor no vacio
    public Usuario(){
        
    }
    //constructor no vacio
    public Usuario(String usuario,String clave){
        this.usuario=usuario;
        this.clave=clave;
    }
    //metodo getter y setter
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.clave=clave;
    }
    
}
