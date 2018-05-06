package com.valoyes.useradminservice.dao;

import com.valoyes.useradminservice.dto.User;
import com.valoyes.useradminservice.util.IDGenerator;

public class UserDAO {

	public int createDao(User user) {
		int generatedId = IDGenerator.generateID();
		// acciones en la base de datos, persisting object en la base de datos, etc
		return  generatedId;
	}
}
