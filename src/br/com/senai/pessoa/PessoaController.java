package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n---------------- MENU ---------------");
		System.out.println("|1 -> Cadastrar pessoa              |");
		System.out.println("|2 -> Listar pessoas cadastradas    |");
		System.out.println("|3 -> Editar pessoa                 |");
		System.out.println("|4 -> Excluir pessoa                |");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());

		System.out.println("Informe seu Pais: ");
		pessoa.setNomeDoPais(tec.nextLine());
		tec.next();
		System.out.print("Informe o nome do seu Estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		tec.nextLine();

		System.out.print("Informe a sigla do seu Estado: ");
		pessoa.setSiglaDoEstado(tec.nextLine());

		System.out.print("Informe o nome da sua Cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());

		System.out.print("Informe o nome da Rua: ");
		pessoa.setRua(tec.nextLine());

		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());

		System.out.print("Informe o número da casa: ");
		pessoa.setNumeroDaCasa(tec.nextInt());

		System.out.print("Informe o Complemento: ");
		pessoa.setComplemento(tec.nextLine());
		tec.nextLine();
		return pessoa;

	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {

		if (pessoas.size() <= 0) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		System.out.println("\n");
		System.out.println("-----------PESSOAS---CADASTRADAS-----------");

		System.out.printf("| %2s | %15s | %4s | %5s | %6s | %11s| %4s | %4s | %23s | %30s | %30s | %4s | %30s | %10s |\n",
				"Id","Nome", "Ano", "Idade", "Altura", "Pais", "Sigla do Pais", "Nome do Estado", "Sigla do Estado",
				"Nome da Cidade", "Nome da Rua", "Bairro", "Número da Casa");
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf(
					"| %2d | %15s | %4d | %5d | %6.2f | %10s | %4s | %15s | %4s | %23s | %30s | %30s | %4s | %30s |\n",
					i + 1, pessoas.get(i).getNome(), pessoas.get(i).getAnoDeNascimento(), pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(), pessoas.get(i).getNomeDoPais(), pessoas.get(i).getSigla(),
					pessoas.get(i).getNomeDoEstado(), pessoas.get(i).getNomeDaCidade(), pessoas.get(i).getBairro(),
					pessoas.get(i).getNumeroDaCasa(), pessoas.get(i).getComplemento());
		}
		return pessoas;
	}

	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
		Pessoa pessoa = new Pessoa();

		listarPessoas(pessoas);

		if (pessoas.isEmpty()) {
			return null;
		}

		System.out.println("Informe a Id da Pessoa para editar: ");
		int idPessoa = tec.nextInt() ;

		System.out.println("1)Informe o nome da pessoa: ");
		System.out.println("2)Informe a data de nascimento: ");
		System.out.println("3)Informe a altura: ");

		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Editar o nome da pessoa");
			System.out.println("INforme o novo nome da pessoa: ");
			pessoa.setNome(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());

			break;

			 case 2:
			 System.out.println("---- EDITAR O ANO DE NASCIMENTO DA PESSOA CADASTRADA ----");
			 System.out.println("\n");
			 System.out.print("Informe novamente o ano de nascimento da pessoa -> ");
		
			 pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			 pessoa.setNome(tec.next());
			 pessoa.setAltura(pessoas.get(idPessoa).getAltura());

			 pessoas.set(idPessoa, pessoa);//

			 break;

			 case 3:
			 System.out.println("--- EDITAR A ALTURA DA PESSOA ---");
			 System.out.print("Informe o novo valor unitário do produto: R$");
			 pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			 pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			 pessoa.setNome(tec.next());
			
			 pessoas.set(idPessoa, pessoa);

			break;

		default:
			System.out.println("Opção inválida");

			break;

		}
		return pessoas;
	}

	public void excluirPessoa(List<Pessoa> pessoas) {

		listarPessoas(pessoas);

		if (pessoas.isEmpty()) {
			return;
		}

		System.out.println("--- EXCLUIR PESSOA ---");

		System.out.println("Informe o Id da pessoa para excluir: ");
		int idPessoa = tec.nextInt() ;

		if (pessoas.size() <= idPessoa) {
			System.out.println("Pessoa não cadastrado.");
			return;
		}
		pessoas.remove(idPessoa);
	}

}