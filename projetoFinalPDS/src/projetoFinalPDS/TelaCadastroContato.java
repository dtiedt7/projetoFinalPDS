package projetoFinalPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroContato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroContato frame = new TelaCadastroContato();
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
	public TelaCadastroContato() {
		setTitle("Cadastrar Contato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbNome.setBounds(38, 54, 37, 15);
		contentPane.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(94, 52, 110, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbTelefone.setBounds(38, 92, 64, 14);
		contentPane.add(lbTelefone);
		
		textField = new JTextField();
		textField.setBounds(94, 90, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(94, 129, 110, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbEmail.setBounds(38, 131, 46, 14);
		contentPane.add(lbEmail);
		
		JButton btAdicionar = new JButton("Adicionar");
		btAdicionar.setBounds(26, 188, 89, 23);
		contentPane.add(btAdicionar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.setBounds(157, 188, 89, 23);
		contentPane.add(btExcluir);

	}
}
