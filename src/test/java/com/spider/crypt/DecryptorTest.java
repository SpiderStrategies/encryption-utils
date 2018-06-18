package com.spider.crypt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecryptorTest {

	@Test
	public void testDecrypt() throws Exception {
		String aesKey = "Ziggy###Stardust";
		String encryptedText = "-22_-10_109_-104_-12_-24_-10_96_-43_-50_86_40_-63_93_112_127_78_-7_-127_67_51_-9_4_95_118_-86_-76_65_-41_41_14_-45_";
		String plainText = "my23sensitivestring";
		Decryptor e = new Decryptor(aesKey);
		assertEquals(plainText, e.doWork(encryptedText));
	}

}
