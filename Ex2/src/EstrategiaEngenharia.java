
public class EstrategiaEngenharia implements EstrategiaAgente{
	public EstrategiaEngenharia() {
		//codigo fica aqui
	}
	
	@Override
	public void executar() {
		System.out.println("combater como Engenheiro");
		combaterComoEngenheiro();
	}
	
	private void combaterComoEngenheiro() {
		System.out.println("equipamentos de Engenheiro");
	}

}
