
public class Aplicacao {
	public static void main(String[] args) {
		
		AgenteSecreto jamesbond = new AgenteSecreto("james bond", "007");
      /*EstrategiaEngenharia engenheiro = new EstrategiaEngenharia();
		EstrategiaLinhaDeFrente linhaDeFrente = new EstrategiaLinhaDeFrente();
		EstrategiaSuporte suporte = new EstrategiaSuporte(); */
		
		jamesbond.mudarEstrategia(new EstrategiaLinhaDeFrente());
		jamesbond.combater();
		
	}
}
