package Herança;

public class Carro extends Veiculo {
	
	private String marca;
	private int portas;
	private String potencia;

	
	public Carro(String modelo , String cor , String combustivel , int ano, String marca, int portas, String potencia) {
		super(modelo, cor, combustivel, ano);
		
		this.marca = marca;
		this.portas = portas;
		this.potencia = potencia;
}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	public void status() {
		super.status();
		System.out.println("Marca: " + this.marca + 
				"\nPortas: " + this.portas + 
				"\nAno: " + this.potencia);
	}
}