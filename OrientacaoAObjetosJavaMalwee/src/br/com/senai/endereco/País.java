package br.com.senai.endereco;

import br.com.senai.pessoa.PessoaController;

public class País extends PessoaController{

		// ATRIBUTOS
		private String NomeDoPais;
		private String sigla;
		
		public String getNomeDoPais() {
			return NomeDoPais;
		}
		public void setNomeDoPais(String nomeDoPais) {
			NomeDoPais = nomeDoPais;
		}
		public String getSigla() {
			return sigla;
		}
		public void setSigla(String sigla) {
			this.sigla = sigla;
		}
	

}

