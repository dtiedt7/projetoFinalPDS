package projetoFinalPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Tela Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbUsuario.setBounds(50, 31, 46, 14);
		contentPane.add(lbUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(106, 29, 121, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(106, 72, 121, 20);
		contentPane.add(tfSenha);
		tfSenha.setColumns(10);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbSenha.setBounds(50, 75, 46, 14);
		contentPane.add(lbSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Usuario usuario = new Usuario(tfUsuario.getText(), tfSenha.getText());	
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(96, 206, 89, 23);
		contentPane.add(btnNewButton);

	}
}
