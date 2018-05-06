package com.valoyes.useradminservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.valoyes.useradminservice.dto.User;
import com.valoyes.useradminservice.util.IDGenerator;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class UserDAOTest {

	
	
	@Test
	public void create_ShouldReturnUserIdBack() {

		// given
		UserDAO dao = new UserDAO();
		
		// powermockito
		mockStatic(IDGenerator.class);
		
		dao.createDao(new User());
		
		
		
	}

}
