package br.com.senai.pessoa;

public class Estado extends País {

   
		// ATRIBUTOS
		private String NomeDoEstado;
		public String getNomeDoEstado() {
			return NomeDoEstado;
		}
		public void setNomeDoEstado(String nomeDoEstado) {
			NomeDoEstado = nomeDoEstado;
		}
		public String getSiglaDoEstado() {
			return SiglaDoEstado;
		}
		public void setSiglaDoEstado(String siglaDoEstado) {
			SiglaDoEstado = siglaDoEstado;
		}
		private String SiglaDoEstado;
	
}
