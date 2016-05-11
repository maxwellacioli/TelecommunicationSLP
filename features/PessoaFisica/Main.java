import java.util.Scanner;

public  class  Main {
	
	
	public static void main(String[] args) {
		System.out.println("Bem vindo");
		System.out.println("... Cadastro de Pessoa Física ...");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = reader.nextLine();
		
		System.out.println("Digite o endereço: ");
		String endereco = reader.nextLine();
		
		System.out.println("Digite o cpf: ");
		int cpf = reader.nextInt();

		reader.close();
		
		
		PessoaFisica pf = new PessoaFisica(nome, endereco, cpf);
		
		Fatura fatura;
				
		fatura = new Fatura();
		
		fatura.getValor();
		
		System.out.println("Cadastro efetivado! "+ pf.getName());
		
		
	}


}
