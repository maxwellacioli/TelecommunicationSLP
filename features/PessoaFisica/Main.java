import java.util.Scanner;

public  class  Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo!!");
		System.out.println("... Cadastro de Pessoa Física ...");
		
//		Scanner reader = new Scanner(System.in);
//		System.out.println("Digite o nome: ");
//		String nome = reader.nextLine();
//		
//		System.out.println("Digite o endereço: ");
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
		
		System.out.println("... Listando serviços do produto ...");
		
		pf.listServicos();
		
	}


}
