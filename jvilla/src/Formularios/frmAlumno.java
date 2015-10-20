
package Formularios;

import java.awt.*;
import javax.swing.*;

public class frmAlumno extends JFrame { // declaramos los componentes de la ventana
    JLabel lbliniciada,lblmenu;
    JButton btnnotas, btnlibrodeobservacion,btnplanillasdeasistencia,btnnotasderefuerzo,btnhojadevida;
    
    public frmAlumno(){
        
       super("Menu Alumno - SINIELI");
       setSize(700,400);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezaca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       
      
       lblmenu = new JLabel("Menu Alumno");
       btnnotas=new JButton("Ver Notas");
       btnlibrodeobservacion=new JButton("libro De Observacion");
       btnplanillasdeasistencia=new JButton("Planillas De Asistencia");
       btnnotasderefuerzo=new JButton("Notas De refuerzo");
       btnhojadevida=new JButton("Hojas De Vida");
       //variable.setBounds(DHorizontal,DVertical,ancho,alto)
       lblmenu.setBounds(270,30,500,25);
       lblmenu.setFont(new Font("arial",Font.BOLD,22));
       btnnotas.setBounds(75,100,250,25);
       btnlibrodeobservacion.setBounds(75,150,250,25);
       btnplanillasdeasistencia.setBounds(75,200,250,25);
       btnnotasderefuerzo.setBounds(375,100,250,25);
       btnhojadevida.setBounds(375,150,250,25);
       
       this.add(lblmenu);
       this.add(btnnotas);
       this.add(btnlibrodeobservacion);
       this.add(btnplanillasdeasistencia);
       this.add(btnnotasderefuerzo);
       this.add(btnhojadevida);
       
       
       this.repaint();
       
    }
    
    public static void main(String[]args){
    
        frmAlumno iniciar = new frmAlumno();
        iniciar.setVisible(true);
        
        
        
        
    }
 }
    

    