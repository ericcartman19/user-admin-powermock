package com.valoyes.useradminservice.dao;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.valoyes.useradminservice.dto.User;
import com.valoyes.useradminservice.util.IDGenerator;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class UserDAOTest {

	
	
	@Test
	public void create_ShouldReturnUserIdBack() {

		// given
		UserDAO dao = new UserDAO();
		
		// powermockito : normalmente no podrias hacerm mock de esta clase
		mockStatic(IDGenerator.class);
		
		// when
		when(IDGenerator.generateID()).thenReturn(1);
		int resultado = dao.createDao(new User());
		
		// then
		assertEquals(1, resultado);
		// este metodo simplemente verifica que los metodos que hemos stubbed es llamado
		verifyStatic();
	}

}
