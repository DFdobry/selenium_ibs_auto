package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    private final Properties properties = new Properties();

    private static pages.TestProperties INSTANCE = null;

    private TestProperties() {
        try {
            properties.load(new FileInputStream(new File("src/test/resources/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public static pages.TestProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new pages.TestProperties();
        }
        return INSTANCE;
    }
}
