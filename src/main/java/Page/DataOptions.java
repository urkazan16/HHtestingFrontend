package Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataOptions {

    public String getConfEmail() throws IOException {
        String rootPath = "";
        String appConfigPath = rootPath + "ServerConfig.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));

        String userLogin = appProps.getProperty("login");
        return userLogin;
    }

    public  String getConfPassword() throws IOException {
        String rootPath = "";
        String appConfigPath = rootPath + "ServerConfig.properties";
        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));

        String userPassword = appProps.getProperty("password");
        return userPassword;
    }




}
