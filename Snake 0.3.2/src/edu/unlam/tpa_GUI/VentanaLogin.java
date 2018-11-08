package edu.unlam.tpa_GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2110542286099254457L;
	
	private JTextField txtUsuario;
	private JPasswordField pwdContrase�a;
	
	public VentanaLogin() {
		getContentPane().setLayout(null);
		setResizable(false);
		setBounds(100, 100, 450, 230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Unite a nuestra comunidad...");
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBackground(Color.GRAY);
		lblUsuario.setToolTipText("");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		lblUsuario.setBounds(64, 37, 79, 33);
		getContentPane().add(lblUsuario);
		
		JLabel lblContrase�a = new JLabel("Contrase\u00F1a");
		lblContrase�a.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrase�a.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		lblContrase�a.setBounds(44, 81, 122, 33);
		getContentPane().add(lblContrase�a);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(186, 43, 170, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pwdContrase�a = new JPasswordField();
		pwdContrase�a.setBounds(186, 87, 170, 20);
		getContentPane().add(pwdContrase�a);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreUsuario = txtUsuario.getText();
				if(!nombreUsuario.isEmpty()) {
					setVisible(false);
					new VentanaLooby(txtUsuario.getText()).setVisible(true);
				}
				else {
					mostrarWarning();
				}
			}
		});
		btnIniciarSesion.setBounds(91, 161, 104, 23);
		getContentPane().add(btnIniciarSesion);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(235, 161, 104, 23);
		btnRegistrarse.setEnabled(false); // Inicialmente no va a estar disponible
		getContentPane().add(btnRegistrarse);
		
		setLocationRelativeTo(null);
	}

	private void mostrarWarning() {
		JOptionPane.showConfirmDialog(this, "Debe ingresar un usuario", "ADVERTENCIA", JOptionPane.CLOSED_OPTION);
	}
	
	public static void main(String args[]) {
		new VentanaLogin().setVisible(true);
	}
}
