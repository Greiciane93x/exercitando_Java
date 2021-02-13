package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

class Banco {
	
	private static List<Empresa> lista = new ArrayList<>(); 
	
	static {
		
		Empresa  empresa = new Empresa(); 
		empresa.setNome("Coti");
		Empresa empresa2 = new Empresa(); 
		empresa2.setNome("Caelum");
		Empresa empresa3 = new Empresa(); 
		empresa3.setNome("Mais uma aqui");
		Empresa empresa4 = new Empresa(); 
		empresa4.setNome("Mais uma aqui chefia");
		Banco.lista.add(empresa); 
		Banco.lista.add(empresa2); 
		Banco.lista.add(empresa3); 
		Banco.lista.add(empresa4); 
	}
	

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa); 
		
	}
	
	public List<Empresa> getEmpresas(){
			return Banco.lista; 
		
	}

}
