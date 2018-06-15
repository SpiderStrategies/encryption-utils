package com.spider.crypt;

import javax.crypto.Cipher;

public class Decryptor extends AbstractCryptor {

    public Decryptor(String aesKey) {
        super(aesKey);
    }

    public String doWork(String encryptedText) throws Exception {
        String[] cryptBlocks = encryptedText.split("_");
        byte[] cryptBytes = new byte[cryptBlocks.length];
        for(int i = 0; i < cryptBlocks.length; i++) {
            cryptBytes[i] = Byte.parseByte(cryptBlocks[i]);
        }

        byte[] decrypted = crypt(cryptBytes, Cipher.DECRYPT_MODE);
        return new String(decrypted);
    }
}
