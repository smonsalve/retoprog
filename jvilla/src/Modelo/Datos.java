package Modelo;

public class Datos {
    
    public int validarIngreso(String Usuario, String Clave){
    
        if(Usuario.equals("admin") && Clave.equals("password1234")){
            return (1);
        }else if(!Usuario.equals("admin")){
            return (2);
        }if(!Clave.equals("password1234")){
            return (3);
        }else{
            return (0);
        }
    }
}
