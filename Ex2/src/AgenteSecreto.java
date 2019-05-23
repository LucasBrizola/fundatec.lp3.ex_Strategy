
public class AgenteSecreto {
	private EstrategiaAgente estrategia;
	private String nome;
	private String codigo;
	
	
	public EstrategiaAgente getEstrategia() {
		return estrategia;
	}

	public String getNome() {
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public AgenteSecreto(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public void mudarEstrategia(EstrategiaAgente estrategia) {
	this.estrategia = estrategia;	
	}

	public void combater() {
		this.estrategia.executar();
	}

}