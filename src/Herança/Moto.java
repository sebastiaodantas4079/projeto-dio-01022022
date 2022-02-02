package Herança;

public class Moto extends Veiculo {
	
	private String cilindrada;
	private String tipoFreio;
	private String painel;

	
	public Moto(String modelo , String cor , String combustivel , int ano, String cilindrada ,String tipoFreio, String painel ) {
		super(modelo, cor, combustivel, ano);
		
		this.cilindrada = cilindrada;
		this.painel = painel;
		this.tipoFreio = tipoFreio;
	}

	
	public String getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}


	public String getTipoFreio() {
		return tipoFreio;
	}


	public void setTipoFreio(String tipoFreio) {
		this.tipoFreio = tipoFreio;
	}


	public String getPainel() {
		return painel;
	}


	public void setPainel(String painel) {
		this.painel = painel;
	}


	public void status() {
		super.status();
		
		System.out.println("Cilindrada: " + this.cilindrada +
				"\nTipo de Freio: " + this.tipoFreio +
				"\nPainel: " + this.painel
				);
	}

}
