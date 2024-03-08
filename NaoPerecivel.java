
public class NaoPerecivel extends Alimentos {
	private String vidaUtil;
	private String embalagem;
	
	NaoPerecivel(String VidaUtil, String Embalagem){
		vidaUtil = VidaUtil;
		embalagem = Embalagem;
		Tipo = TipoAlimento.NAO_PERECIVEL;
	}
	
	public String getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(String VidaUtil) {
		vidaUtil = VidaUtil;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String Embalagem) {
		embalagem = Embalagem;
	}
	
	public void Exibedados(boolean Quebra) {
		super.Exibedados(false);
		System.out.print("  Vida Útil: " + vidaUtil + "  Embalagem: " + embalagem + "  Tipo: " + Tipo);
		if(Quebra) {
			System.out.println();
		}
	}
}
