import java.util.Scanner;

public  class  Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo!!");
		System.out.println("... Cadastro de Pessoa F�sica ...");
		
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Digite o nome: ");
//		String nome = reader.nextLine();
//		
//		System.out.println("Digite o endere�o: ");
//		String endereco = reader.nextLine();
//		
//		System.out.println("Digite o cpf: ");
//		String cpf = reader.nextLine();
//
//		reader.close();
//		
//		/**/
//		
		PessoaFisica pf = new PessoaFisica();
		
//		pf.setNome(nome);
//		pf.setEndereco(endereco);
//		pf.setCpf(cpf);
		
		System.out.println("Cadastro efetivado! "+ pf.getNome());
		
		System.out.println("... Listando servi�os do produto ...");
		
		pf.listServicos();
		
	}


}
