package com.spider.crypt;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public abstract class AbstractCryptor {

	Cipher cipher;
	Key aesKey;

	public AbstractCryptor(String aesKeyStr) {
		try {
			cipher = Cipher.getInstance("AES");
			aesKey = new SecretKeySpec(aesKeyStr.getBytes(), "AES");
		}
		catch(Exception e) {
			//If we can't decrypt passwords, no use in even running
			e.printStackTrace();
			System.exit(0);
		}
	}

	public abstract String doWork(String input) throws Exception ;

	protected byte[] crypt(byte[] bytes, int cryptMode) throws Exception {
		cipher.init(cryptMode, aesKey);
		return cipher.doFinal(bytes);
	}
}
