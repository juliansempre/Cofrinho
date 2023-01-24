package uninter;

//classe filha da Moeda (usar extends)
public class Real extends Moeda{
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}
	@Override
	public void info() {
		//valor = 5.0;
		System.out.println("Real - " + valor);	
		}
	
	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return this.valor;
		
	}
	@Override
	public boolean equals(Object objeto){
	if (this.getClass() != objeto.getClass()){
		return false;
	}

		Real objetoDeReal = (Real) objeto;

		if (this.valor!= objetoDeReal.valor){
		return false;
	}
		return true;

	}

}
