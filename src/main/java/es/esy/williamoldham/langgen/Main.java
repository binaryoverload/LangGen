package es.esy.williamoldham.langgen;

import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by william on 15/05/17.
 */
public class Main {

    public static void main(String[] args) {
        Config config = new Config("lang.json");
        int i = 0;
        for (Language lang : Language.values()) {
            if (i == 10)
                break;
            String path = lang.name().toLowerCase().replaceAll("_", ".");
            System.out.println(path);
            config.set(path, " ");
            i++;
        }
        System.out.print(config.getJsonObject().toString());
    }

}
