package AudoteInterface;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Window.Type;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.JPasswordField;
import java.sql.*;



public class TelaLogin {
	
	private JFrame frmTelaDeLogin;
	private JTextField textLogin;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmTelaDeLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeLogin = new JFrame();
		frmTelaDeLogin.setType(Type.POPUP);
		frmTelaDeLogin.setResizable(false);
		frmTelaDeLogin.setBackground(new Color(255, 255, 255));
		frmTelaDeLogin.setTitle("Tela de Login");
		frmTelaDeLogin.setBounds(100, 100, 500, 450);
		frmTelaDeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 0, 484, 412);
		frmTelaDeLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblEmail.setBounds(114, 155, 77, 25);
		panel.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblSenha.setBounds(114, 215, 77, 25);
		panel.add(lblSenha);
		
		textLogin = new JTextField();
		textLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textLogin.setBounds(231, 155, 125, 25);
		panel.add(textLogin);
		textLogin.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setFocusPainted(false);
		btnEntrar.setBackground(new Color(224, 255, 255));
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textLogin.getText().equals("isa") && textSenha.getText().equals("123")) {
					JOptionPane.showMessageDialog(null, "Seja bem vindo(a)!");
					TelaMenu telaMenu = new TelaMenu();
					telaMenu.frmTelaDeMenu.setVisible(true);
					frmTelaDeLogin.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados incorretos!");
				}
			}
			
		});
		btnEntrar.setBounds(155, 296, 170, 41);
		panel.add(btnEntrar);
		
		JLabel LogoAudote = new JLabel("");
		LogoAudote.setIcon(new ImageIcon("C:\\Users\\htsis001t\\Downloads\\pixil-frame-0.png"));
		LogoAudote.setBounds(126, 35, 224, 50);
		panel.add(LogoAudote);
		
		JButton btnCriarConta = new JButton("CRIAR CONTA");
		btnCriarConta.setBackground(new Color(224, 255, 255));
		btnCriarConta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCriarConta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro().setVisible(true);
			}
		});
		
		btnCriarConta.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnCriarConta.setBounds(178, 353, 130, 25);
		panel.add(btnCriarConta);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(231, 215, 125, 25);
		panel.add(textSenha);
	}
}
