package br.com.carro;

public class ListaDeCarro {

	public class ProgramaPrincipalCarro {
		public void main(String[] args) {
			
			Carro carro1 = new Carro();
			Carro carro2 = new Carro();
			Carro carro3 = new Carro();
			Carro carro4 = new Carro();
			Carro carro5 = new Carro();
			
			carro3.setAno("2017");
			carro3.setMarca("Honda");
			carro3.setModelo("Honda Civic");
			carro3.setQtdPortas("4 Portas");
			
			carro3.setAno("2020");
			carro3.setMarca("BMW");
			carro3.setModelo("BMW 320I");
			carro3.setQtdPortas("4 Portas");
			
			carro3.setAno("1996");
			carro3.setMarca("Fiat");
			carro3.setModelo("Fiat Uno");
			carro3.setQtdPortas("2 Portas");
			
			carro4.setAno("2015");
			carro4.setMarca("Jeep");
			carro4.setModelo("Jeep Wrangler");
			carro4.setQtdPortas("4 Portas");
			
			carro5.setAno("2018");
			carro5.setMarca("Nissan");
			carro5.setModelo("Nissan Leaf");
			carro5.setQtdPortas("4 Portas");
			
			System.out.println("--- CARRO 1 ---");
			System.out.println(carro1.getAno());
			System.out.println(carro1.getMarca());
			System.out.println(carro1.getModelo());
			System.out.println(carro1.getQtdPortas());
			
			System.out.println("--- CARRO 2 ---");
			System.out.println(carro2.getAno());
			System.out.println(carro2.getMarca());
			System.out.println(carro2.getModelo());
			System.out.println(carro2.getQtdPortas());

			System.out.println("--- CARRO 3 ---");
			System.out.println(carro3.getAno());
			System.out.println(carro3.getMarca());
			System.out.println(carro3.getModelo());
			System.out.println(carro3.getQtdPortas());
		
			System.out.println("--- CARRO 4 ---");
			System.out.println(carro4.getAno());
			System.out.println(carro4.getMarca());
			System.out.println(carro4.getModelo());
			System.out.println(carro4.getQtdPortas());
		
			System.out.println("--- CARRO 5 ---");
			System.out.println(carro5.getAno());
			System.out.println(carro5.getMarca());
			System.out.println(carro5.getModelo());
			System.out.println(carro5.getQtdPortas());
		}
	}


}
