package AudoteInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPerfilUsuario {

	public JFrame frmTelaDePerfil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPerfilUsuario window = new TelaPerfilUsuario();
					window.frmTelaDePerfil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPerfilUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDePerfil = new JFrame();
		frmTelaDePerfil.setTitle("Tela de Perfil");
		frmTelaDePerfil.setBounds(100, 100, 500, 450);
		frmTelaDePerfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDePerfil.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 0, 484, 412);
		frmTelaDePerfil.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel barraMenu = new JPanel();
		barraMenu.setLayout(null);
		barraMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		barraMenu.setBackground(new Color(0, 128, 128));
		barraMenu.setBounds(0, 0, 484, 50);
		panel.add(barraMenu);
		
		JLabel LogoAudote = new JLabel("");
		LogoAudote.setIcon(new ImageIcon("C:\\Users\\htsis001t\\Downloads\\pixil-frame-0.png"));
		LogoAudote.setBounds(0, 0, 224, 50);
		barraMenu.add(LogoAudote);
		
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu telaMenu = new TelaMenu();
				telaMenu.frmTelaDeMenu.setVisible(true);
				frmTelaDePerfil.dispose();
			}
		});
		btnMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnMenu.setFocusPainted(false);
		btnMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnMenu.setBackground(new Color(0, 128, 128));
		btnMenu.setBounds(389, 0, 95, 50);
		barraMenu.add(btnMenu);
	}

}