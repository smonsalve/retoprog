package Formularios;

import Modelo.EntMemorandos;
import Modelo.MemorandosDtos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class frmMemorandosEmpleados extends JFrame implements ActionListener{
    
    String Codigo_Empleado;
    String Tipo_Memorando;
    String Descripcion_Memorando;
    
    JLabel lbltitulo, lblcodigoempleado, lbltipomemorando, lbldescripcion, lblobligatorio;
    JTextField txtcodigoempleado;
    JTextArea jtadescripcion;
    JScrollPane jsppanel;
    JComboBox cbotipomemorando;
    JButton btnGuardar, btnBuscar, btnActualizar, btnEliminar, btnLimpiar, btnSalir;
    String Obligatorio = "(*) = Campos Obligatorios";
    
    public frmMemorandosEmpleados(){
        setTitle("Registro De Usuarios"); //Titulo de la pantalla
        setSize(900, 500); //Tamaño de la venta
        setLocationRelativeTo(null); //Centra la pantalla
        setLayout(null); //Activa el ordenamiento manual de los elementos
        setVisible(true); //Activa el muestreo de la pantalla
        
        lbltitulo = new JLabel("Memorandos A Empleados");
        lblcodigoempleado = new JLabel("Codigo Del Empleado *");
        lbltipomemorando = new JLabel("Tipo De Memorando *");
        lbldescripcion = new JLabel("Descripción Del Memorando *");
        lblobligatorio = new JLabel(Obligatorio);
        
        jtadescripcion = new JTextArea();
        jtadescripcion.setLineWrap(true);
        jtadescripcion.setWrapStyleWord(true);
        jsppanel = new JScrollPane(jtadescripcion);
        jsppanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        txtcodigoempleado = new JTextField();
        
        cbotipomemorando = new JComboBox();
        cbotipomemorando.addItem("Seleccione Una Opción");
        cbotipomemorando.addItem("Leve");
        cbotipomemorando.addItem("Grave");
        cbotipomemorando.addItem("Gravisimo");
        
        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Cancelar");
        
        lbltitulo.setBounds(305,80,500,25);
        lbltitulo.setFont(new Font("arial",Font.BOLD,22));
        lblcodigoempleado.setBounds(40,150,200,25);
        lbltipomemorando.setBounds(465,150,200,25);
        lbldescripcion.setBounds(40,200,200,25);
        lblobligatorio.setBounds(650,360,200,25);
        jtadescripcion.setBounds(220,200,500,150);
        jsppanel.setBounds(220,200,500,150);
        txtcodigoempleado.setBounds(180,150,100,25);
        cbotipomemorando.setBounds(605,150,200,25);
        btnGuardar.setBounds(60,400,100,25);
        btnBuscar.setBounds(190,400,100,25);
        btnActualizar.setBounds(320,400,100,25);
        btnEliminar.setBounds(450,400,100,25);
        btnLimpiar.setBounds(580,400,100,25);
        btnSalir.setBounds(710,400,100,25);
        
        btnGuardar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnActualizar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnSalir.addActionListener(this);
        
        this.add(lbltitulo);
        this.add(lblcodigoempleado);
        this.add(lbltipomemorando);
        this.add(lbldescripcion);
        this.add(lblobligatorio);
        this.add(jsppanel);
        this.add(txtcodigoempleado);
        this.add(cbotipomemorando);
        this.add(btnGuardar);
        this.add(btnBuscar);
        this.add(btnActualizar);
        this.add(btnEliminar);
        this.add(btnLimpiar);
        this.add(btnSalir);
        
        this.repaint();
    }
    
        public void Limpiar() { //Método que permite limpiar todos los campos de un solo golpe.
        txtcodigoempleado.setText("");
        cbotipomemorando.setSelectedIndex(0);
        jtadescripcion.setText("");
    }
        
    public boolean ValidarCampos() {  //OJO importante para la validación de Campos.
        boolean resp = true;

        //asignamos los datos de los campos a unas variables de tipo String
        String Codigo_Empleado = txtcodigoempleado.getText();
        String Descripcion_Memorando = jtadescripcion.getText();

        if (Codigo_Empleado.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese El Codigo Del Empleado", "Campo Codigo Empleado (Obligatorio)", JOptionPane.ERROR_MESSAGE);
            resp = txtcodigoempleado.requestFocusInWindow();
            return resp;
        }

        if (Codigo_Empleado.trim().length() < 3 || Codigo_Empleado.trim().length() > 20) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres "
                    + "Y Máximo 20", "Campo Codigo Del Empleado (Obligatorio)", JOptionPane.ERROR_MESSAGE);
            txtcodigoempleado.setText("");
            txtcodigoempleado.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (Descripcion_Memorando.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor Ingrese La Descripción Del Memorando", "Campo Descripción Memorando (Obligatorio)", JOptionPane.ERROR_MESSAGE);
            resp = jtadescripcion.requestFocusInWindow();
            return resp;
        }

        if (Descripcion_Memorando.trim().length() < 3 || Descripcion_Memorando.trim().length() > 1000000000) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres ", "Campo Descripción Memorando (Obligatorio)", JOptionPane.ERROR_MESSAGE);
            jtadescripcion.setText("");
            jtadescripcion.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (cbotipomemorando.getSelectedItem() == "Seleccione Una Opción") {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Tipo De Memorando", "Campo Tipo De Memorando (Obligatorio)", JOptionPane.ERROR_MESSAGE);
            cbotipomemorando.requestFocusInWindow();
            resp = false;
            return resp;
        }
        

       
        

        //Verificamos que la clave y confirmar sean de tipo numérico

           return resp;
       }
    
    public static void main(String[] args){
        frmMemorandosEmpleados frmmemos = new frmMemorandosEmpleados();
        frmmemos.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EntMemorandos memorandosEnt= new EntMemorandos();
        MemorandosDtos MemorandosDtos = new MemorandosDtos();
        boolean resultados;
        boolean valido;
        
        if (e.getSource() == btnGuardar) {  //si clic al botón "guardar"

            valido=ValidarCampos();
            
        if(valido){
            
        memorandosEnt.setCodigo_Empleado(Codigo_Empleado);
        memorandosEnt.setTipo_Memorando(Tipo_Memorando);
        memorandosEnt.setDescripcion_Memorando(Descripcion_Memorando);

        
        Tipo_Memorando=(String)(memorandosEnt.getCodigo_Empleado());
       if (cbotipomemorando.getSelectedIndex()==1){
          Tipo_Memorando="Leve";
          }else if (cbotipomemorando.getSelectedIndex()==2){
          Tipo_Memorando="Grave";	
          }else if (cbotipomemorando.getSelectedIndex()==3){
          Tipo_Memorando="Gravisimo";	
          }
       
      
       resultados = MemorandosDtos.PararUsuario(memorandosEnt);
       if(resultados){
       JOptionPane.showMessageDialog(this, "El Memorando Ha Sido Almacenado","Guardar",JOptionPane.INFORMATION_MESSAGE);
       Limpiar();
       }else{
       JOptionPane.showMessageDialog(this,"El Memorando Ya Fue Registrado. Por Favor Verifique Los Datos","Error", JOptionPane.ERROR_MESSAGE);
       }
       
        
    

       }//cierra valido.
    }
        if(e.getSource() == btnLimpiar){
            Limpiar();
        }else if(e.getSource() == btnSalir){
            dispose();
            frmRectoria menurec = new frmRectoria();
            menurec.setVisible(true);
        }
    }
}
