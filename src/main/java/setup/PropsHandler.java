package setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropsHandler {
    public static Properties getProps(String propFilePath) throws IOException {
        Properties props = new Properties();
        File file = new File(propFilePath);
        try (FileInputStream inputStream = new FileInputStream(file)) {
            props.load(inputStream);
        }
        return props;
    }
}
