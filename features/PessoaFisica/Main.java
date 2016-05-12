import java.util.Scanner;

public  class  Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo!!");
		System.out.println("\n..:: Cadastro de Pessoa Física ::..\n");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = reader.nextLine();
		
		System.out.println("Digite o endereço: ");
		String endereco = reader.nextLine();
		
		System.out.println("Digite o cpf: ");
		String cpf = reader.nextLine();

		int dia=0;
		do {
			System.out.println("Qual melhor dia para sua fatura: ");
			dia = reader.nextInt();
		} while (dia < 1 || dia > 31);
		
		reader.close();
//		
//		/**/
//		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome(nome);
		pf.setEndereco(endereco);
		pf.setCpf(cpf);
		
		System.out.println("\nCadastro efetivado! "+ pf.getNome());
		
		System.out.println("\n..:: Listando serviços do produto ::..\n");
		
		pf.listarServicos();
		
		System.out.println();
		pf.gerarFatura(dia);
		
		
	}


}
