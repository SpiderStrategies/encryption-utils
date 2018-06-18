package com.spider.crypt;

import javax.crypto.Cipher;

public class Encryptor extends AbstractCryptor {

	public Encryptor(String aesKey) {
        super(aesKey);
    }

	public String doWork(String plainText) throws Exception {
		byte[] encrypted = crypt(plainText.getBytes(), Cipher.ENCRYPT_MODE);
		StringBuffer esb = new StringBuffer();
		for(int i = 0; i < encrypted.length; i++) {
			esb.append(encrypted[i] + "_");
		}
		return esb.toString();
	}
}
