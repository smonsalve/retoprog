import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Contador_Episodios{
    public static void main(String [] args){
        
        int n, Input;
        
        String a = JOptionPane.showInputDialog("Ingrese El Numero De Capitulos");
        n = Integer.parseInt(a);
        
        Boolean Cap[] = new Boolean[n];
        Arrays.fill(Cap, Boolean.FALSE);
        
        for(int i = 1; i <= n - 1; i++){
            String b = JOptionPane.showInputDialog("Ingrese El Capitulo Visto");
            Input = Integer.parseInt(b);
            int Pos = Input - 1;
            Cap[Pos] = true;
        }
        
        for(int j = 1; j <= n; j++){
            int Pos = j++;
            if(Cap[Pos] == false){
                JOptionPane.showMessageDialog(null, "El Episodio Faltante Es: " +j);
            }
        }
    }
}
