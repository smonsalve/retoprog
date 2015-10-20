package Modelo;

public class EntUsuario {
   
    String Cod_Usuario;
    String Nombres;
    String Apellidos;
    String Clave;
    String Perfil; 
    String Estado;
    String Genero;
    String Correo;
    String TipoDocumento;
    String NumeroDocumento;
    String NumeroContacto;
    
    //creamos los getter-setter                
    public String getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(String Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
        public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getNumeroContacto() {
        return NumeroContacto;
    }

    public void setNumeroContacto(String NumeroContacto) {
        this.NumeroContacto = NumeroContacto;
    }
       
}
