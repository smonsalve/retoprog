package Modelo;

import javax.swing.table.DefaultTableModel;

public class UsuarioDtos {
    
    //Creamos objetos de los paquetes AccesoDatos y Entidades.
    EntUsuario UsuarioEnt = null;
    
    static String [][] UsuarioDatos = new String[10000][11];
    
    int j, t;
    
    public static int ult; //variable que nos servirá para contar cuantos vectores creamos.
    
static {  //Estático: significa que el vector creado no cambia sus valores.
    
    
        UsuarioDatos[0][0]="000001";//este es el codigo
        UsuarioDatos[0][1]="Juan";//este es el nombre
        UsuarioDatos[0][2]="Villa";//este es el apellido
        UsuarioDatos[0][3]="password1234";//este es la clave
        UsuarioDatos[0][4]="Administrador";//este es el perfil
        UsuarioDatos[0][5]="Activo";//este es el estado
        UsuarioDatos[0][6]="Masculino";//este es el genero
        UsuarioDatos[0][7]="DjJayVilla@gmail.com";//este es el correo
        UsuarioDatos[0][8]="Tarjeta De Identidad";//este es el Tipo De Documento
        UsuarioDatos[0][9]="98091867567";//este es el Numero De Documento
        UsuarioDatos[0][10]="3194216168";//este es el Numero De Contacto
            
        UsuarioDatos[1][0]="000002";//este es el codigo
        UsuarioDatos[1][1]="Sebastian";//este es el nombre
        UsuarioDatos[1][2]="Posada";//este es el apellido
        UsuarioDatos[1][3]="98082553541";//este es la clave 
        UsuarioDatos[1][4]="Administrador";//este es el perfil
        UsuarioDatos[1][5]="Activo";//este es el estado
        UsuarioDatos[1][6]="Masculino";//este es el genero
        UsuarioDatos[1][7]="SebastianPosada45@gmail.com";//este es el correo
        UsuarioDatos[1][8]="Tarjeta De Identidad";//este es el Tipo De Documento
        UsuarioDatos[1][9]="98082553541";//este es el Numero De Documento
        UsuarioDatos[1][10]="3508254074";//este es el Numero De Contacto
            
        UsuarioDatos[2][0]="000003";//este es el codigo
        UsuarioDatos[2][1]="Daniel";//este es el nombre
        UsuarioDatos[2][2]="Villa";//este es el apellido
        UsuarioDatos[2][3]="12345678";//este es la clave
        UsuarioDatos[2][4]="Administrador";//este es el perfil
        UsuarioDatos[2][5]="Activo";//este es el estado
        UsuarioDatos[2][6]="Masculino";//este es el genero
        UsuarioDatos[2][7]="DFVil2000@gmail.com";//este es el correo
        UsuarioDatos[2][8]="Tarjeta De Identidad";//este es el Tipo De Documento
        UsuarioDatos[2][9]="1010102091";//este es el Numero De Documento
        UsuarioDatos[2][10]="3122694320";//este es el Numero De Contacto
        
        UsuarioDatos[3][0]="000100";//este es el codigo
        UsuarioDatos[3][1]="Rectora";//este es el nombre
        UsuarioDatos[3][2]="Ficticia";//este es el apellido
        UsuarioDatos[3][3]="contraseña1";//este es la clave
        UsuarioDatos[3][4]="Rectora";//este es el perfil
        UsuarioDatos[3][5]="Activo";//este es el estado
        UsuarioDatos[3][6]="Femenino";//este es el genero
        UsuarioDatos[3][7]="correoficticio@dominio.com";//este es el correo
        UsuarioDatos[3][8]="Cedula";//este es el Tipo De Documento
        UsuarioDatos[3][9]="43260955";//este es el Numero De Documento
        UsuarioDatos[3][10]="3163215698";//este es el Numero De Contacto
        
        UsuarioDatos[4][0]="000200";//este es el codigo
        UsuarioDatos[4][1]="Secretaria";//este es el nombre
        UsuarioDatos[4][2]="Ficticia";//este es el apellido
        UsuarioDatos[4][3]="contraseña2";//este es la clave
        UsuarioDatos[4][4]="Secretaria";//este es el perfil
        UsuarioDatos[4][5]="Activo";//este es el estado
        UsuarioDatos[4][6]="Femenino";//este es el genero
        UsuarioDatos[4][7]="correoficticio@dominio.com";//este es el correo
        UsuarioDatos[4][8]="Cedula";//este es el Tipo De Documento
        UsuarioDatos[4][9]="94342853";//este es el Numero De Documento
        UsuarioDatos[4][10]="3196548756";//este es el Numero De Contacto 
        
        UsuarioDatos[5][0]="000300";//este es el codigo
        UsuarioDatos[5][1]="Coordinador";//este es el nombre
        UsuarioDatos[5][2]="Ficticio";//este es el apellido
        UsuarioDatos[5][3]="contraseña3";//este es la clave
        UsuarioDatos[5][4]="Coordinador";//este es el perfil
        UsuarioDatos[5][5]="Activo";//este es el estado
        UsuarioDatos[5][6]="Masculino";//este es el genero
        UsuarioDatos[5][7]="correoficticio@dominio.com";//este es el correo
        UsuarioDatos[5][8]="Cedula";//este es el Tipo De Documento
        UsuarioDatos[5][9]="98481532";//este es el Numero De Documento
        UsuarioDatos[5][10]="3122688008";//este es el Numero De Contacto
        
        UsuarioDatos[6][0]="000400";//este es el codigo
        UsuarioDatos[6][1]="Docente";//este es el nombre
        UsuarioDatos[6][2]="Ficticia";//este es el apellido
        UsuarioDatos[6][3]="contraseña4";//este es la clave
        UsuarioDatos[6][4]="Docente";//este es el perfil
        UsuarioDatos[6][5]="Activo";//este es el estado
        UsuarioDatos[6][6]="Femenino";//este es el genero
        UsuarioDatos[6][7]="correoficticio@dominio.com";//este es el correo
        UsuarioDatos[6][8]="Cedula";//este es el Tipo De Documento
        UsuarioDatos[6][9]="91437881";//este es el Numero De Documento
        UsuarioDatos[6][10]="3194216569";//este es el Numero De Contacto
        
        UsuarioDatos[7][0]="000500";//este es el codigo
        UsuarioDatos[7][1]="Alumno";//este es el nombre
        UsuarioDatos[7][2]="Ficticio";//este es el apellido
        UsuarioDatos[7][3]="contraseña5";//este es la clave
        UsuarioDatos[7][4]="Alumno";//este es el perfil
        UsuarioDatos[7][5]="Activo";//este es el estado
        UsuarioDatos[7][6]="Masculino";//este es el genero
        UsuarioDatos[7][7]="correoficticio@dominio.com";//este es el correo
        UsuarioDatos[7][8]="Tarjeta De Identidad";//este es el Tipo De Documento
        UsuarioDatos[7][9]="1020438143";//este es el Numero De Documento
        UsuarioDatos[7][10]="3175642358";//este es el Numero De Contacto
    
    ult=8; //depende del # de vectores creados, sirve para detener el ciclo for (mencionado mas abajo).
    
}
     public UsuarioDtos(){
     }
     
