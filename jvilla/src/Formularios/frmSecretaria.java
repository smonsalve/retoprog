package Formularios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frmSecretaria extends JFrame implements ActionListener{ // declaramos los componentes de la ventana
    JLabel lbliniciada,lblmenu;
    JButton btnmatriculas,btnagenda,btnasistencia,btncertificados,btnplantillas,btnhojadevida, btnatras;
    
    public frmSecretaria (){
        
       super("Menu Seretaria - SINIELI");
       setSize(700,400);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       
      
       lblmenu = new JLabel("Menu Secretaria");
       btnatras = new JButton("← Atras");
       btnmatriculas=new JButton("Matriculas");
       btnagenda=new JButton("Agenda");
       btnasistencia=new JButton("Planillas De Asistencia");
       btncertificados=new JButton("Certificados");
       btnplantillas=new JButton("Platillas De Papeleria");
       btnhojadevida=new JButton("Hoja De Vida");
       
    
       //variable.setBounds(DHorizontal,DVertical,ancho,alto)
       lblmenu.setBounds(265,30,500,25);
       lblmenu.setFont(new Font("arial",Font.BOLD,22));
       btnatras.setBounds(5,5,80,25);
       btnmatriculas.setBounds(75,100,250,25);
       btnagenda.setBounds(75,150,250,25);
       btnasistencia.setBounds(75,200,250,25);
       btncertificados.setBounds(375,100,250,25);
       btnplantillas.setBounds(375,150,250,25);
       btnhojadevida.setBounds(375,200,250,25);
       
       btnatras.addActionListener(this);
       btnmatriculas.addActionListener(this);
       btnagenda.addActionListener(this);
       btnasistencia.addActionListener(this);
       btncertificados.addActionListener(this);
       btnplantillas.addActionListener(this);
       btnhojadevida.addActionListener(this);
       
       
       this.add(lblmenu);
       this.add(btnatras);
       this.add(btnmatriculas);
       this.add(btnagenda);
       this.add(btnasistencia);
       this.add(btncertificados);
       this.add(btnplantillas);
       this.add(btnhojadevida);
       
       
       
       this.repaint();
       
    }
    
    public static void main(String[]args){
    
        frmSecretaria iniciar = new frmSecretaria();
        iniciar.setVisible(true);
        
    }
    
        public void actionPerformed(ActionEvent e) {
            
        if (e.getSource() == btnmatriculas) {
            dispose(); //cierra la ventana activa (en este caso salir).
            frmMatriculas menu = new frmMatriculas(); //instancia la clase frmPrincipal
            menu.setVisible(true); //abre el menú principal.
        }if (e.getSource() == btnatras) {
            dispose(); //cierra la ventana activa (en este caso salir).
            AccesoSistema menu = new AccesoSistema(); //instancia la clase frmPrincipal
            menu.setVisible(true); //abre el menú principal.
        }
    }
    
 }
    

    