package Formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.table.DefaultTableModel;
import Modelo.EntUsuario;
import Modelo.UsuarioDtos;

public final class frmUsuario extends JFrame implements ActionListener {

    String Cod_Usuario;
    String Nombres;
    String Apellidos;
    String Clave;
    String Perfil;
    String Estado;
    String Genero;
    String Correo;
    String TipoDocumento;
    String NumeroDocumento;
    String NumeroContacto;
    
    // Declaramos los compnentes de la ventana
    JLabel lblCod_Usuario, lblNombres, lblApellidos, lblClave, lblConfirmar, lblPerfil, lblEstado, lblActivo, lblInactivo, lblGenero, lblObligatorios, lblEmail, lblTipoDocumento, lblNumeroDocumento, lblNumeroContacto, lblObligatorio;
    JTextField txtCod_Usuario, txtNombres, txtApellidos, txtEmail, txtNumeroDocumento, txtNumeroContacto;
    JPasswordField txtClave, txtConfirmar;
    JComboBox cboPerfil, cboTipoDocumento;
    JRadioButton rbtnActivo, rbtnInactivo, rbtnMasculino, rbtnFemenino, rbtnTrans;
    ButtonGroup rdbtnGrupoEstado, rdbtnGrupoGenero;
    JButton btnGuardar, btnBuscar, btnActualizar, btnEliminar, btnLimpiar, btnSalir;
    JTable tbDatos;
    JScrollPane pnDatos;
   
    String Obligatorio = "(*) = Campos Obligatorios";
    
    private final Object[][] Detalle_UsuarioDtos = new Object[0][0];
    private final Object[] Columnas_UsuarioDtos = {"Codigo_Usuario", "Nombres", "Apellidos", "Contraseña", "Tipo Cuenta", "Estado", "Genero", "Email", "Tipo Identificaciòn", "Numero Identificaciòn", "Numero Contacto"};
    private DefaultTableModel DataModel = new DefaultTableModel(Detalle_UsuarioDtos, Columnas_UsuarioDtos);
    
