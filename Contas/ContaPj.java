package Contas;

public class ContaPj extends ContaPf{

	private String nomeEmpresa;
	private String numeroCNPJ;

	public ContaPj(String nomeTitular, String numeroConta, String nomeEmpresa, String numeroCNPJ) {
		super(nomeTitular, numeroConta);
		this.nomeEmpresa = nomeEmpresa;
		this.numeroCNPJ = numeroCNPJ;

	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNumeroCNPJ() {
		return numeroCNPJ;
	}

	public void setNumeroCNPJ(String numeroCNPJ) {
		this.numeroCNPJ = numeroCNPJ;
	}
	
}
