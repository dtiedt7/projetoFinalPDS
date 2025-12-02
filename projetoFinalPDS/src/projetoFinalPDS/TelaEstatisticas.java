package projetoFinalPDS;

import javax.swing.*;
import java.awt.*;

public class TelaEstatisticas extends JFrame {

	private JPanel contentPane;

	public TelaEstatisticas(Estatisticas est) {

		setTitle("Estatísticas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 226, 230);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setResizable(false);

		JLabel titulo = new JLabel("Estatísticas dos Contatos");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		titulo.setBounds(10, 11, 192, 20);
		contentPane.add(titulo);

		JLabel lbTotal = new JLabel("Total de contatos: " + est.getTotal());
		lbTotal.setBounds(30, 49, 142, 20);
		contentPane.add(lbTotal);

		JLabel lbProf = new JLabel("Profissionais: " + est.getProfissionais());
		lbProf.setBounds(27, 80, 121, 20);
		contentPane.add(lbProf);

		JLabel lbPes = new JLabel("Pessoais: " + est.getPessoais());
		lbPes.setBounds(27, 111, 90, 20);
		contentPane.add(lbPes);

		JLabel lbFav = new JLabel("Favoritos: " + est.getFavoritos());
		lbFav.setBounds(27, 142, 121, 20);
		contentPane.add(lbFav);




	}
}
