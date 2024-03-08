
public class Perecivel extends Alimentos {
	private String tempCongelado;
	private String sazonalidade;
	private String perdaNutricional;
	
	Perecivel(String TempCongelado, String Sazonalidade, String PerdaNutricional){
		tempCongelado = TempCongelado;
		sazonalidade = Sazonalidade;
		perdaNutricional = PerdaNutricional;
		Tipo = TipoAlimento.PERECIVEL;
	}
	
	public String getTempCongelado() {
		return tempCongelado;
	}

	public void setTempCongelado(String TempCongelado) {
		tempCongelado = TempCongelado;
	}

	public String getSazonalidade() {
		return sazonalidade;
	}

	public void setSazonalidade(String Sazonalidade) {
		sazonalidade = Sazonalidade;
	}

	public String getPerdaNutricional() {
		return perdaNutricional;
	}

	public void setPerdaNutricional(String PerdaNutricional) {
		perdaNutricional = PerdaNutricional;
	}
	
	public void Exibedados(boolean Quebra) {
		super.Exibedados(false);
		System.out.print("  Tempo Congelado: " + tempCongelado + "  Sazonalidade: " + sazonalidade + "  Perda Nutricional: " + perdaNutricional + "  Tipo: " + Tipo);
		if(Quebra) {
			System.out.println();
		}
	}
}