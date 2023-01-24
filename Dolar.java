package uninter;

public class Dolar extends Moeda {
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	@Override
	public void info() {
		//valor = 5.0;
		System.out.println("Dolar - " + valor);	
		}
	
	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return this.valor * 5.3;
		
	}
	@Override
	public boolean equals(Object objeto){
	if (this.getClass() != objeto.getClass()){
		return false;
	}

		Dolar objetoDeDolar = (Dolar) objeto;

		if (this.valor!= objetoDeDolar.valor){
		return false;
	}
		return true;

	}
}
