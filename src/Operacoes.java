
public class Operacoes {
	int num1, num2;
	
	Operacoes(int num, int num2){
		this.num1 = num;
		this.num2 = num2;
	}
	
	int soma() {
		return num1 + num2; 
	}
	
	int subtracao() {
		return num1 - num2;	
		
	}
	
	String divisao() {
		double novoUm = (double) num1;
		double novoDois = (double) num2;
		
				
		return novoDois == 0 ? "Não tem divisão por 0" :  Double.toString(novoUm / novoDois);
	}
	

	int multiplicacao() {
		return num1 * num2;
	}
	
	
	
	
}
