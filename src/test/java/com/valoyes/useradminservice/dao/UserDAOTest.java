package com.valoyes.useradminservice.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.valoyes.useradminservice.util.IDGenerator;
// permite importar los metodos estaticos
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class UserDAOTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
