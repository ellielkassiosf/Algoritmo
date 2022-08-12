package atividadeAssincrona;

public class Veiculo {
	private int quantidadeDePneus;
	private int motor;
	private int quantidaDePassageiros;
	private String tipoDeCombustivel;
	public int getQuantidadeDePneus() {
		return quantidadeDePneus;
	}
	public void setQuantidadeDePneus(int quantidadeDePneus) {
		this.quantidadeDePneus = quantidadeDePneus;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	public int getQuantidaDePassageiros() {
		return quantidaDePassageiros;
	}
	public void setQuantidaDePassageiros(int quantidaDePassageiros) {
		this.quantidaDePassageiros = quantidaDePassageiros;
	}
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	@Override
	public String toString() {
		return "Veiculo [quantidadeDePneus=" + quantidadeDePneus + ", motor=" + motor + ", quantidaDePassageiros="
				+ quantidaDePassageiros + ", tipoDeCombustivel=" + tipoDeCombustivel + "]";
	}
	
	
}
