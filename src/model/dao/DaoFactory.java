package model.dao;

import model.dao.impl.AnamneseDaoJSON;

public class DaoFactory {
	
	public static AnamneseDao createAnamneseDao(String fileJSON) {
		return new AnamneseDaoJSON(fileJSON);
	}

}