    public EntUsuario buscarUsuarioCodigo(String Cod_Usuario){
 	
 	EntUsuario usuario; 
        
 	System.out.println("Entro buscar");
        
 	for(int i=0;i<ult;i++){
            
            if(UsuarioDatos[i][0].equals(Cod_Usuario) || UsuarioDatos[i][2].equals(Cod_Usuario)){
                    usuario = new EntUsuario();
                        usuario.setCod_Usuario(UsuarioDatos[i][0]);
                        usuario.setNombres(UsuarioDatos[i][1]);
                        usuario.setApellidos(UsuarioDatos[i][2]);
                        usuario.setClave(UsuarioDatos[i][3]);
                        usuario.setPerfil(UsuarioDatos[i][4]);
                        usuario.setEstado(UsuarioDatos[i][5]);
                        usuario.setGenero(UsuarioDatos[i][6]);
                        usuario.setCorreo(UsuarioDatos[i][7]);
                        usuario.setTipoDocumento(UsuarioDatos[i][8]);
                        usuario.setNumeroDocumento(UsuarioDatos[i][9]);
                        usuario.setNumeroContacto(UsuarioDatos[i][10]);
 			 			
                    return usuario;
            }
        }
   return null;
   }

      public boolean GuardarUsuario(EntUsuario Usuario){ //instanciamos las entidades con el nombre usuario.
        
 	UsuarioDatos[ult][0]=Usuario.getCod_Usuario();
 	UsuarioDatos[ult][1]=Usuario.getNombres();
        UsuarioDatos[ult][2]=Usuario.getApellidos();
 	UsuarioDatos[ult][3]=Usuario.getClave();
 	UsuarioDatos[ult][4]=Usuario.getPerfil();
 	UsuarioDatos[ult][5]=Usuario.getEstado();
        UsuarioDatos[ult][6]=Usuario.getGenero();
        UsuarioDatos[ult][7]=Usuario.getCorreo();
        UsuarioDatos[ult][8]=Usuario.getTipoDocumento();
        UsuarioDatos[ult][9]=Usuario.getNumeroDocumento();
        UsuarioDatos[ult][10]=Usuario.getNumeroContacto();
                      
 	ult++;
 	for(int i=0; i<ult;i++){                              
 		System.out.println(UsuarioDatos[i][0]);
 		}
 	return true;
 	
  	}//cierra el método guardar.
    
    public String[][] CargarUsuario(){
	return UsuarioDatos;
	}//cierra el método cargarUsuario    


  public DefaultTableModel CargarUsuario(DefaultTableModel DataModel){
                String [][] result;                
                result = CargarUsuario();
                for(int i=0; i<ult;i++){
                   
                Object nuevo []={result[i][0],result[i][1],result[i][2], result[i][3],result[i][4],result[i][5],result[i][6], result[i][7], result[i][8], result[i][9], result[i][10]};
                DataModel.addRow(nuevo);
                }//cierra el ciclo for.
                return DataModel;                
   }//cierra el metodo cargarUsuario
  
    public int validarIngreso(String Usuario, String Clave){
        for(j = 0; j<ult; j++){
             if(Usuario.equals(UsuarioDatos[j][9]) && Clave.equals(UsuarioDatos[j][3])){
                return (1);
            }if(!Usuario.equals(UsuarioDatos[j][9]) && Clave.equals(UsuarioDatos[j][3])){
                return (2);
            }else if(Usuario.equals(UsuarioDatos[j][9]) && !Clave.equals(UsuarioDatos[j][3])){
                return (3);
            }
        }
          return (0);
    }
    
    public int ValidarTipo(){
        if(UsuarioDatos[j][4].equals("Administrador")){
            return (11);
        }if(UsuarioDatos[j][4].equals("Rectora")){
            return (12);
        }if(UsuarioDatos[j][4].equals("Secretaria")){
            return (13);
        }if(UsuarioDatos[j][4].equals("Coordinador")){
            return (14);
        }if(UsuarioDatos[j][4].equals("Docente")){
            return (15);
        }if(UsuarioDatos[j][4].equals("Alumno")){
            return (16);
        }
        return (17);
    }
}
