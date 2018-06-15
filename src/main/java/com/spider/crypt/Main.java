package com.spider.crypt;

public class Main {

    public static void main(String[] args) throws Exception {
        String input = args[0];
        Flag flag = Flag.valueOf(args[1]);
        String aesKey = args[2];

        AbstractCryptor cryptor = null;
        switch(flag) {
            case ENCRYPT: {
                cryptor = new Encryptor(aesKey);
                break;
            }
            case DECRYPT: {
                cryptor = new Decryptor(aesKey);
                break;
            }
        }

        System.out.println(cryptor.doWork(input));
    }

    private enum Flag {ENCRYPT, DECRYPT};
}
