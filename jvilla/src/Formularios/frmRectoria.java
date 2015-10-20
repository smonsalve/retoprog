
package Formularios;

import java.awt.*;
import javax.swing.*;

public class frmRectoria extends JFrame {
    // declaramos los componentes de la ventana
    JLabel lbliniciada,lblmenu;
    JButton btnplantillas, btnmodplantillas,btnlibro,btnenviar,btnplaneador,btnrefuerzo,btnhojadevida;
    
    public frmRectoria(){
        
       super("Menu Rectoria - SINIELI");
       setSize(700,400);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezaca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       lblmenu = new JLabel("Menu Rectoria");
       btnplantillas=new JButton("Ver Planillas");
       btnmodplantillas=new JButton("Libros De Observacion");
       btnlibro=new JButton("Matriculas");
       btnenviar=new JButton("Memorandos");
       btnplaneador=new JButton("Agenda");
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
    
        frmRectoria iniciar = new frmRectoria();
        iniciar.setVisible(true);
    }
 }