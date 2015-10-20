package Modelo;



public class MemorandosDtos {
    
    EntMemorandos memorandosEnt = null;
    
    static String [][] MemorandosDatos = new String [10000][3];
    
    public static int ult;
    
    static{
        
        MemorandosDatos[0][0] = "Nombre Ficticio"; //Este Es El Nombre Del La Persona Memorada
        MemorandosDatos[0][1] = "Leve, Grave, Gravisimo"; //Este Es El Tipo De Memorando
        MemorandosDatos[0][2] = "Descripción"; //Este Es La Descripción Del Memorando
        
        ult =1;
    }
    
    public MemorandosDtos(){
    }
    
      public boolean GuardarUsuario(EntMemorandos Memo){ //instanciamos las entidades con el nombre usuario.
        
 	MemorandosDatos[ult][0]=Memo.getCodigo_Empleado();
 	MemorandosDatos[ult][1]=Memo.getTipo_Memorando();
        MemorandosDatos[ult][2]=Memo.getDescripcion_Memorando();

                      
 	ult++;
 	for(int i=0; i<ult;i++){                              
 		System.out.println(MemorandosDatos[i][0]);
 		}
 	return true;
 	}

    public boolean PararUsuario(EntMemorandos memorandosEnt) {
        return true;
    }
}
