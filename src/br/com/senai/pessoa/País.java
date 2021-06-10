package br.com.senai.pessoa;

public class País extends PessoaController{

		// ATRIBUTOS
		private String NomeDoPais;
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
		private String sigla;
	

}

