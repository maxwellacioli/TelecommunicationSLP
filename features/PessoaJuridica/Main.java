import java.util.Scanner;

public  class  Main {
	
	
	public static void main(String[] args) {
		System.out.println("Bem vindo");
		System.out.println("... Cadastro de Pessoa Jur�dica ...");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite a raz�o social:");
		String nome = reader.nextLine();
		
		System.out.println("Digite o endere�o:");
		String endereco = reader.nextLine();
		
		System.out.println("Digite o cnpj:");
		String cnpj = reader.nextLine();
		reader.close();
		
		PessoaJuridica pj = new PessoaJuridica(nome, endereco, cnpj);
		
		Fatura fatura;
		
		fatura = new Fatura();
		
		fatura.getValor();
		
		System.out.println("Cadastro efetivado! "+ pj.getName());
		
		
		
		
	}


}
