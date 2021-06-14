package br.com.senai.endereco;

public class Estado extends País {

   
		// ATRIBUTOS
		private String NomeDoEstado;
		private String SiglaDoEstado;
		
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
	
}
