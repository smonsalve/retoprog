package Formularios;

import java.awt.*;
import javax.swing.*;

public class frmCoordinador extends JFrame { // declaramos los componentes de la ventana
    JLabel lbliniciada,lblmenu;
    JButton btnplantillas,btnlibro,btnasistencia,btnrefuerzo,btnhojadevida,btndocentes;
    
    public frmCoordinador (){
        
       super("Menu Coordinador - SINIELI");
       setSize(700,400);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezaca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       
      
       lblmenu = new JLabel("Menu Coordinador");
       btnplantillas=new JButton("Ver Planillas");
       btnlibro=new JButton("Libro De Observacion");
       btnasistencia=new JButton("Plantillas De Asistencia");
       btnrefuerzo=new JButton("Planillas De Refuerzo");
       btnhojadevida=new JButton("Hojas De Vida");
       btndocentes=new JButton("Administrar Docentes");
       
    
       //variable.setBounds(DHorizontal,DVertical,ancho,alto)
       lblmenu.setBounds(260,30,500,25);
       lblmenu.setFont(new Font("arial",Font.BOLD,22));
       btnplantillas.setBounds(75,100,250,25);
       btnlibro.setBounds(75,150,250,25);
       btnasistencia.setBounds(75,200,250,25);
       btnrefuerzo.setBounds(375,100,250,25);
       btnhojadevida.setBounds(375,150,250,25);
       btndocentes.setBounds(375,200,250,25);
       
       
       this.add(lblmenu);
       this.add(btnplantillas);
       this.add(btnlibro);
       this.add(btnasistencia);
       this.add(btnrefuerzo);
       this.add(btnhojadevida);
       this.add(btndocentes);
       
       
       
       this.repaint();
       
    }
    
    public static void main(String[]args){
    
        frmCoordinador iniciar = new frmCoordinador();
        iniciar.setVisible(true);
        
        
        
        
    }
 }
    

    