package Formularios;

import java.awt.event.*;
import javax.swing.*;
import Modelo.*;


public final class frmMatriculas extends JFrame implements ActionListener {
    
    JLabel lblCod_Matricula, lblNombres_Estudiante, lblApellidos_Estudiante, lblPerfil_Estudiante, lblEstado, lblGenero_Estudiante, lblEmail_Estudiante, lblTipoDocumento, lblNumeroDocumento, lblObligatorio;
    JTextField txtCod_Matricula, txtNombres_Estudiante, txtApellidos_Estudiante, txtEmail_Estudiante, txtNumeroDocumento;
    JComboBox cboPerfil_Estudiante, cboTipoDocumento;
    JRadioButton rbtnActivo, rbtnInactivo, rbtnMasculino, rbtnFemenino, rbtnTrans;
    ButtonGroup rdbtnGrupoEstado, rdbtnGrupoGenero;
    JButton btnSiguiente, btnLimpiar, btnGuardar, btnBuscar, btnActualizar, btnSalir, btnEliminar;
    String Obligatorio = "(*) = Campos Obligatorios";
    
    public frmMatriculas(){
        setTitle("Matricula De Estudiantes"); //Titulo de la pantalla
        setSize(900, 500); //Tamaño de la venta
        setLocationRelativeTo(null); //Centra la pantalla
        setLayout(null); //Activa el ordenamiento manual de los elementos
        setVisible(true); //Activa el muestreo de la pantalla
        
        //Agregamos Contenido A Las Labels
        lblCod_Matricula = new JLabel("Cod Matricula *"); //Asigna el texto al label
        lblNombres_Estudiante = new JLabel("Nombres *");
        lblApellidos_Estudiante = new JLabel("Apellidos *");
        lblPerfil_Estudiante = new JLabel("Perfil *");
        lblEstado = new JLabel("Estado *");
        lblGenero_Estudiante = new JLabel("Genero *");
        lblEmail_Estudiante = new JLabel("Correo");
        lblTipoDocumento = new JLabel("Tipo De Documento *");
        lblNumeroDocumento = new JLabel("Numero De Documento *");
        lblObligatorio = new JLabel(Obligatorio);
        
        txtCod_Matricula= new JTextField();
        txtNombres_Estudiante= new JTextField();
        txtApellidos_Estudiante= new JTextField();
        txtEmail_Estudiante= new JTextField();
        txtNumeroDocumento= new JTextField();
        
        cboPerfil_Estudiante = new JComboBox();
        cboPerfil_Estudiante.addItem("Seleccione Una Opciòn");
        cboPerfil_Estudiante.addItem("Alumno");
        cboPerfil_Estudiante.addItem("Egresado");
        
        cboTipoDocumento = new JComboBox();
        cboTipoDocumento.addItem("Seleccione Una Opciòn");
        cboTipoDocumento.addItem("Cedula");
        cboTipoDocumento.addItem("Tarjeta De Identidad");
        cboTipoDocumento.addItem("Cedula De Extranjeria");
        cboTipoDocumento.addItem("Pasaporte");
        cboTipoDocumento.addItem("Registro Civil");
        cboTipoDocumento.addItem("Nit");
        
        //Agregamos RadioButtons
        rbtnActivo = new JRadioButton("Matriculado");
        rbtnActivo.setBorderPainted(true);
        rbtnActivo.setOpaque(true);
        rbtnInactivo = new JRadioButton("Retirado");
        rbtnInactivo.setBorderPainted(true);
        rbtnInactivo.setOpaque(true);
        
        rdbtnGrupoEstado= new ButtonGroup();
        rdbtnGrupoEstado.add(rbtnActivo);
        rdbtnGrupoEstado.add(rbtnInactivo);
        
        rbtnMasculino = new JRadioButton("Masculino");
        rbtnMasculino.setBorderPainted(true);
        rbtnMasculino.setOpaque(true);
        rbtnFemenino = new JRadioButton("Femenino");
        rbtnFemenino.setBorderPainted(true);
        rbtnFemenino.setOpaque(true);
        rbtnTrans = new JRadioButton("Trans");
        rbtnTrans.setBorderPainted(true);
        rbtnTrans.setOpaque(true);
        
        rdbtnGrupoGenero = new ButtonGroup();
        rdbtnGrupoGenero.add(rbtnMasculino);
        rdbtnGrupoGenero.add(rbtnFemenino);
        rdbtnGrupoGenero.add(rbtnTrans);
        
        //Agregamos Contenido A Los Botones
        btnSiguiente = new JButton("Siguiente");
        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Cancelar");
        
        
        //Posicionamos Los Elementos Por Coordenadas
        lblCod_Matricula.setBounds(0,0,0,0);
        lblNombres_Estudiante.setBounds(0,0,0,0);
        lblApellidos_Estudiante.setBounds(0,0,0,0);
        lblPerfil_Estudiante.setBounds(0,0,0,0);
        lblEstado.setBounds(0,0,0,0);
        lblGenero_Estudiante.setBounds(0,0,0,0);
        lblEmail_Estudiante.setBounds(0,0,0,0);
        lblTipoDocumento.setBounds(0,0,0,0);
        lblNumeroDocumento.setBounds(0,0,0,0);
        lblObligatorio.setBounds(0,0,0,0);
        txtCod_Matricula.setBounds(0,0,0,0);
        txtNombres_Estudiante.setBounds(0,0,0,0);
        txtApellidos_Estudiante.setBounds(0,0,0,0);
        txtEmail_Estudiante.setBounds(0,0,0,0);
        txtNumeroDocumento.setBounds(0,0,0,0);
        cboPerfil_Estudiante.setBounds(0,0,0,0);
        cboTipoDocumento.setBounds(0,0,0,0);
        rbtnActivo.setBounds(0,0,0,0);
        rbtnInactivo.setBounds(0,0,0,0);
        rbtnMasculino.setBounds(0,0,0,0);
        rbtnFemenino.setBounds(0,0,0,0);
        rbtnTrans.setBounds(0,0,0,0);
        btnSiguiente.setBounds(0,0,0,0);
        btnGuardar.setBounds(0,0,0,0);
        btnBuscar.setBounds(0,0,0,0);
        btnActualizar.setBounds(0,0,0,0);
        btnEliminar.setBounds(0,0,0,0);
        btnLimpiar.setBounds(0,0,0,0);
        btnSalir.setBounds(710,310,100,25);
        
        
        //Ponemos Los Botones A Escuchar
        btnSiguiente.addActionListener(this);
        btnGuardar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnActualizar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnSalir.addActionListener(this);
        
        
        //Agregamos Los Elementos Al Formulario
        this.add(lblCod_Matricula);
        this.add(lblNombres_Estudiante);
        this.add(lblApellidos_Estudiante);
        this.add(lblPerfil_Estudiante);
        this.add(lblEstado);
        this.add(lblGenero_Estudiante);
        this.add(lblEmail_Estudiante);
        this.add(lblTipoDocumento);
        this.add(lblNumeroDocumento);
        this.add(lblObligatorio);
        this.add(txtCod_Matricula);
        this.add(txtNombres_Estudiante);
        this.add(txtApellidos_Estudiante);
        this.add(txtEmail_Estudiante);
        this.add(txtNumeroDocumento);
        this.add(cboPerfil_Estudiante);
        this.add(cboTipoDocumento);
        this.add(rbtnActivo);
        this.add(rbtnInactivo);
        this.add(rbtnMasculino);
        this.add(rbtnFemenino);
        this.add(rbtnTrans);
        this.add(btnSiguiente);
        this.add(btnGuardar);
        this.add(btnBuscar);
        this.add(btnActualizar);
        this.add(btnEliminar);
        this.add(btnLimpiar);
        this.add(btnSalir);
        
    }
    
    public void limpiar() { //Método que permite limpiar todos los campos de un solo golpe.
        txtCod_Matricula.setText("");
        txtNombres_Estudiante.setText("");
        txtApellidos_Estudiante.setText("");
        txtEmail_Estudiante.setText("");
        cboPerfil_Estudiante.setSelectedIndex(0);
        rdbtnGrupoEstado.clearSelection();
        rdbtnGrupoGenero.clearSelection();
        cboTipoDocumento.setSelectedIndex(0);
        txtNumeroDocumento.setText("");
    }
    
    public static void main(String[] args) {
        frmMatriculas frmmatriculas = new frmMatriculas();
        frmmatriculas.setVisible(true);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
     
        if (e.getSource() == btnLimpiar) { //si clic al botón de "limpiar"
            limpiar();
        }//cierra la programación de limpiar los campos

        if (e.getSource() == btnSalir) {
            dispose(); //cierra la ventana activa (en este caso salir).
            frmSecretaria menu = new frmSecretaria(); //instancia la clase frmPrincipal
            menu.setVisible(true); //abre el menú principal.
        }
    }
    
}
