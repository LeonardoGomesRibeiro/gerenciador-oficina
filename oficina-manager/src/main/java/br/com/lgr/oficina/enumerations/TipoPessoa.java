package br.com.lgr.oficina.enumerations;

public enum TipoPessoa {

	PF("pf"),
	PJ("pj");
	
	private String tipoPessoa;
	private TipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}
}
