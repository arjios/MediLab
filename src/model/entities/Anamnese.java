package model.entities;

import java.io.Serializable;

public class Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String pacienteID;
	private String nome;
	private String numero;
	private String tipoExame;
	private String modalidade;
	private String data;
	private String visualizacao;
	
	public Anamnese() {
	}

	public Anamnese(String pacienteID, String nome, String numero, String tipoExame, String modalidade, String data,
			String visualizacao) {
		this.pacienteID = pacienteID;
		this.nome = nome;
		this.numero = numero;
		this.tipoExame = tipoExame;
		this.modalidade = modalidade;
		this.data = data;
		this.visualizacao = visualizacao;
	}

	public String getPacienteID() {
		return pacienteID;
	}

	public void setPacienteID(String pacienteID) {
		this.pacienteID = pacienteID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getVisualizacao() {
		return visualizacao;
	}

	public void setVisualizacao(String visualizacao) {
		this.visualizacao = visualizacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anamnese other = (Anamnese) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Anamnese [pacienteID=" + pacienteID + ", nome=" + nome + ", numero=" + numero + ", tipoExame="
				+ tipoExame + ", modalidade=" + modalidade + ", data=" + data + ", visualizacao=" + visualizacao + "]";
	}

}
