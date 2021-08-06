package model.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.dao.AnamneseDao;
import model.entities.Anamnese;

public class AnamneseDaoJSON implements AnamneseDao {

	private String fileJSON;

	private Anamnese anamnese = new Anamnese();

	private List<Anamnese> listDao = new ArrayList<>();

	public AnamneseDaoJSON() {
	}

	public AnamneseDaoJSON(String fileJSON) {
		this.fileJSON = fileJSON;
	}

	@Override
	public List<Anamnese> findAll() {
		try {
			FileReader fr = new FileReader(fileJSON);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				if (line.contains("patientID")) {
					anamnese.setPacienteID(filterField(line));
				}
				if (line.contains("nome")) {
					anamnese.setNome(filterField(line));
				}
				if (line.contains("numero")) {
					anamnese.setNumero(filterField(line));
				}
				if (line.contains("tipoExame")) {
					anamnese.setTipoExame(filterField(line));
				}
				if (line.contains("modalidade")) {
					anamnese.setModalidade(filterField(line));
				}
				if (line.contains("data")) {
					anamnese.setData(filterField(line));
				}
				if (line.contains("visualizacao")) {
					anamnese.setVisualizacao(filterField(line));
				}
				if (line.contains("}")) {
					listDao.add(anamnese);
					anamnese = new Anamnese();
				}
				line = br.readLine();
			}			
			br.close();
			fr.close();
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}
		return listDao;
	}

	private String filterField(String field) {
		String str = "";
		int init = field.lastIndexOf(":");
		int end = field.lastIndexOf(",");
		str = field.substring(init + 2, end - 1);
		return str;
	}

}
