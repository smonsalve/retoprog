
package Formularios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frmMenuAdmin extends JFrame implements ActionListener{ // declaramos los componentes de la ventana
    JLabel lbliniciada,lblmenu;
    JButton btngestionusuarios, btncargaractualizacion,btnnotasenviadas, btnatras;
    
    public frmMenuAdmin(){
        
       super("Menu Admin - SINIELI");
       setSize(700,400);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezaca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       
      
       lblmenu = new JLabel("Menu Administrador");
       btnatras = new JButton("Cerrar Sesión");
       btngestionusuarios=new JButton("Gestiòn Usuarios");
       btncargaractualizacion=new JButton("Cargar Actualizaciòn");
       btnnotasenviadas=new JButton("Ver Notas Enviadas");
       
       //variable.setBounds(DHorizontal,DVertical,ancho,alto)
       lblmenu.setBounds(250,80,500,25);
       lblmenu.setFont(new Font("arial",Font.BOLD,22));
       btnatras.setBounds(500,10,150,25);
       btngestionusuarios.setBounds(75,140,250,25);
       btncargaractualizacion.setBounds(75,185,250,25);
       btnnotasenviadas.setBounds(375,140,250,25);
       
       btnatras.addActionListener(this);
       btngestionusuarios.addActionListener(this);
       btncargaractualizacion.addActionListener(this);
       btnnotasenviadas.addActionListener(this);
       
       this.add(lblmenu);
       this.add(btnatras);
       this.add(btngestionusuarios);
       this.add(btncargaractualizacion);
       this.add(btnnotasenviadas);

       
       
       this.repaint();
       
    }
    
    public static void main(String[]args){
    
        frmMenuAdmin iniciar = new frmMenuAdmin();
        iniciar.setVisible(true);
    }
    
            public void actionPerformed(ActionEvent e) {
            
        if (e.getSource() == btngestionusuarios) {
            dispose(); //cierra la ventana activa (en este caso salir).
            frmUsuario menu = new frmUsuario(); //instancia la clase frmPrincipal
            menu.setVisible(true); //abre el menú principal.
        }if (e.getSource() == btnatras) {
            dispose(); //cierra la ventana activa (en este caso salir).
            AccesoSistema menu = new AccesoSistema(); //instancia la clase frmPrincipal
            menu.setVisible(true); //abre el menú principal.
        }
    }
 }
    

    