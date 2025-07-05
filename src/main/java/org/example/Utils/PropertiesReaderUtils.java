package org.example.Utils;

import com.google.common.annotations.VisibleForTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderUtils {

   private  static String QKART_URL_PATH = System.getProperty("user.dir")+"/src/test/resources/QKart_Staging.Properties";


    public static String readkey(String key) throws IOException {

        Properties properties = null;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(QKART_URL_PATH);
            properties = new Properties();
            properties.load(fileInputStream);
            return properties.getProperty(key);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
