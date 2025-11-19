package projetoFinalPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProdutos frame = new TelaProdutos();
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
	public TelaProdutos() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 199, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btNovoCtt = new JButton("Novo Contato");
		btNovoCtt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btNovoCtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btNovoCtt.setBounds(10, 11, 160, 23);
		contentPane.add(btNovoCtt);
		
		JButton btVisualizarCtt = new JButton("Visualizar Contatos");
		btVisualizarCtt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btVisualizarCtt.setBounds(10, 45, 160, 23);
		contentPane.add(btVisualizarCtt);
		
		JButton btSair = new JButton("Sair");
		btSair.setBounds(43, 79, 89, 23);
		contentPane.add(btSair);

	}

}
