package br.com.lgr.oficina.enumerations;

public enum EstadoCivil {

	
	CASADO("casado"),
	SOLTEIRO("solteiro");
	
	private String estadoCivil;
	
	EstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
