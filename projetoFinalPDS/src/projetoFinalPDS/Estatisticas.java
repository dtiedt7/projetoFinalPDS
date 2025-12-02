package projetoFinalPDS;

import javax.swing.table.DefaultTableModel;

public class Estatisticas {



		private int total;
		private int profissionais;
		private int pessoais;
		private int favoritos;

		public Estatisticas(DefaultTableModel modelo) {
			calcular(modelo);
		}

		private void calcular(DefaultTableModel modelo) {

			total = modelo.getRowCount();
			profissionais = 0;
			pessoais = 0;
			favoritos = 0;

			for (int i = 0; i < total; i++) {

				String tipo = modelo.getValueAt(i, 3).toString();
				String fav = modelo.getValueAt(i, 4).toString();

				if (tipo.equals("Profissional")) {
					profissionais++;
				} else if (tipo.equals("Pessoal")) {
					pessoais++;
				}

				if (fav.equals("Sim")) {
					favoritos++;
				}
			}
		}

		public int getTotal() {
			return total;
		}

		public int getProfissionais() {
			return profissionais;
		}

		public int getPessoais() {
			return pessoais;
		}

		public int getFavoritos() {
			return favoritos;
		}
	}


