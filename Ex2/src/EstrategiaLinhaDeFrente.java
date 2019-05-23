
public class EstrategiaLinhaDeFrente implements EstrategiaAgente {
	public EstrategiaLinhaDeFrente() {
		//codigo fica aqui
	}

	@Override
	public void executar() {
		System.out.println("combater como LinhaDeFrente");
		combaterComoLinhaDeFrente();
	}

	private void combaterComoLinhaDeFrente() {
		System.out.println("equipamentos de LinhaDeFrente");
	}
}
