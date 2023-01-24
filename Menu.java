package uninter;
import java.util.Scanner;


public class Menu {
	
	private Scanner pegar;
	private cofrinho cofrinho;

	public Menu(){
		pegar = new Scanner(System.in);
		cofrinho = new cofrinho();
	}
	
	public void MenuPrincipal(){
		System.out.println("COFRINHO"+"\n1-Adicionar Moeda"+"\n2-Remover Moeda"+"\n3-Listar Moeda"+"\n4-Calcular o total convertido para Real"+"\n0-Encerrar");
		String opcaoSelecionada = pegar.next();
		//System.out.println(opcaoSelecionada);
		
		switch(opcaoSelecionada) {
		case "0":
			break;
		case "1":
			MaddMoedas();
			MenuPrincipal();
			break;
		case "2":
			MremoverMoedas();
			MenuPrincipal();
			break;
		case "3":
			cofrinho.listargemMoedas(null);
			MenuPrincipal(); 
			break;
		case "4":
			// Calculo aqui
			double resultadoConversao = cofrinho.totalConvertido();
			System.out.println("O valor total convertido para real:");
			System.out.printf("R$ %.2f %n", (resultadoConversao));
			MenuPrincipal(); 
			break;			
		default:
			System.out.println("Digite algumas das opcoes\n");
			MenuPrincipal(); //recursão
			break;
		}
	}


private void MaddMoedas() {
	System.out.println("Adicione sua moeda: ");
	System.out.println("Escolha a Moeda: ");
	System.out.println("1-Real"+"\n2-Dolar"+"\n3-Euro");
	int opcao = pegar.nextInt();
	
	//converter string para double
	System.out.println("Digite o valor: ");
	String palavraNum = pegar.next();
	palavraNum = palavraNum.replace(",",".");
	double valorMoeda = Double.parseDouble(palavraNum);
	
	Moeda moeda = null;

	if(opcao == 1){
	moeda = new Real(valorMoeda);
	}else if (opcao == 2){
	moeda = new Dolar(valorMoeda);
	}else if(opcao == 3){
	moeda = new Euro(valorMoeda);
	}else{
	System.out.println("Moeda inexistente");
	MenuPrincipal();
	System.out.println("Moeda adicionada com sucesso!");
	}

	cofrinho.adicionar(moeda);		
}

private void MremoverMoedas() {
	System.out.println("Exclua sua moeda: ");
	System.out.println("Escolha a Moeda: ");
	System.out.println("1-Real"+"\n2-Dolar"+"\n3-Euro");
	int opcao = pegar.nextInt();
	
	//converter string para double
	System.out.println("Digite o valor: ");
	String palavraNum = pegar.next();
	palavraNum = palavraNum.replace(",",".");
	double valorMoeda = Double.parseDouble(palavraNum);
	
	Moeda moeda = null;

	if(opcao == 1){
	moeda = new Real(valorMoeda);
	}else if (opcao == 2){
	moeda = new Dolar(valorMoeda);
	}else if(opcao == 3){
	moeda = new Euro(valorMoeda);
	}else{
	System.out.println("Esta moeda nao existe!");
	MenuPrincipal();

	}

	cofrinho.remover(moeda);		
}

//final Menu()
}