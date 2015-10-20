package Modelo;

public class MatriculasDtos {
    
    EntMatriculas matriculasEnti = null;
    static String MatriculasDtos[][] = new String [1000000000][9];
    public static int ult;
    
    static{
    
        MatriculasDtos[0][0] = "01";
        MatriculasDtos[0][1] = "Prueba";
        MatriculasDtos[0][2] = "Datos";
        MatriculasDtos[0][3] = "xxxxxxxxxx";
        MatriculasDtos[0][4] = "xxxxxxxxxxx";
        MatriculasDtos[0][5] = "xxxxxxxxxx";
        MatriculasDtos[0][6] = "xxxxxx@xxxxxxx.com";
        MatriculasDtos[0][7] = "xxxxxxxxxxx";
        MatriculasDtos[0][8] = "01234567890";
        
        ult = 1;
    }
    
    public MatriculasDtos(){
        //TO-DO
    }
    
    public boolean guardarMatricula(EntMatriculas Estudiante){
     	
        MatriculasDtos[ult][0] = Estudiante.getCod_Matricula();
        MatriculasDtos[ult][1] = Estudiante.getNombres_Estudiantes();
        MatriculasDtos[ult][2] = Estudiante.getApellidos_Estudiante();
        MatriculasDtos[ult][3] = Estudiante.getPerfil_Estudiante();
        MatriculasDtos[ult][4] = Estudiante.getEstado();
        MatriculasDtos[ult][5] = Estudiante.getGenero_Estudiante();
        MatriculasDtos[ult][6] = Estudiante.getEmail_Estudiante();
        MatriculasDtos[ult][7] = Estudiante.getTipoDocumento();
        MatriculasDtos[ult][8] = Estudiante.getNumeroDocumento();
        
        ult++;
 	for(int i=0; i<ult;i++){                              
 		System.out.println(MatriculasDtos[i][0]);
 		}
 	return true;
    }
    
        public String[][] cargarMatricula(){
	return MatriculasDtos;
	}
        
        public int Cod_Matricula(){
            //TO-DO: Realizar La Programacion De La Variable Del frmMatriculas Cod_Matricula, La Cual Debe Ser Un Contador Automatico.
        return (9);
        }
    

}
