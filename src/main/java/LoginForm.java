import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTxt;
    private JPasswordField passTxt;
    private JButton ingresarButton;

    public LoginForm(){
        inicializar();
        ingresarButton.addActionListener(e -> {
            validar();
        });
    }

    private void validar(){
        String usuario = this.usuarioTxt.getText();
        String pass = new String(this.passTxt.getPassword());
        if(usuario.equals("admin") && pass.equals("password")){
            mostrarMensaje("Datos correctos, ¡Bienvenido!");
        } else if (usuario.equals("root")) {
            mostrarMensaje("Contraseña incorrecta");
        }else{
            mostrarMensaje("Usuario incorrecto");
        }
    }

    private void mostrarMensaje(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }

    private void inicializar(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm lf1 = new LoginForm();
        lf1.setVisible(true);
    }
}
