package GENERICS;



public class CaixaObjeto {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("segredo!!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.141516);
		
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		 
		
		
		
	}

}
