package uninter;

import java.util.ArrayList;

public class cofrinho {
	private static final int Arraylist = 0;
	private ArrayList<Moeda> listaMoedas;
		
		public cofrinho() {
			this.listaMoedas = new ArrayList<>();
		}

		public void adicionar(Moeda moeda) {
			this.listaMoedas.add(moeda);
		}
		public void listargemMoedas(Moeda moeda) {
			if (this.listaMoedas.isEmpty()) {
				System.out.println("O cofre esta vazio!");
			}
			for(Moeda moeda1: this.listaMoedas) {
				moeda1.info();
			}
		}
		public double totalConvertido() {
			if(this.listaMoedas.isEmpty()) {
				return 0;
			}
			double valorTotal = 0;
			for(Moeda moeda : this.listaMoedas) {
				valorTotal = valorTotal + moeda.converter();
			}
			return valorTotal;
		}
		public void remover(Moeda moeda) {
			this.listaMoedas.remove(moeda);
		}
}