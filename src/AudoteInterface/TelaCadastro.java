package AudoteInterface;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import AudoteClasseController.UsuarioController;
import AudoteClasseDAO.Conexao;
import AudoteClasseDAO.UsuarioDAO;
import AudoteClassesModel.Usuario;

public class TelaCadastro extends javax.swing.JFrame {
	
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textTelefone;
	private JTextField textCpf;
	private JTextField textEndereco;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnCriarConta;
	private JTextField textSenha;
	private JLabel lblNewLabel_5;
	private final UsuarioController controllerUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public TelaCadastro() {
		initialize();
		controllerUsuario = new UsuarioController(this);
	}
		
	public void initialize() {
		setResizable(false);
		setTitle("Tela de Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 0, 484, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(174, 22, 250, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(174, 54, 250, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(174, 113, 150, 20);
		panel.add(textTelefone);
		textTelefone.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(174, 144, 150, 20);
		panel.add(textCpf);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(174, 175, 100, 20);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(36, 25, 128, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(36, 57, 128, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(36, 113, 128, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(36, 144, 128, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Endereço:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(36, 175, 128, 14);
		panel.add(lblNewLabel_4);
		
		
		btnCriarConta = new JButton("CRIAR CONTA");
		btnCriarConta.setBackground(new Color(224, 255, 255));
		btnCriarConta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCriarConta.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
				
				controllerUsuario.cadastrarUsuario();
				
			}
		});
		
		btnCriarConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCriarConta.setBounds(163, 328, 150, 46);
		panel.add(btnCriarConta);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(174, 82, 250, 20);
		panel.add(textSenha);
		
		lblNewLabel_5 = new JLabel("Senha:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(36, 85, 128, 14);
		panel.add(lblNewLabel_5);
		

		
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	public JTextField getTextTelefone() {
		return textTelefone;
	}

	public void setTextTelefone(JTextField textTelefone) {
		this.textTelefone = textTelefone;
	}

	public JTextField getTextCpf() {
		return textCpf;
	}

	public void setTextCpf(JTextField textCpf) {
		this.textCpf = textCpf;
	}

	public JTextField getTextEndereco() {
		return textEndereco;
	}

	public void setTextEndereco(JTextField textEndereco) {
		this.textEndereco = textEndereco;
	}

	public JTextField getTextSenha() {
		return textSenha;
	}

	public void setTextSenha(JTextField textSenha) {
		this.textSenha = textSenha;
	}
	
	
}
