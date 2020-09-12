package entidade;

public class RetornoServico {
	private int codigoRetorno; // 0 - sucesso 1 - falha
	private String mensagemRetorno; // msg da falha ocorrida
	private Usuario usuarioRetorno;
	private Peca pecaRetorno;
	private Veiculo veiculoRetorno;
	private Entrada entradaRetorno;

	public int getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	public Usuario getUsuarioRetorno() {
		return usuarioRetorno;
	}

	public void setUsuarioRetorno(Usuario usuarioRetorno) {
		this.usuarioRetorno = usuarioRetorno;
	}

	public Peca getPecaRetorno() {
		return pecaRetorno;
	}

	public void setPecaRetorno(Peca pecaRetorno) {
		this.pecaRetorno = pecaRetorno;
	}

	public Veiculo getVeiculoRetorno() {
		return veiculoRetorno;
	}

	public void setVeiculoRetorno(Veiculo veiculoRetorno) {
		this.veiculoRetorno = veiculoRetorno;
	}

	public Entrada getEntradaRetorno() {
		return entradaRetorno;
	}

	public void setEntradaRetorno(Entrada entradaRetorno) {
		this.entradaRetorno = entradaRetorno;
	}
}