
package Formularios;

import java.awt.*;
import javax.swing.*;

public class frmDocentes extends JFrame { // declaramos los componentes de la ventana
    JLabel lbliniciada,lblmenu;
    JButton btnplantillas, btnmodplantillas,btnlibro,btnenviar,btnplaneador,btnrefuerzo,btnhojadevida;
    
    public frmDocentes(){
        
       super("Menu Docentes - SINIELI");
       setSize(700,400);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezaca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       
      
       lblmenu = new JLabel("Menu Docentes");
       btnplantillas=new JButton("Ver Planillas");
       btnmodplantillas=new JButton("Modificar Plantillas");
       btnlibro=new JButton("Libro De Observacion");
       btnenviar=new JButton("Enviar Notas");
       btnplaneador=new JButton("Planeador De Area");
       btnrefuerzo=new JButton("Planillas De Refuerzo");
       btnhojadevida=new JButton("Hojas De Vida");
       //variable.setBounds(DHorizontal,DVertical,ancho,alto)
       lblmenu.setBounds(270,30,500,25);
       lblmenu.setFont(new Font("arial",Font.BOLD,22));
       btnplantillas.setBounds(75,100,250,25);
       btnmodplantillas.setBounds(75,150,250,25);
       btnlibro.setBounds(75,200,250,25);
       btnenviar.setBounds(75,250,250,25);
       btnplaneador.setBounds(375,100,250,25);
       btnrefuerzo.setBounds(375,150,250,25);
       btnhojadevida.setBounds(375,200,250,25);
       
       this.add(lblmenu);
       this.add(btnplantillas);
       this.add(btnmodplantillas);
       this.add(btnlibro);
       this.add(btnenviar);
       this.add(btnplaneador);
       this.add(btnrefuerzo);
       this.add(btnhojadevida);
       
       
       this.repaint();
       
    }
    
    public static void main(String[]args){
    
        frmDocentes iniciar = new frmDocentes();
        iniciar.setVisible(true);
        
        
        
        
    }
 }
    

    

