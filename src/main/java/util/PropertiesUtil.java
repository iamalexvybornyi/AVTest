package util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static final String URL_PROPERTIES = "urls.properties";

    public static String getUrl(String key) {
        Properties urls = new Properties();
        try {
            urls.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(URL_PROPERTIES));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return urls.getProperty(key);
    }
}