    public frmUsuario() {

        setTitle("Registro De Usuarios"); //Titulo de la pantalla
        setSize(900, 500); //Tamaño de la venta
        setLocationRelativeTo(null); //Centra la pantalla
        setLayout(null); //Activa el ordenamiento manual de los elementos
        setVisible(true); //Activa el muestreo de la pantalla

        lblCod_Usuario = new JLabel("Cod Usuario"); //Asigna el texto al label
        lblNombres = new JLabel("Nombres *");
        lblApellidos = new JLabel("Apellidos *");
        lblClave = new JLabel("Contraseña *");
        lblConfirmar = new JLabel("Confirmar *");
        lblPerfil = new JLabel("Perfil *");
        lblEstado = new JLabel("Estado *");
        lblGenero = new JLabel("Genero *");
        lblEmail = new JLabel("Correo");
        lblTipoDocumento = new JLabel("Tipo De Documento *");
        lblNumeroDocumento = new JLabel("Numero De Documento *");
        lblNumeroContacto = new JLabel("Numero De Contacto *");
        lblObligatorio = new JLabel(Obligatorio);
        
        //Agregamos Cajas De Texto
        txtCod_Usuario = new JTextField();
        txtNombres = new JTextField();
        txtApellidos = new JTextField();
        txtEmail = new JTextField();
        txtNumeroDocumento = new JTextField();
        txtNumeroContacto = new JTextField();

        //Asigmaos A Usuario Y Pass Encapsuladas
        txtClave = new JPasswordField();
        txtConfirmar = new JPasswordField();

        //Agregamos Opciones A Los Combobox
        cboPerfil = new JComboBox();
        cboPerfil.addItem("Seleccione Una Opciòn");
        cboPerfil.addItem("Administrador");
        cboPerfil.addItem("Rectora");
        cboPerfil.addItem("Secretaria");
        cboPerfil.addItem("Coordinador");
        cboPerfil.addItem("Docente");
        cboPerfil.addItem("Alumno");

        //Agregamos Opciones A Los Combobox
        cboTipoDocumento = new JComboBox();
        cboTipoDocumento.addItem("Seleccione Una Opciòn");
        cboTipoDocumento.addItem("Cedula");
        cboTipoDocumento.addItem("Tarjeta De Identidad");
        cboTipoDocumento.addItem("Cedula De Extranjeria");
        cboTipoDocumento.addItem("Pasaporte");
        cboTipoDocumento.addItem("Registro Civil");
        cboTipoDocumento.addItem("Nit");
        
        //Agregamos RadioButtons
        rbtnActivo = new JRadioButton("Activo");
        rbtnActivo.setBorderPainted(true);
        rbtnActivo.setOpaque(true);
        rbtnInactivo = new JRadioButton("Inactivo");
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
        
        //Crear Botones
        btnGuardar = new JButton("Guardar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Cancelar");

        //Agregamos Coordenadas A Cada Elemento (setBounds(DHorizontal,DVertical,ancho,alto))
        lblCod_Usuario.setBounds(30, 30, 90, 25);
        lblNombres.setBounds(30, 65, 90, 25);
        lblApellidos.setBounds(465, 65, 90, 25);
        lblClave.setBounds(30, 100, 90, 25);
        lblConfirmar.setBounds(465, 100, 90, 25);
        lblPerfil.setBounds(30, 135, 90, 25);
        lblEstado.setBounds(465, 135, 90, 25);
        lblGenero.setBounds(30, 180, 90, 25);
        lblEmail.setBounds(465, 175, 300, 25);
        lblTipoDocumento.setBounds(30, 220, 120, 25);
        lblNumeroDocumento.setBounds(465, 220, 150, 25);
        lblNumeroContacto.setBounds(30, 260, 125, 25);
        lblObligatorio.setBounds(465, 260, 190, 25);
        txtCod_Usuario.setBounds(110, 30, 120, 25);
        txtNombres.setBounds(110, 65, 300, 25);
        txtApellidos.setBounds(550, 65, 300, 25);
        txtEmail.setBounds(550, 175, 300, 25);
        txtNumeroDocumento.setBounds(630, 220, 155, 25);
        txtNumeroContacto.setBounds(170, 260, 150, 25);
        txtClave.setBounds(110, 100, 190, 25);
        txtConfirmar.setBounds(550, 100, 190, 25);
        cboPerfil.setBounds(110, 135, 190, 25);
        cboTipoDocumento.setBounds(160, 220, 180, 25);
        rbtnActivo.setBounds(550, 135, 80, 25);
        rbtnInactivo.setBounds(650, 135, 80, 25);
        rbtnMasculino.setBounds(110, 180, 100, 25);
        rbtnFemenino.setBounds(220, 180, 100, 25);
        rbtnTrans.setBounds(330, 180, 100, 25);
        btnGuardar.setBounds(60, 310, 100, 25);
        btnBuscar.setBounds(190, 310, 100, 25);
        btnActualizar.setBounds(320, 310, 100, 25);
        btnEliminar.setBounds(450, 310, 100, 25);
        btnLimpiar.setBounds(580, 310, 100, 25);
        btnSalir.setBounds(710, 310, 100, 25);
        
        //Ponemos Los Botones A Escuchar
        btnGuardar.addActionListener(this);
        btnEliminar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnSalir.addActionListener(this);

        this.add(lblCod_Usuario);
        this.add(lblNombres);
        this.add(lblApellidos);
        this.add(lblClave);
        this.add(lblConfirmar);
        this.add(lblPerfil);
        this.add(lblEstado);
        this.add(lblGenero);
        this.add(lblEmail);
        this.add(lblTipoDocumento);
        this.add(lblNumeroDocumento);
        this.add(lblNumeroContacto);
        this.add(lblObligatorio);
        this.add(txtCod_Usuario);
        this.add(txtNombres);
        this.add(txtApellidos);
        this.add(txtEmail);
        this.add(txtNumeroDocumento);
        this.add(txtNumeroContacto);
        this.add(txtClave);
        this.add(txtConfirmar);
        this.add(cboPerfil);
        this.add(cboTipoDocumento);
        this.add(rbtnActivo);
        this.add(rbtnInactivo);
        this.add(rbtnMasculino);
        this.add(rbtnFemenino);
        this.add(rbtnTrans);
        this.add(btnGuardar);
        this.add(btnBuscar);
        this.add(btnActualizar);
        this.add(btnEliminar);
        this.add(btnLimpiar);
        this.add(btnSalir);
        tbDatos=new JTable(DataModel);
        tbDatos.setOpaque(false);
        pnDatos= new JScrollPane(tbDatos);
        pnDatos.setOpaque(false);
        pnDatos.setBounds(30, 350, 825, 100);
        this.getContentPane().add(pnDatos);
        pnDatos.setVisible(true);
        llenarDatos();
        this.repaint();
    }

