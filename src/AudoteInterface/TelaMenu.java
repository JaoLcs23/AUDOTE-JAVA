package AudoteInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class TelaMenu {

	public JFrame frmTelaDeMenu;
	private JButton btnAdotarHamster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
					window.frmTelaDeMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeMenu = new JFrame();
		frmTelaDeMenu.setResizable(false);
		frmTelaDeMenu.setTitle("Tela de Menu");
		frmTelaDeMenu.setBounds(100, 100, 500, 450);
		frmTelaDeMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeMenu.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 0, 484, 412);
		frmTelaDeMenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel barraMenu = new JPanel();
		barraMenu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		barraMenu.setBackground(new Color(0, 128, 128));
		barraMenu.setBounds(0, 0, 484, 50);
		panel.add(barraMenu);
		barraMenu.setLayout(null);
		
		JLabel LogoAudote = new JLabel("New label");
		LogoAudote.setIcon(new ImageIcon("pixil-frame-0.png"));
		LogoAudote.setBounds(0, 0, 224, 50);
		barraMenu.add(LogoAudote);
		
		JButton btnPerfil = new JButton("PERFIL");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPerfilUsuario telaPerfilUsuario = new TelaPerfilUsuario();
				telaPerfilUsuario.frmTelaDePerfil.setVisible(true);
				frmTelaDeMenu.dispose();
			}
		});
		btnPerfil.setFocusPainted(false);
		btnPerfil.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setBackground(new Color(0, 128, 128));
		btnPerfil.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnPerfil.setBounds(389, 0, 95, 50);
		barraMenu.add(btnPerfil);
		
		JLabel Frase1 = new JLabel("Adote um animal hoje!");
		Frase1.setHorizontalAlignment(SwingConstants.CENTER);
		Frase1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		Frase1.setBounds(0, 47, 484, 50);
		panel.add(Frase1);
		
		JButton btnAdotarGato = new JButton("Gato");
		btnAdotarGato.setBackground(new Color(224, 255, 255));
		btnAdotarGato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdotarGato.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAdotarGato.setFocusPainted(false);
		btnAdotarGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdotarGato telaAdotarGato = new TelaAdotarGato();
				telaAdotarGato.frmTelaAdotarGato.setVisible(true);
				frmTelaDeMenu.dispose();
			}
		});
		btnAdotarGato.setBounds(244, 187, 100, 100);
		panel.add(btnAdotarGato);
		
		JButton btnAdotarCachorro = new JButton("Cachorro");
		btnAdotarCachorro.setBackground(new Color(224, 255, 255));
		btnAdotarCachorro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdotarCachorro.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAdotarCachorro.setFocusPainted(false);
		btnAdotarCachorro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAdotarCachorro telaAdotarCachorro = new TelaAdotarCachorro();
				telaAdotarCachorro.frmTelaAdotarCachorro.setVisible(true);
				frmTelaDeMenu.dispose();
			}
		});
		btnAdotarCachorro.setBounds(134, 187, 100, 100);
		panel.add(btnAdotarCachorro);
		
		btnAdotarHamster = new JButton("Hamster");
		btnAdotarHamster.setBackground(new Color(224, 255, 255));
		btnAdotarHamster.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdotarHamster.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAdotarHamster.setFocusPainted(false);
		btnAdotarHamster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdotarHamster.setBounds(79, 298, 100, 100);
		panel.add(btnAdotarHamster);
		
		JButton btnAdotarAve = new JButton("Ave");
		btnAdotarAve.setBackground(new Color(224, 255, 255));
		btnAdotarAve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdotarAve.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAdotarAve.setFocusPainted(false);
		btnAdotarAve.setBounds(299, 298, 110, 100);
		panel.add(btnAdotarAve);
		
		JButton btnAdotarCoelho = new JButton("Coelho");
		btnAdotarCoelho.setBackground(new Color(224, 255, 255));
		btnAdotarCoelho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdotarCoelho.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAdotarCoelho.setFocusPainted(false);
		btnAdotarCoelho.setBounds(189, 298, 100, 100);
		panel.add(btnAdotarCoelho);
		
		JLabel Frase2 = new JLabel("Qual animal você deseja adotar?");
		Frase2.setHorizontalAlignment(SwingConstants.CENTER);
		Frase2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		Frase2.setBounds(0, 153, 484, 23);
		panel.add(Frase2);
		
		JLabel Patinha = new JLabel("New label");
		Patinha.setIcon(new ImageIcon("pixil-frame-0.png"));
		Patinha.setBounds(425, 362, 49, 50);
		panel.add(Patinha);
		
		JLabel Patinha2 = new JLabel("New label");
		Patinha2.setIcon(new ImageIcon("pixil-frame-0.png"));
		Patinha2.setBounds(10, 362, 49, 50);
		panel.add(Patinha2);
	}
}

