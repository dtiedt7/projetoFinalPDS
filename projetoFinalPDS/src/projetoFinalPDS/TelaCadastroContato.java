package projetoFinalPDS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class TelaCadastroContato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTable tabela;

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
		setBounds(100, 100, 737, 353);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre telasobre = new Sobre();
				telasobre.setVisible(true);
			}
		});
		mnSobre.add(mntmSobre);
		
		JMenu mnEstatisticas = new JMenu("Estatisticas");
		menuBar.add(mnEstatisticas);
		
		JMenuItem mntmEstatisticas = new JMenuItem("Estatisticas");
		mntmEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

			Estatisticas est = new Estatisticas(modelo);

			TelaEstatisticas telaest = new TelaEstatisticas(est);
			telaest.setVisible(true);
				
			}
		});
		mnEstatisticas.add(mntmEstatisticas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false); //bloqueia redimensionar a tela
		setLocationRelativeTo(null); //tela centralizada
		
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
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(94, 90, 110, 20);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(94, 129, 110, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbEmail.setBounds(38, 131, 46, 14);
		contentPane.add(lbEmail);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(281, 11, 415, 274);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Telefone", "Email", "Tipo", "Favorito"
			}
		));
		scrollPane.setViewportView(tabela);
		
		JCheckBox cboxFavorito = new JCheckBox("Favorito");
		cboxFavorito.setBounds(94, 219, 97, 23);
		contentPane.add(cboxFavorito);
		
		JRadioButton rbProfissional = new JRadioButton("Profissional");
		rbProfissional.setBounds(38, 173, 100, 23);
		contentPane.add(rbProfissional);
		
		JRadioButton rbPessoal = new JRadioButton("Pessoal");
		rbPessoal.setBounds(140, 173, 109, 23);
		contentPane.add(rbPessoal);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbPessoal);
		grupo.add(rbProfissional);
		
		JButton btAdicionar = new JButton("Adicionar");
		btAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

			    String nome = tfNome.getText();
			    String telefone = tfTelefone.getText();
			    String email = tfEmail.getText();

			    String tipo = "";
			    if (rbProfissional.isSelected()) {
			        tipo = "Profissional";
			    } else if (rbPessoal.isSelected()) {
			        tipo = "Pessoal";
			    }
			    
			    String favorito;

			    if (cboxFavorito.isSelected()) {
			    	favorito = "Sim";
			    } else {
			    	favorito = "Não";
			    }

			    Object[] linha = new Object[]{nome, telefone, email, tipo, favorito};
			    modelo.addRow(linha);

			    tfNome.setText("");
			    tfTelefone.setText("");
			    tfEmail.setText("");
			    grupo.setSelected(null,false);
			    cboxFavorito.setSelected(false); 
				
			}
	
		});
		btAdicionar.setBounds(10, 262, 77, 23);
		contentPane.add(btAdicionar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
		        modelo.removeRow(tabela.getSelectedRow());
		        tfNome.setText("");
			    tfTelefone.setText("");
			    tfEmail.setText("");
			    grupo.setSelected(null,false);
			    cboxFavorito.setSelected(false); 

			}
		});
		btExcluir.setBounds(193, 262, 77, 23);
		contentPane.add(btExcluir);
		
		
		JButton btAlterar = new JButton("Alterar");
		btAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   int linha = tabela.getSelectedRow();


			        if (linha == -1) {
			            JOptionPane.showMessageDialog(null, "Selecione um contato!");
			            return;
			        }


			        tabela.setValueAt(tfNome.getText(), linha, 0);
			        tabela.setValueAt(tfTelefone.getText(), linha, 1);
			        tabela.setValueAt(tfEmail.getText(), linha, 2);

			        String tipo;
			        if (rbProfissional.isSelected()) {
			            tipo = "Profissional";
			        } else {
			            tipo = "Pessoal";
			        }
			        tabela.setValueAt(tipo, linha, 3);

			        String favorito = cboxFavorito.isSelected() ? "Sim" : "Não";
			        tabela.setValueAt(favorito, linha, 4);


			        tfNome.setText("");
			        tfTelefone.setText("");
			        tfEmail.setText("");
			        grupo.setSelected(null, false);
			        cboxFavorito.setSelected(false);

			        JOptionPane.showMessageDialog(null, "Contato alterado!");
			        
			        tfNome.setText("");
				    tfTelefone.setText("");
				    tfEmail.setText("");
				    grupo.setSelected(null,false);
				    cboxFavorito.setSelected(false); 
				
			}
		});
		btAlterar.setBounds(94, 262, 89, 23);
		contentPane.add(btAlterar);
		
		tabela.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        int linha = tabela.getSelectedRow();

		        tfNome.setText(tabela.getValueAt(linha, 0).toString());
		        tfTelefone.setText(tabela.getValueAt(linha, 1).toString());
		        tfEmail.setText(tabela.getValueAt(linha, 2).toString());
		        String tipo = tabela.getValueAt(linha, 3).toString();

		        if (tipo.equals("Profissional")) {
		            rbProfissional.setSelected(true);
		        } else if (tipo.equals("Pessoal")) {
		            rbPessoal.setSelected(true);
		        }
		        
		        String favorito = tabela.getValueAt(linha, 4).toString();

		        if (favorito.equals("Sim")) {
		            cboxFavorito.setSelected(true);
		        } else {
		            cboxFavorito.setSelected(false);
		        }
		        

		    }
		});


	}
}
