package Herança;

public class Caminhao extends Veiculo {
	
	private int rodas;
	private int eixo;

	

	public Caminhao(String modelo , String cor , String combustivel , int ano, int rodas, int eixo) {
		super(modelo, cor, combustivel, ano);
		
		this.rodas = rodas;
		this.eixo = eixo;

}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getEixo() {
		return eixo;
	}

	public void setEixo(int eixo) {
		this.eixo = eixo;
	}

	public void status() {
		super.status();
		System.out.println("Quantidade de rodas: " + this.rodas +
				"\nNumero de exios: " + this.eixo);
	}
}