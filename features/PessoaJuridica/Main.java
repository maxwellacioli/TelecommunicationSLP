import java.util.Scanner;

public  class  Main {
	
	
public static void main(String[] args) {
		
		System.out.println("Bem vindo!!");
		System.out.println("\n..:: Cadastro de Pessoa Jurídica ::..\n");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite a razão social: ");
		String nome = reader.nextLine();
		
		System.out.println("Digite o endereço: ");
		String endereco = reader.nextLine();
		
		System.out.println("Digite o cnpj: ");
		String cnpj = reader.nextLine();

		int dia=0;
		do {
			System.out.println("Qual melhor dia para sua fatura: ");
			dia = reader.nextInt();
		} while (dia < 1 || dia > 31);
		
		reader.close();
//		
//		/**/
//		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome(nome);
		pj.setEndereco(endereco);
		pj.setCnpj(cnpj);
		
		System.out.println("\nCadastro efetivado! "+ pj.getNome());
		
		System.out.println("\n..:: Listando serviços do produto ::..\n");
		
		pj.listarServicos();
		
		System.out.println();
		pj.gerarFatura(dia);
				
	}


}
