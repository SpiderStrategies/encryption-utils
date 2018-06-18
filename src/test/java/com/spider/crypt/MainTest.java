package com.spider.crypt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidKeyException;

public class MainTest {

	@Test
	public void testMainClass() throws Exception {
		Main.main(new String[]{"my55sensitivestring","ENCRYPT","1TheWho's#Tommy3"});
	}

	@Test
	public void testBadFlagInMainClass() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			Main.main(new String[]{"my55sensitivestring","rideabike","1TheWho's#Tommy3"});
		});
	}

	@Test
	public void testShortKeyInMainClass() throws Exception {
		assertThrows(InvalidKeyException.class, () -> {
			Main.main(new String[]{"my55sensitivestring","ENCRYPT","1TheWho's#Tommy"});
		});
	}

}
