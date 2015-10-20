package Formularios;

import java.awt.*;
import javax.swing.*;
import Modelo.UsuarioDtos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

// Los dos codigos van de la mano por que uno lo crea y el otro lo decora
public class AccesoSistema extends JFrame implements ActionListener{
    // declaramos los componentes de la ventana
      String usuario;
      String clave;
          
    //Declaramos los componentes de la ventana.
    JLabel lblusuario,lblclave,lblimagen;
    JTextField txtusuario;
    JPasswordField txtclave;
    JButton btningresar, btnsalir;
    
    public AccesoSistema(){
        
       super("Ingreso Al Sistema");
       setSize(400,200);// el tamaño de la venta
       setLocationRelativeTo(null);//es para que la pantalla aparezaca en el centro
       setLayout(null);
       setVisible(true);// para mostrar la ventana
       
       //esta parte de arriba es el constructor : es el que le premite crear componentes
       
       lblimagen.setIcon(getClass().getResource("/Imagenes/Escudo.png"));
       lblimagen.setBounds(270,10,120,140);
       this.add(lblimagen);
       lblusuario = new JLabel("Usuario: ");
       lblclave = new JLabel("Contraseña: ");
       txtusuario = new JTextField("");
       txtclave = new JPasswordField("");
       btningresar = new JButton("Ingresar");
       txtusuario.addActionListener(this);
       txtclave.addActionListener(this);
       btningresar.addActionListener(this);//Ponemos A Escuchar El Boton
       btnsalir = new JButton("Salir");
       btnsalir.addActionListener(this);
       lblusuario.setBounds(20,20,80,25);
       lblclave.setBounds(20,60,80,25);
       txtusuario.setBounds(130,20,120,25);
       txtclave.setBounds(130,60,120,25);
       btningresar.setBounds(20,100,120,25);
       btnsalir.setBounds(150,100,120,25);
       lblusuario.setForeground(new Color (0,0,0));
       //lblusuario.setBorder(BorderFactory.createLineBorder(Color.yellow, WIDTH));//sirve para mostrar el tamaño del lbl
       txtusuario.setBackground(Color.WHITE);//este es para darle color a la caja de texto
       txtusuario.setToolTipText("Ingrese Su Usuario");// sirve para mostrar mensajes emergentes
       this.add(lblusuario);
       this.add(lblclave);
       this.add(txtusuario);
       this.add(txtclave);
       this.add(btningresar);
       this.add(btnsalir);
       this.repaint();
       
    }
    
    public static void main(String[]args){
    
        AccesoSistema iniciar = new AccesoSistema();
        iniciar.setVisible(true);
    }
    
    public boolean validarCampos(){
    	
		boolean resp=true;
		int clv;
		
		usuario=txtusuario.getText();
		clave=new String(txtclave.getPassword());
		
                                  //si usuario esta vacio
		if(usuario.trim().length()==0){
			JOptionPane.showMessageDialog(this,"Por favor Ingrese el Usuario","Campo Usuario (Obligatorio)",JOptionPane.ERROR_MESSAGE);
			resp=txtusuario.requestFocusInWindow();
			return resp;
                        
		}
		//si clave esta vacio
		if(clave.trim().length()==0){
			JOptionPane.showMessageDialog(this,"Por favor ingrese la clave","Campo Contraseña (Obligatorio)", JOptionPane.ERROR_MESSAGE);
			resp=false;
			return resp;
                }                 
    if(usuario.trim().length()<3 || usuario.trim().length()>20 ){
   JOptionPane.showMessageDialog(this,"Debe ingresar mínimo 3 caracteres "
 + "y máximo 20","Campo Usuario (Obligatorio)", JOptionPane.ERROR_MESSAGE);
			txtusuario.setText("");
                                                    txtclave.setText("");
                                                   txtusuario.requestFocusInWindow();
                                                   resp=false;
			return resp;
    }
    
     if(clave.trim().length()<3 || clave.trim().length()>16 ){
   JOptionPane.showMessageDialog(this,"Debe ingresar mínimo 3 caracteres "
 + "y máximo 16","Campo Clave (Obligatorio)", JOptionPane.ERROR_MESSAGE);
		                 txtclave.setText("");
                                                   txtclave.requestFocusInWindow();
                                                   resp=false;
			return resp;
                                   }  

			
    return  resp;
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
  
  int tipo;      
  int resultado;
        //Datos misDatos= new Datos(); //instanciar la clase Datos.
        boolean valido;
        UsuarioDtos misDatos = new UsuarioDtos();
                    
        if(e.getSource()==btningresar){ //si clic al botón ingresar
        valido=validarCampos();
        if(valido){
        resultado= misDatos.validarIngreso(txtusuario.getText(),new String(txtclave.getPassword()));
        tipo = misDatos.ValidarTipo();
        
        if(resultado==0){
        JOptionPane.showMessageDialog(null,"El Usuario Y La Contraseña Son Incorrectos");
        }
        
        if(resultado==1){
        JOptionPane.showMessageDialog(null,"Bienvenido al Sistema");
            if(tipo==11){
                dispose();
                frmMenuAdmin frmadmin = new frmMenuAdmin();
                frmadmin.setVisible(true);
            }if(tipo==12){
                dispose();
                frmRectoria frmrectora = new frmRectoria();
                frmrectora.setVisible(true);
            }
            if(tipo==13){
                dispose();
                frmSecretaria frmsecre = new frmSecretaria();
                frmsecre.setVisible(true);
            }
            if(tipo==14){
                dispose();
                frmCoordinador frmcordi = new frmCoordinador();
                frmcordi.setVisible(true);
            }
            if(tipo==15){
                dispose();
                frmDocentes frmdocente = new frmDocentes();
                frmdocente.setVisible(true);
            }
            if(tipo==16){
                dispose();
                frmAlumno frmalumno = new frmAlumno();
                frmalumno.setVisible(true);
            }
            if(tipo==17){
                JOptionPane.showMessageDialog(null,"Error En El Sistema, Por Favor Contacte A Un Administrador"); 
            }
        }
        
         if(resultado==2){
        JOptionPane.showMessageDialog(null,"El Usuario Es Incorrecto");    
        }
         if(resultado==3){
        JOptionPane.showMessageDialog(null,"La Contraseña Es Incorrecta");    
        }
      }
   }//cierra el condicional de btningresar
       
        //Programamos el botón de salir.
        if(e.getSource()==btnsalir){
            dispose();
        }
    }//Cierra El ActionPerformed
 
 }//Cierra La Clase