    public void limpiar() { //Método que permite limpiar todos los campos de un solo golpe.
        txtCod_Usuario.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirmar.setText("");
        txtEmail.setText("");
        cboPerfil.setSelectedIndex(0);
        rdbtnGrupoEstado.clearSelection();
        rdbtnGrupoGenero.clearSelection();
        cboTipoDocumento.setSelectedIndex(0);
        txtNumeroDocumento.setText("");
        txtNumeroContacto.setText("");
    }

    public boolean validarCampos() {  //OJO importante para la validación de Campos.
        boolean resp = true;

        //asignamos los datos de los campos a unas variables de tipo String
        String Cod_Usuario = txtCod_Usuario.getText();
        String Nombres = txtNombres.getText();
        String Apellidos = txtApellidos.getText();
        String Clave = new String(txtClave.getPassword());
        String Confirmar = new String(txtConfirmar.getPassword());
        String Estado = "";
        String Email = txtEmail.getText();
        String Genero = "";
        String NumeroDocumento = txtNumeroDocumento.getText();
        String NumeroContacto = txtNumeroContacto.getText();

        if (Cod_Usuario.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese El Usuario", "Campo Usuario", JOptionPane.ERROR_MESSAGE);
            resp = txtCod_Usuario.requestFocusInWindow();
            return resp;
        }

        if (Cod_Usuario.trim().length() < 3 || Cod_Usuario.trim().length() > 20) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres "
                    + "Y Máximo 20", "Campo Usuario (Obligatorio)", JOptionPane.ERROR_MESSAGE);
            txtCod_Usuario.setText("");
            txtCod_Usuario.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (Nombres.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor Ingrese el Nombre", "Campo Nombres", JOptionPane.ERROR_MESSAGE);
            resp = txtNombres.requestFocusInWindow();
            return resp;
        }

