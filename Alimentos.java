
public class Alimentos {
	public TipoAlimento Tipo;
	private int ID;
	private String Nome;
	private String Fabricacao;
	private String Validade;
	private float Preco;
	
	public TipoAlimento getTipo() {
		return Tipo;
	}

	public void setTipo(TipoAlimento tipo) {
		Tipo = tipo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getFabricacao() {
		return Fabricacao;
	}

	public void setFabricacao(String fabricacao) {
		Fabricacao = fabricacao;
	}

	public String getValidade() {
		return Validade;
	}

	public void setValidade(String validade) {
		Validade = validade;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	public void PreencheDados(int novaID, String novoNome, String novaFabricacao, String novaValidade,
			float novoPreco) {
		Nome = novoNome;
		ID = novaID;
		Fabricacao = novaFabricacao;
		Validade = novaValidade;
		Preco = novoPreco;
	}

	public void Exibedados(boolean Quebra) {
		System.out.println("");
		System.out.print("Código: " + ID + "  Nome: " + Nome + "  Fabricação: " + Fabricacao + "  Validade: " + Validade
				+ "  Preço:" + Preco);
		if (Quebra) {
			System.out.println();
		}
	}

	public void Exibedados() {
		Exibedados(true);
	}
}
