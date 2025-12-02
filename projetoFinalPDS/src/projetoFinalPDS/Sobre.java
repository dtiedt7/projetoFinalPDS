package projetoFinalPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Sobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbVersao = new JLabel("Versão: 1.0");
		lbVersao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbVersao.setBounds(10, 11, 182, 25);
		contentPane.add(lbVersao);
		
		JLabel lbCriador = new JLabel("Desenvolvedor: Daniel Antonio Tiedt");
		lbCriador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbCriador.setBounds(10, 47, 369, 25);
		contentPane.add(lbCriador);
		
		JLabel lbInstituicao = new JLabel("Instituição: IFSC Gaspar");
		lbInstituicao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbInstituicao.setBounds(10, 83, 301, 25);
		contentPane.add(lbInstituicao);
		
		JLabel lbTurma = new JLabel("Turma: I5");
		lbTurma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTurma.setBounds(10, 119, 301, 25);
		contentPane.add(lbTurma);
		
		JLabel lblProfessora = new JLabel("Professora: Claudia (A melhor)");
		lblProfessora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProfessora.setBounds(10, 155, 291, 25);
		contentPane.add(lblProfessora);

	}
}
