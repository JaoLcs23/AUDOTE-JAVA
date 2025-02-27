package AudoteInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class TelaAdotarCachorro {

	public JFrame frmTelaAdotarCachorro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdotarCachorro window = new TelaAdotarCachorro();
					window.frmTelaAdotarCachorro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAdotarCachorro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaAdotarCachorro = new JFrame();
		frmTelaAdotarCachorro.setResizable(false);
		frmTelaAdotarCachorro.setTitle("Tela adotar cachorro");
		frmTelaAdotarCachorro.getContentPane().setBackground(new Color(32, 178, 170));
		frmTelaAdotarCachorro.setBounds(100, 100, 500, 450);
		frmTelaAdotarCachorro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaAdotarCachorro.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 0, 484, 412);
		frmTelaAdotarCachorro.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTodosOsCachorros = new JLabel("Todos os cachorros disponíveis");
		lblTodosOsCachorros.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTodosOsCachorros.setToolTipText("");
		lblTodosOsCachorros.setBounds(0, 64, 484, 28);
		lblTodosOsCachorros.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodosOsCachorros.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(lblTodosOsCachorros);
		
		JPanel barraMenu = new JPanel();
		barraMenu.setBounds(0, 0, 484, 50);
		panel.add(barraMenu);
		barraMenu.setLayout(null);
		barraMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		barraMenu.setBackground(new Color(0, 128, 128));
		
		JLabel LogoAudote = new JLabel("");
		LogoAudote.setIcon(new ImageIcon("C:\\Users\\htsis001t\\Downloads\\pixil-frame-0.png"));
		LogoAudote.setBounds(0, 0, 224, 50);
		barraMenu.add(LogoAudote);
		
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu telaMenu = new TelaMenu();
				telaMenu.frmTelaDeMenu.setVisible(true);
				frmTelaAdotarCachorro.dispose();
			}
		});
		btnMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnMenu.setFocusPainted(false);
		btnMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnMenu.setBackground(new Color(0, 128, 128));
		btnMenu.setBounds(389, 0, 95, 50);
		barraMenu.add(btnMenu);
		
		JLabel lblParaDoaoEsto = new JLabel("para doação estão listados abaixo! :)");
		lblParaDoaoEsto.setToolTipText("");
		lblParaDoaoEsto.setHorizontalTextPosition(SwingConstants.CENTER);
		lblParaDoaoEsto.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaDoaoEsto.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblParaDoaoEsto.setBounds(0, 90, 484, 28);
		panel.add(lblParaDoaoEsto);
	}
}