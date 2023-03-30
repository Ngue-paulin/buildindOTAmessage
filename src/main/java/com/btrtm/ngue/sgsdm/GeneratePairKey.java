package com.btrtm.ngue.sgsdm;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;
import org.springframework.security.web.header.writers.PermissionsPolicyHeaderWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class GeneratePairKey {

    public static void main(String [] args) throws NoSuchAlgorithmException, IOException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        // Generating de PairKey
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Generating the public and the private keis
        byte[] publicKey = keyPair.getPublic().getEncoded();
        byte[] privateKey = keyPair.getPrivate().getEncoded();

        // Generating de associated .pem file to both of the keys
        PemWriter pemWriter = new PemWriter(new OutputStreamWriter(new FileOutputStream("../sgsdm/src/main/resources/certs/publicKey.pem")));
        PemObject pemObject = new PemObject("PUBLIC KEY",publicKey);
        pemWriter.writeObject(pemObject);
        pemWriter.close();

        PemWriter pemWriter1 = new PemWriter(new OutputStreamWriter(new FileOutputStream("../sgsdm/src/main/resources/certs/privateKey.pem")));
        PemObject pemObject1 = new PemObject("PRIVATE KEY",privateKey);
        pemWriter1.writeObject(pemObject1);
        pemWriter1.close();


    }

}
