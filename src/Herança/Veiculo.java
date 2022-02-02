package Herança;

public class Veiculo {
	
	private String modelo;
	private String cor;
	private String combustivel;
	private int ano;


	
	public Veiculo(String modelo , String cor , String combustivel , int ano){
		
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.cor = cor;
		this.ano = ano;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void status() {
		System.out.println("Modelo: " + this.modelo +
				"\nCor: " + this.cor +
				"\nAno: "+ this.ano +
				"\nCombustivel: "+ this.combustivel);
	}
	
	

	
}