        if (Nombres.trim().length() < 3 || Cod_Usuario.trim().length() > 20) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres "
                    + "Y Máximo 20", "Campo Nombres", JOptionPane.ERROR_MESSAGE);
            txtNombres.setText("");
            txtNombres.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (Apellidos.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese El(Los) Apellido(s)", "Campo Apellidos", JOptionPane.ERROR_MESSAGE);
            resp = txtApellidos.requestFocusInWindow();
            return resp;
        }

        if (Apellidos.trim().length() < 3 || Apellidos.trim().length() > 20) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres "
                    + "Y Máximo 20", "Campo Apellidos", JOptionPane.ERROR_MESSAGE);
            txtApellidos.setText("");
            txtApellidos.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (Clave.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese La Clave", "Campo Contraseña", JOptionPane.ERROR_MESSAGE);
            txtClave.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (Clave.trim().length() < 4 || Clave.trim().length() > 16) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 4 Caracteres "
                    + "Y Máximo 16", "Campo Contraseña", JOptionPane.ERROR_MESSAGE);
            txtClave.setText("");
            txtClave.requestFocusInWindow();
            resp = false;
            return resp;
        }

        if (Confirmar.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Confirme La Contraseña", "Campo Confirmar Contraseña", JOptionPane.ERROR_MESSAGE);
            resp = txtConfirmar.requestFocusInWindow();
            return resp;
        }

        //Verificar que la clave y Confirmar clave son iguales.
        if (!Clave.equals(Confirmar)) {
            JOptionPane.showMessageDialog(this, "Los Campos \"Clave\" Y \"Confirmar Clave\" No Son Iguales, Por Favor Verifique Ambos Campos", "Campos Contraseña y Confirmar", JOptionPane.ERROR_MESSAGE);
            txtClave.setText("");
            txtConfirmar.setText("");
            resp = txtClave.requestFocusInWindow();
            return resp;
        }

        if (cboPerfil.getSelectedItem() == "Seleccione Una Opciòn") {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Perfil", "Campo Perfil", JOptionPane.WARNING_MESSAGE);
            cboPerfil.requestFocusInWindow();
            resp = false;
            return resp;
        }
        

        //verificamos que le de clic a un radio button, el código es igual para los JCheckBox
        if (rbtnActivo.isSelected()) {
            Estado = "Activo";
        } else if (rbtnInactivo.isSelected()) {
            Estado = "Inactivo";
        }

        if (Estado == "") {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Estado", "Campo Estado", JOptionPane.WARNING_MESSAGE);
            cboPerfil.requestFocusInWindow();
            resp = false;
            return resp;
        }
        
        if (rbtnMasculino.isSelected()) {
            Genero = "Masculino";
        } else if (rbtnFemenino.isSelected()) {
            Genero = "Femenino";
        }else if (rbtnTrans.isSelected()) {
            Genero = "Trans";
        }
        
        if (Genero == "") {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Genero", "Campo Genero", JOptionPane.WARNING_MESSAGE);
            cboPerfil.requestFocusInWindow();
            resp = false;
            return resp;
        }

        //Validamos el campo "email"
        boolean validoEmail = false;
        validoEmail = esEmailCorrecto(Email); //llamamos al método (esEmailCorrecto)
        if (validoEmail == false) {
            JOptionPane.showMessageDialog(null, "El Correo Es Invalido, Por Favor Verifique De Nuevo", "Campo Correo Electrónico", JOptionPane.ERROR_MESSAGE);
            txtEmail.requestFocusInWindow();
            resp = false;
            return resp;
        }
        
        if (cboTipoDocumento.getSelectedItem() == "Seleccione Una Opciòn") {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Tipo", "Campo Tipo Documento", JOptionPane.WARNING_MESSAGE);
            cboTipoDocumento.requestFocusInWindow();
            resp = false;
            return resp;
        }
        
       if (NumeroDocumento.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese el Numero De Documento", "Campo Numero De Documento", JOptionPane.ERROR_MESSAGE);
            resp = txtNumeroDocumento.requestFocusInWindow();
            return resp;
        }

        if (NumeroDocumento.trim().length() < 3 || Cod_Usuario.trim().length() > 15) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres "
                    + "Y Máximo 20", "Campo Numero De Documento", JOptionPane.ERROR_MESSAGE);
            txtNumeroDocumento.setText("");
            txtNumeroDocumento.requestFocusInWindow();
            resp = false;
            return resp;
        }
        
        if (NumeroContacto.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese El Nombre", "Campo Numero De Contacto", JOptionPane.ERROR_MESSAGE);
            resp = txtNumeroContacto.requestFocusInWindow();
            return resp;
        }

        if (NumeroContacto.trim().length() < 3 || Cod_Usuario.trim().length() > 15) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Mínimo 3 Caracteres "
                    + "Y Máximo 20", "Campo Numero De Contacto", JOptionPane.ERROR_MESSAGE);
            txtNumeroContacto.setText("");
            txtNumeroContacto.requestFocusInWindow();
            resp = false;
            return resp;
        }

        //Verificamos que la clave y confirmar sean de tipo numérico

           return resp;
       }


    public static boolean esEmailCorrecto(String email) {

        boolean valido = false;
        Pattern patronEmail = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher mEmail = patronEmail.matcher(email.toLowerCase());
        if (mEmail.matches()) {
            valido = true;
        }
        return valido;
    }

    
    public static void main(String[] args) {
        frmUsuario frmusuarios = new frmUsuario();
        frmusuarios.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        EntUsuario UsuarioEnt= new EntUsuario();
        UsuarioDtos UsuarioDtos = new UsuarioDtos();
        boolean resultados;
        
        boolean valido;

        if (e.getSource() == btnGuardar) {  //si clic al botón "guardar"

            valido=validarCampos();
            
        if(valido){
            
        UsuarioEnt.setCod_Usuario(Cod_Usuario);
        UsuarioEnt.setNombres(Nombres);
        UsuarioEnt.setApellidos(Apellidos);
        UsuarioEnt.setClave(Clave);					
        UsuarioEnt.setPerfil(Perfil);
        UsuarioEnt.setEstado(Estado);
        UsuarioEnt.setGenero(Genero);
        UsuarioEnt.setCorreo(Correo);
        UsuarioEnt.setTipoDocumento(TipoDocumento);
        UsuarioEnt.setNumeroDocumento(NumeroDocumento);
        UsuarioEnt.setNumeroContacto(NumeroContacto);
        
        Perfil=(String)(UsuarioEnt.getPerfil());
       if (cboPerfil.getSelectedIndex()==1){
          Perfil="Administrador";
          }else if (cboPerfil.getSelectedIndex()==2){
          Perfil="Rectora";	
          }else if (cboPerfil.getSelectedIndex()==3){
          Perfil="Secretaria";	
          }else if (cboPerfil.getSelectedIndex()==4){
          Perfil="Coordinaciòn";	
          }else if (cboPerfil.getSelectedIndex()==5){
          Perfil="Docente";	
          }else if (cboPerfil.getSelectedIndex()==6) {
          Perfil="Alumno";	
          }
       
       Estado=(String)(UsuarioEnt.getEstado());
       if (rbtnActivo.isSelected()){
       Estado="Activo";
       rbtnInactivo.isFocusable(); //activa esa casilla.
       }else{
       Estado="Inactivo";
       rbtnActivo.isFocusable(); //activa esa casilla
       }
       
       Genero=(String)(UsuarioEnt.getGenero());
       if (rbtnMasculino.isSelected()){
       Genero="Masculino";
       rbtnMasculino.isFocusable(); //activa esa casilla.
       }else if(rbtnFemenino.isSelected()){
       Genero="Femenino";
       rbtnFemenino.isFocusable(); //activa esa casilla
       }else if (rbtnTrans.isSelected()){
       Genero="Trans";
       rbtnTrans.isFocusable(); //activa esa casilla
       }
       
       
       resultados = UsuarioDtos.GuardarUsuario(UsuarioEnt);
       if(resultados){
       JOptionPane.showMessageDialog(this, "El usuario Ha Sido Almacenado","Guardar",JOptionPane.INFORMATION_MESSAGE);
       limpiar();
       }else{
       JOptionPane.showMessageDialog(this,"El Usuario Ya Fue Registrado. Por Favor Verifique Los Datos","Error", JOptionPane.ERROR_MESSAGE);
       }
       
        if(e.getSource() == btnBuscar){
            Cod_Usuario=txtCod_Usuario.getText(); //Seria el campo código por ejemplo.
      UsuarioEnt.setCod_Usuario(Cod_Usuario);
      UsuarioEnt=UsuarioDtos.buscarUsuarioCodigo(Cod_Usuario);
      if(UsuarioEnt!=null){
      txtCod_Usuario.setText(UsuarioEnt.getCod_Usuario()); //Verificar que este campo sea código.
      txtNombres.setText(UsuarioEnt.getNombres());
      txtApellidos.setText(UsuarioEnt.getApellidos());
      txtClave.setText(UsuarioEnt.getClave());
      txtEmail.setText(UsuarioEnt.getCorreo());
      
      Perfil= (String)(UsuarioEnt.getPerfil());                                                
      if(Perfil.equals("Admin")){
        cboPerfil.setSelectedIndex(1);
        }if(Perfil.equals("Admin")){
        cboPerfil.setSelectedIndex(2);
        }      
      
       Estado= (String)(UsuarioEnt.getEstado());                                                
       if(Estado.equals("Activo")){
       rbtnActivo.setSelected(true);
       }else{
       rbtnInactivo.setSelected(true);
       }
      
      }
       else{
       JOptionPane.showMessageDialog(this,"El Usuario no fue encontrado","Error", JOptionPane.ERROR_MESSAGE);
       }
        }
    

            }//cierra valido.
        }//cierra la programación de guardar

        if (e.getSource() == btnLimpiar) { //si clic al botón de "limpiar"
            limpiar();
        }//cierra la programación de limpiar los campos

        if (e.getSource() == btnSalir) {
            dispose(); //cierra la ventana activa (en este caso salir).
            frmMenuAdmin menu = new frmMenuAdmin(); //instancia la clase frmPrincipal
            menu.setVisible(true); //abre el menú principal.
        }
        vaciar();
        llenarDatos();
    }//cierra el método ActionPerfomed().

         public void llenarDatos() {
	        UsuarioDtos usuarioDtos = new UsuarioDtos();
	        setDataModel(usuarioDtos.CargarUsuario(DataModel));
	       // jTable1.getModel().
     }
     
     public void vaciar(){
	        int i = getDataModel().getRowCount();
	        while(i>0){
	            getDataModel().removeRow(0);
	             i--;
	        }
    }

     public void setDataModel(DefaultTableModel DataModel) {
	        this.DataModel = DataModel;
     }
	
	   public DefaultTableModel getDataModel() {
	
	       return DataModel;
	    }
}
