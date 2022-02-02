package Main;

import Herança.Caminhao;
import Herança.Carro;
import Herança.Moto;

public class main {
	
	public static void main(String[] args) {
		
		System.out.println("Veiculos Disponiveis P/ Venda Na Loja\n");
		
		Carro carro = new Carro("HB20" , "PRETO" ,"FLEX", 2020 , "HYUNDAI" , 4, "1.6");
		
		carro.status();
		System.out.println("\n==================================\n");
			
		Carro carro2 = new Carro("CRUZE" , "CINZA" ,"FLEX", 2021 , "HYUNDAI" , 4, "1.8");
		
		carro2.status();
		
		System.out.println("\n==================================\n");
		
		Moto moto = new Moto("FAN" , "VERMELHA", "GASOLINA", 2016, "150C", "FREIO ABS", "DIGITAL");
		
		moto.status();
		
		System.out.println("\n==================================\n");
		
		Moto moto2 = new Moto("TITAN" , "BRANCA", "GASOLINA", 2013, "160", "FREIO ABS", "DIGITAL");
		
		moto2.status();
		
		System.out.println("\n==================================\n");
		
		Caminhao caminhao = new Caminhao("FH-550" , "PRATA" , "DIESEL" , 2014 , 8, 2);
		
		caminhao.status();
		
		
	}
} 
